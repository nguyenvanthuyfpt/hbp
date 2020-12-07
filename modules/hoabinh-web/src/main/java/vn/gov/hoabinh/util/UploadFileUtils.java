package vn.gov.hoabinh.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.exception.DuplicateFileEntryException;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.portal.kernel.exception.NoSuchResourcePermissionException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceAction;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.RoleConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.ResourceActionLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

public class UploadFileUtils {

	static Log log = LogFactoryUtil.getLog(UploadFileUtils.class);	

	private static final String FOLDER_NAME_BY_TIME = "HHmmss ddMMyyyy";
	private static long FILE_STORE_ID = 0;
	private static long companyId = PortalUtil.getDefaultCompanyId();

	public static List<FileEntry> upload(UploadPortletRequest uploadRequest, ActionRequest request, long folderRootId, long userId, String keyUpload) {
		List<FileEntry> listFileEntries = new ArrayList<FileEntry>();
		Map<String, FileItem[]> files = uploadRequest.getMultipartParameterMap();
		long folderId = 0;
		Folder root = null;
		try {
			// Create Folder
			if (folderRootId == 0) {
				root = isExitsOrCreateFolder(request, PortalUtil.getThemeDisplay(request),
						getDefaultPortletTitle(request), folderRootId);
				folderId = isExitsOrCreateFolder(root.getFolderId(), userId, request);
			} else {
				root = DLAppServiceUtil.getFolder(folderRootId);
			}

			// Upload File
			if (Validator.isNotNull(root)) {
				for (Entry<String, FileItem[]> filesUpload : files.entrySet()) {
					if (keyUpload.equals(filesUpload.getKey())) {
						FileItem items[] = filesUpload.getValue();					
						if (Validator.isNotNull(filesUpload)) {
							for (FileItem fileItem : items) {
								FileEntry fileEntry = null;
								if (Validator.isNotNull(fileItem) && fileItem.getSize()>0) {
									fileEntry = addAttachFile(fileItem, request, PortalUtil.getThemeDisplay(request), fileItem.getFileName(), folderId);
								}
								
								if (Validator.isNotNull(fileEntry)) {
									listFileEntries.add(fileEntry);
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			log.error(e);
			SessionErrors.add(request, "upload-error");
		}

		Collections.sort(listFileEntries, new Comparator<FileEntry>() {
			@Override
			public int compare(FileEntry file1, FileEntry file2) {
				return file1.getMimeType().compareTo(file2.getMimeType());
			}

		});
		return listFileEntries;
	}

	public static long isExitsOrCreateFolder(long folderRootId, long userId, PortletRequest request) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		User user = UserLocalServiceUtil.getUser(userId);
		Folder folder = null;
		if (user != null) {
			String year = String.valueOf(cal.get(Calendar.YEAR));
			folder = isExitsOrCreateFolder(year, folderRootId, user, request);
			folderRootId = folder.getFolderId();
			if (folder != null) {
				String month = String.valueOf(cal.get(Calendar.MONTH) + 1);
				folder = isExitsOrCreateFolder(month, folderRootId, user, request);
				folderRootId = folder.getFolderId();
				if (folder != null) {
					String date = String.valueOf(cal.get(Calendar.DATE));
					folder = isExitsOrCreateFolder(date, folderRootId, user, request);
					if (folder != null) {
						if (hasPermissions(folder.getFolderId(), userId) == false) {
							setFolderPermissions(folder, "", userId);
						}
						return folder.getFolderId();
					}
				}
			}
		}
		return 0;
	}

	public static boolean hasPermissions(long folderId, long userId) {
		boolean retval = false;
		ResourcePermission resourcePermission = null;
		try {
			long[] roleIds = UserLocalServiceUtil.getRolePrimaryKeys(userId);
			if (Validator.isNotNull(roleIds)) {
				for (int i = 0; i < roleIds.length; i++) {
					resourcePermission = ResourcePermissionLocalServiceUtil.getResourcePermission(companyId,
							DLFolder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, String.valueOf(folderId),
							roleIds[i]);
					retval = Validator.isNotNull(resourcePermission) ? true : false;

					if (retval)
						break;
				}
			}
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			log.error(e.toString());
		}
		return retval;
	}

	private static Folder isExitsOrCreateFolder(String folderName, long folderRootId, User user,
			PortletRequest request) {
		ThemeDisplay themeDisplay = PortalUtil.getThemeDisplay(request);
		Folder folder = null;
		try {
			folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), folderRootId, folderName);
		} catch (PortalException | SystemException e) {
			log.error("Folder " + folderName + " not exits");
		}
		if (folder != null) {
			return folder;
		} else {
			return createFolder(folderName, folderRootId, request, user, themeDisplay);
		}
	}

	private static Folder isExitsOrCreateFolder(PortletRequest request, ThemeDisplay themeDisplay, String folderName,
			long parentId) throws PortalException {
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		Folder folder = null;
		try {
			folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), parentId, folderName);
		} catch (Exception e) {
			if (folder == null) {
				User user = UserLocalServiceUtil.getUser(userId);
				try {
					folder = addFolder(user, folderName, parentId, groupId, getServiceContext(user.getUserId()));
				} catch (Exception ex) {
					if (folder == null) {
						try {
							folder = addFolder(user, getDateTime(), parentId, groupId, getServiceContext(user.getUserId()));
						} catch (Exception exp) {
							log.error(exp);
						}
					}
				}
			}
		}
		return folder;
	}

	private static Folder createFolder(String folderName, long folderRootId, PortletRequest request, User user,
			ThemeDisplay themeDisplay) {
		ServiceContext serviceContext;
		try {
			serviceContext = PortalUtil.getServiceContext(user.getUserId(), themeDisplay.getCompanyId());
			PrincipalThreadLocal.setName(user.getUserId());
			PermissionChecker permissionChecker;
			permissionChecker = PermissionCheckerFactoryUtil.create(user);
			PermissionThreadLocal.setPermissionChecker(permissionChecker);
			Folder folder = DLAppServiceUtil.addFolder(themeDisplay.getScopeGroupId(), folderRootId, folderName,
					folderName, serviceContext);
			return folder;
		} catch (Exception e) {
			log.error(e.toString());
		}
		return null;
	}

	private static Folder addFolder(User user, String name, long parentId, long groupId, ServiceContext serviceContext)
			throws PortalException {
		try {
			PrincipalThreadLocal.setName(user.getUserId());
			PermissionChecker permissionChecker;
			permissionChecker = PermissionCheckerFactoryUtil.create(user);
			PermissionThreadLocal.setPermissionChecker(permissionChecker);
			return DLAppServiceUtil.addFolder(groupId, parentId, name, name, serviceContext);
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	private static User getAdmin() {
		long companyId = PortalUtil.getDefaultCompanyId();
		try {
			Role role = getRoleById(companyId, RoleConstants.ADMINISTRATOR);
			if (role != null) {
				for (User admin : UserLocalServiceUtil.getRoleUsers(role.getRoleId())) {
					return admin;
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return null;
	}

	private static Role getRoleById(final long companyId, final String roleStrId) {
		Role role = null;
		try {
			role = RoleLocalServiceUtil.getRole(companyId, roleStrId);
		} catch (Exception e) {
			log.error(e);
		}
		return role;
	}

	private static File[] removeNullFile(File[] array) {
		List<File> result = new ArrayList<File>();

		for (int i = 0; i < array.length; i++) {
			if (Validator.isNotNull(array[i])) {
				result.add(array[i]);
			}
		}
		return (File[]) result.toArray(new File[result.size()]);
	}

	private static String[] removeNullString(String[] array) {
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			if (Validator.isNotNull(array[i])) {
				result.add(array[i]);
			}
		}
		return (String[]) result.toArray(new String[result.size()]);
	}

	private static FileEntry addAttachFile(FileItem file, PortletRequest request, ThemeDisplay themeDisplay,
			String title, long folderId) {
		File newFile = new File(String.valueOf(file.getStoreLocation()));
		String mimeType = "";
		ServiceContext serviceContext = null;
		try {
			mimeType = MimeTypesUtil.getContentType(file.getInputStream(), file.getFieldName());
			byte[] imageBytes = FileUtil.getBytes(newFile);
			InputStream is = new ByteArrayInputStream(imageBytes);
			serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), request);
			serviceContext.setWorkflowAction(WorkflowConstants.ACTION_PUBLISH);
			serviceContext.setAddGuestPermissions(true);

			FileEntry fileEntry = DLAppServiceUtil.addFileEntry(themeDisplay.getScopeGroupId(), folderId, title,
					mimeType, title, title, StringPool.BLANK, is, file.getSize(), serviceContext);

			if (fileEntry != null) {
				log.info("Add fileEntry " + fileEntry.getFileName() + " success");
				return fileEntry;
			}
		} catch (Exception e) {
			if (e instanceof DuplicateFileEntryException) {
				try {
					byte[] imageBytes = FileUtil.getBytes(newFile);
					InputStream is = new ByteArrayInputStream(imageBytes);
					String fileName = title + "-" + getDateTime();
					FileEntry fileEntry = DLAppServiceUtil.addFileEntry(themeDisplay.getScopeGroupId(), folderId,
							fileName, mimeType, fileName, fileName, StringPool.BLANK, is, file.getSize(),
							serviceContext);

					if (fileEntry != null) {
						return fileEntry;
					}

				} catch (Exception ex) {
					try {
						return DLAppServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), folderId, title);
					} catch (PortalException | SystemException exp) {
						log.error(exp);
					}
				}
			}
		}
		return null;
	}

	private static String getDefaultPortletTitle(PortletRequest request) {
		String portletId = (String) request.getAttribute(WebKeys.PORTLET_ID);
		return formatFolderName(LanguageUtil.get(LocaleUtil.fromLanguageId("vi_VN"), "javax.portlet.title." + portletId));
	}

	private static String formatFolderName(String symbol) {
		return symbol.replaceAll("[\\/?%*:|\"<>]", "-");
	}

	private static ServiceContext getServiceContext(long userId) throws Exception {
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setWorkflowAction(WorkflowConstants.ACTION_PUBLISH);
		serviceContext.setAddGuestPermissions(true);
		serviceContext.setPortletPreferencesIds(null);
		serviceContext.setCompanyId(companyId);
		serviceContext.setUserId(userId);
		return serviceContext;
	}

	private static String getDateTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmssSSS");
		return sdf.format(date);
	}

