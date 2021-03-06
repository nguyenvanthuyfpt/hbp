/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.gov.hoabinh.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.Attachment;
import vn.gov.hoabinh.model.AttachmentModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Attachment service. Represents a row in the &quot;Attachment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AttachmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AttachmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttachmentImpl
 * @see Attachment
 * @see AttachmentModel
 * @generated
 */
@ProviderType
public class AttachmentModelImpl extends BaseModelImpl<Attachment>
	implements AttachmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a attachment model instance should use the {@link Attachment} interface instead.
	 */
	public static final String TABLE_NAME = "Attachment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "attachmentId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "entryId", Types.BIGINT },
			{ "entryClass", Types.VARCHAR },
			{ "fileEntryId", Types.BIGINT },
			{ "folderId", Types.BIGINT },
			{ "fileName", Types.VARCHAR },
			{ "imageId", Types.BIGINT },
			{ "extension", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("attachmentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("entryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("entryClass", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fileEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("folderId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fileName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("imageId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("extension", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table Attachment (attachmentId LONG not null primary key,groupId LONG,companyId LONG,entryId LONG,entryClass VARCHAR(75) null,fileEntryId LONG,folderId LONG,fileName VARCHAR(75) null,imageId LONG,extension VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Attachment";
	public static final String ORDER_BY_JPQL = " ORDER BY attachment.attachmentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Attachment.attachmentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.Attachment"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.Attachment"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.Attachment"),
			true);
	public static final long ENTRYCLASS_COLUMN_BITMASK = 1L;
	public static final long ENTRYID_COLUMN_BITMASK = 2L;
	public static final long FILEENTRYID_COLUMN_BITMASK = 4L;
	public static final long FILENAME_COLUMN_BITMASK = 8L;
	public static final long FOLDERID_COLUMN_BITMASK = 16L;
	public static final long IMAGEID_COLUMN_BITMASK = 32L;
	public static final long ATTACHMENTID_COLUMN_BITMASK = 64L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.Attachment"));

	public AttachmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _attachmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAttachmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _attachmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Attachment.class;
	}

	@Override
	public String getModelClassName() {
		return Attachment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attachmentId", getAttachmentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("entryId", getEntryId());
		attributes.put("entryClass", getEntryClass());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("folderId", getFolderId());
		attributes.put("fileName", getFileName());
		attributes.put("imageId", getImageId());
		attributes.put("extension", getExtension());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attachmentId = (Long)attributes.get("attachmentId");

		if (attachmentId != null) {
			setAttachmentId(attachmentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		String entryClass = (String)attributes.get("entryClass");

		if (entryClass != null) {
			setEntryClass(entryClass);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Long folderId = (Long)attributes.get("folderId");

		if (folderId != null) {
			setFolderId(folderId);
		}

		String fileName = (String)attributes.get("fileName");

		if (fileName != null) {
			setFileName(fileName);
		}

		Long imageId = (Long)attributes.get("imageId");

		if (imageId != null) {
			setImageId(imageId);
		}

		String extension = (String)attributes.get("extension");

		if (extension != null) {
			setExtension(extension);
		}
	}

	@Override
	public long getAttachmentId() {
		return _attachmentId;
	}

	@Override
	public void setAttachmentId(long attachmentId) {
		_attachmentId = attachmentId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getEntryId() {
		return _entryId;
	}

	@Override
	public void setEntryId(long entryId) {
		_columnBitmask |= ENTRYID_COLUMN_BITMASK;

		if (!_setOriginalEntryId) {
			_setOriginalEntryId = true;

			_originalEntryId = _entryId;
		}

		_entryId = entryId;
	}

	public long getOriginalEntryId() {
		return _originalEntryId;
	}

	@Override
	public String getEntryClass() {
		if (_entryClass == null) {
			return StringPool.BLANK;
		}
		else {
			return _entryClass;
		}
	}

	@Override
	public void setEntryClass(String entryClass) {
		_columnBitmask |= ENTRYCLASS_COLUMN_BITMASK;

		if (_originalEntryClass == null) {
			_originalEntryClass = _entryClass;
		}

		_entryClass = entryClass;
	}

	public String getOriginalEntryClass() {
		return GetterUtil.getString(_originalEntryClass);
	}

	@Override
	public long getFileEntryId() {
		return _fileEntryId;
	}

	@Override
	public void setFileEntryId(long fileEntryId) {
		_columnBitmask |= FILEENTRYID_COLUMN_BITMASK;

		if (!_setOriginalFileEntryId) {
			_setOriginalFileEntryId = true;

			_originalFileEntryId = _fileEntryId;
		}

		_fileEntryId = fileEntryId;
	}

	public long getOriginalFileEntryId() {
		return _originalFileEntryId;
	}

	@Override
	public long getFolderId() {
		return _folderId;
	}

	@Override
	public void setFolderId(long folderId) {
		_columnBitmask |= FOLDERID_COLUMN_BITMASK;

		if (!_setOriginalFolderId) {
			_setOriginalFolderId = true;

			_originalFolderId = _folderId;
		}

		_folderId = folderId;
	}

	public long getOriginalFolderId() {
		return _originalFolderId;
	}

	@Override
	public String getFileName() {
		if (_fileName == null) {
			return StringPool.BLANK;
		}
		else {
			return _fileName;
		}
	}

	@Override
	public void setFileName(String fileName) {
		_columnBitmask |= FILENAME_COLUMN_BITMASK;

		if (_originalFileName == null) {
			_originalFileName = _fileName;
		}

		_fileName = fileName;
	}

	public String getOriginalFileName() {
		return GetterUtil.getString(_originalFileName);
	}

	@Override
	public long getImageId() {
		return _imageId;
	}

	@Override
	public void setImageId(long imageId) {
		_columnBitmask |= IMAGEID_COLUMN_BITMASK;

		if (!_setOriginalImageId) {
			_setOriginalImageId = true;

			_originalImageId = _imageId;
		}

		_imageId = imageId;
	}

	public long getOriginalImageId() {
		return _originalImageId;
	}

	@Override
	public String getExtension() {
		if (_extension == null) {
			return StringPool.BLANK;
		}
		else {
			return _extension;
		}
	}

	@Override
	public void setExtension(String extension) {
		_extension = extension;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Attachment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Attachment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Attachment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AttachmentImpl attachmentImpl = new AttachmentImpl();

		attachmentImpl.setAttachmentId(getAttachmentId());
		attachmentImpl.setGroupId(getGroupId());
		attachmentImpl.setCompanyId(getCompanyId());
		attachmentImpl.setEntryId(getEntryId());
		attachmentImpl.setEntryClass(getEntryClass());
		attachmentImpl.setFileEntryId(getFileEntryId());
		attachmentImpl.setFolderId(getFolderId());
		attachmentImpl.setFileName(getFileName());
		attachmentImpl.setImageId(getImageId());
		attachmentImpl.setExtension(getExtension());

		attachmentImpl.resetOriginalValues();

		return attachmentImpl;
	}

	@Override
	public int compareTo(Attachment attachment) {
		long primaryKey = attachment.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Attachment)) {
			return false;
		}

		Attachment attachment = (Attachment)obj;

		long primaryKey = attachment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		AttachmentModelImpl attachmentModelImpl = this;

		attachmentModelImpl._originalEntryId = attachmentModelImpl._entryId;

		attachmentModelImpl._setOriginalEntryId = false;

		attachmentModelImpl._originalEntryClass = attachmentModelImpl._entryClass;

		attachmentModelImpl._originalFileEntryId = attachmentModelImpl._fileEntryId;

		attachmentModelImpl._setOriginalFileEntryId = false;

		attachmentModelImpl._originalFolderId = attachmentModelImpl._folderId;

		attachmentModelImpl._setOriginalFolderId = false;

		attachmentModelImpl._originalFileName = attachmentModelImpl._fileName;

		attachmentModelImpl._originalImageId = attachmentModelImpl._imageId;

		attachmentModelImpl._setOriginalImageId = false;

		attachmentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Attachment> toCacheModel() {
		AttachmentCacheModel attachmentCacheModel = new AttachmentCacheModel();

		attachmentCacheModel.attachmentId = getAttachmentId();

		attachmentCacheModel.groupId = getGroupId();

		attachmentCacheModel.companyId = getCompanyId();

		attachmentCacheModel.entryId = getEntryId();

		attachmentCacheModel.entryClass = getEntryClass();

		String entryClass = attachmentCacheModel.entryClass;

		if ((entryClass != null) && (entryClass.length() == 0)) {
			attachmentCacheModel.entryClass = null;
		}

		attachmentCacheModel.fileEntryId = getFileEntryId();

		attachmentCacheModel.folderId = getFolderId();

		attachmentCacheModel.fileName = getFileName();

		String fileName = attachmentCacheModel.fileName;

		if ((fileName != null) && (fileName.length() == 0)) {
			attachmentCacheModel.fileName = null;
		}

		attachmentCacheModel.imageId = getImageId();

		attachmentCacheModel.extension = getExtension();

		String extension = attachmentCacheModel.extension;

		if ((extension != null) && (extension.length() == 0)) {
			attachmentCacheModel.extension = null;
		}

		return attachmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{attachmentId=");
		sb.append(getAttachmentId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", entryId=");
		sb.append(getEntryId());
		sb.append(", entryClass=");
		sb.append(getEntryClass());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append(", folderId=");
		sb.append(getFolderId());
		sb.append(", fileName=");
		sb.append(getFileName());
		sb.append(", imageId=");
		sb.append(getImageId());
		sb.append(", extension=");
		sb.append(getExtension());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.Attachment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>attachmentId</column-name><column-value><![CDATA[");
		sb.append(getAttachmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>entryId</column-name><column-value><![CDATA[");
		sb.append(getEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>entryClass</column-name><column-value><![CDATA[");
		sb.append(getEntryClass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>folderId</column-name><column-value><![CDATA[");
		sb.append(getFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileName</column-name><column-value><![CDATA[");
		sb.append(getFileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imageId</column-name><column-value><![CDATA[");
		sb.append(getImageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extension</column-name><column-value><![CDATA[");
		sb.append(getExtension());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Attachment.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Attachment.class
		};
	private long _attachmentId;
	private long _groupId;
	private long _companyId;
	private long _entryId;
	private long _originalEntryId;
	private boolean _setOriginalEntryId;
	private String _entryClass;
	private String _originalEntryClass;
	private long _fileEntryId;
	private long _originalFileEntryId;
	private boolean _setOriginalFileEntryId;
	private long _folderId;
	private long _originalFolderId;
	private boolean _setOriginalFolderId;
	private String _fileName;
	private String _originalFileName;
	private long _imageId;
	private long _originalImageId;
	private boolean _setOriginalImageId;
	private String _extension;
	private long _columnBitmask;
	private Attachment _escapedModel;
}