	private static void setFilePermissions(FileEntry fileEntry) throws Exception {
		ResourcePermission resourcePermission = null;
		final Role siteMemberRole = RoleLocalServiceUtil.getRole(fileEntry.getCompanyId(), RoleConstants.GUEST);
		final Role ownerRole = RoleLocalServiceUtil.getRole(fileEntry.getCompanyId(), RoleConstants.OWNER);

		ResourceAction resourceAction = ResourceActionLocalServiceUtil.getResourceAction(DLFileEntry.class.getName(),
				ActionKeys.VIEW);
		try {
			resourcePermission = ResourcePermissionLocalServiceUtil.getResourcePermission(fileEntry.getCompanyId(),
					DLFileEntry.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
					String.valueOf(fileEntry.getPrimaryKey()), ownerRole.getRoleId());

			if (Validator.isNotNull(resourcePermission)) {
				resourcePermission.setRoleId(siteMemberRole.getRoleId());
				resourcePermission.setActionIds(resourceAction.getBitwiseValue());
				ResourcePermissionLocalServiceUtil.updateResourcePermission(resourcePermission);
			}
		} catch (NoSuchResourcePermissionException e) {
			log.error(e);
		}
	}

	private static void setFolderPermissions(Folder folder, String roleName, long userId) throws Exception {
		ResourcePermission resourcePermission = null;
		ResourceAction resourceAction = ResourceActionLocalServiceUtil.getResourceAction(DLFolder.class.getName(),
				ActionKeys.ADD_DOCUMENT);
		Role role = null;

		if (userId > 0) {
			List<Role> listRole = RoleLocalServiceUtil.getUserRoles(userId);
			for (Role r : listRole) {
				if (!RoleConstants.USER.equals(r.getName())) {
					long resourcePermissionId = CounterLocalServiceUtil.increment(ResourcePermission.class.getName());
					resourcePermission = ResourcePermissionLocalServiceUtil
							.createResourcePermission(resourcePermissionId);
					resourcePermission.setCompanyId(companyId);
					resourcePermission.setName(DLFolder.class.getName());
					resourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
					resourcePermission.setPrimKey(String.valueOf(folder.getFolderId()));
					resourcePermission.setPrimaryKey(folder.getFolderId());
					resourcePermission.setResourcePermissionId(resourcePermissionId);
					resourcePermission.setRoleId(r.getRoleId());
					resourcePermission.setActionIds(resourceAction.getBitwiseValue());
					resourcePermission.setViewActionId(true);
					ResourcePermissionLocalServiceUtil.addResourcePermission(resourcePermission);
				}
			}
		} else {
			role = getRoleById(companyId, roleName);
			long resourcePermissionId = CounterLocalServiceUtil.increment(ResourcePermission.class.getName());
			resourcePermission = ResourcePermissionLocalServiceUtil.createResourcePermission(resourcePermissionId);
			resourcePermission.setCompanyId(companyId);
			resourcePermission.setName(DLFolder.class.getName());
			resourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
			resourcePermission.setPrimKey(String.valueOf(folder.getFolderId()));
			resourcePermission.setPrimaryKey(folder.getFolderId());
			resourcePermission.setRoleId(role.getRoleId());
			resourcePermission.setActionIds(resourceAction.getBitwiseValue());
			resourcePermission.setViewActionId(true);
			ResourcePermissionLocalServiceUtil.addResourcePermission(resourcePermission);
		}
	}
}