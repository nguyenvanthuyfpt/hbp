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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.VcmsThread;
import vn.gov.hoabinh.model.VcmsThreadModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VcmsThread service. Represents a row in the &quot;VcmsThread&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VcmsThreadModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsThreadImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsThreadImpl
 * @see VcmsThread
 * @see VcmsThreadModel
 * @generated
 */
@ProviderType
public class VcmsThreadModelImpl extends BaseModelImpl<VcmsThread>
	implements VcmsThreadModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vcms thread model instance should use the {@link VcmsThread} interface instead.
	 */
	public static final String TABLE_NAME = "VcmsThread";
	public static final Object[][] TABLE_COLUMNS = {
			{ "threadId", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdByUser", Types.VARCHAR },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "modifiedByUser", Types.VARCHAR },
			{ "title", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "hasImage", Types.BOOLEAN },
			{ "image", Types.VARCHAR },
			{ "language", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("threadId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdByUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedByUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hasImage", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("image", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("language", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table VcmsThread (threadId VARCHAR(75) not null primary key,groupId LONG,companyId LONG,createdDate DATE null,createdByUser VARCHAR(75) null,modifiedDate DATE null,modifiedByUser VARCHAR(75) null,title VARCHAR(75) null,description VARCHAR(75) null,hasImage BOOLEAN,image VARCHAR(75) null,language VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table VcmsThread";
	public static final String ORDER_BY_JPQL = " ORDER BY vcmsThread.createdDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VcmsThread.createdDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.VcmsThread"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.VcmsThread"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.VcmsThread"),
			true);
	public static final long GROUPID_COLUMN_BITMASK = 1L;
	public static final long LANGUAGE_COLUMN_BITMASK = 2L;
	public static final long CREATEDDATE_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.VcmsThread"));

	public VcmsThreadModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _threadId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setThreadId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _threadId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsThread.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsThread.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threadId", getThreadId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("hasImage", getHasImage());
		attributes.put("image", getImage());
		attributes.put("language", getLanguage());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String threadId = (String)attributes.get("threadId");

		if (threadId != null) {
			setThreadId(threadId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean hasImage = (Boolean)attributes.get("hasImage");

		if (hasImage != null) {
			setHasImage(hasImage);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}
	}

	@Override
	public String getThreadId() {
		if (_threadId == null) {
			return StringPool.BLANK;
		}
		else {
			return _threadId;
		}
	}

	@Override
	public void setThreadId(String threadId) {
		_threadId = threadId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
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
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_columnBitmask = -1L;

		_createdDate = createdDate;
	}

	@Override
	public String getCreatedByUser() {
		if (_createdByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdByUser;
		}
	}

	@Override
	public void setCreatedByUser(String createdByUser) {
		_createdByUser = createdByUser;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getModifiedByUser() {
		if (_modifiedByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _modifiedByUser;
		}
	}

	@Override
	public void setModifiedByUser(String modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public boolean getHasImage() {
		return _hasImage;
	}

	@Override
	public boolean isHasImage() {
		return _hasImage;
	}

	@Override
	public void setHasImage(boolean hasImage) {
		_hasImage = hasImage;
	}

	@Override
	public String getImage() {
		if (_image == null) {
			return StringPool.BLANK;
		}
		else {
			return _image;
		}
	}

	@Override
	public void setImage(String image) {
		_image = image;
	}

	@Override
	public String getLanguage() {
		if (_language == null) {
			return StringPool.BLANK;
		}
		else {
			return _language;
		}
	}

	@Override
	public void setLanguage(String language) {
		_columnBitmask |= LANGUAGE_COLUMN_BITMASK;

		if (_originalLanguage == null) {
			_originalLanguage = _language;
		}

		_language = language;
	}

	public String getOriginalLanguage() {
		return GetterUtil.getString(_originalLanguage);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VcmsThread toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VcmsThread)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VcmsThreadImpl vcmsThreadImpl = new VcmsThreadImpl();

		vcmsThreadImpl.setThreadId(getThreadId());
		vcmsThreadImpl.setGroupId(getGroupId());
		vcmsThreadImpl.setCompanyId(getCompanyId());
		vcmsThreadImpl.setCreatedDate(getCreatedDate());
		vcmsThreadImpl.setCreatedByUser(getCreatedByUser());
		vcmsThreadImpl.setModifiedDate(getModifiedDate());
		vcmsThreadImpl.setModifiedByUser(getModifiedByUser());
		vcmsThreadImpl.setTitle(getTitle());
		vcmsThreadImpl.setDescription(getDescription());
		vcmsThreadImpl.setHasImage(getHasImage());
		vcmsThreadImpl.setImage(getImage());
		vcmsThreadImpl.setLanguage(getLanguage());

		vcmsThreadImpl.resetOriginalValues();

		return vcmsThreadImpl;
	}

	@Override
	public int compareTo(VcmsThread vcmsThread) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(), vcmsThread.getCreatedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsThread)) {
			return false;
		}

		VcmsThread vcmsThread = (VcmsThread)obj;

		String primaryKey = vcmsThread.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
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
		VcmsThreadModelImpl vcmsThreadModelImpl = this;

		vcmsThreadModelImpl._originalGroupId = vcmsThreadModelImpl._groupId;

		vcmsThreadModelImpl._setOriginalGroupId = false;

		vcmsThreadModelImpl._originalLanguage = vcmsThreadModelImpl._language;

		vcmsThreadModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VcmsThread> toCacheModel() {
		VcmsThreadCacheModel vcmsThreadCacheModel = new VcmsThreadCacheModel();

		vcmsThreadCacheModel.threadId = getThreadId();

		String threadId = vcmsThreadCacheModel.threadId;

		if ((threadId != null) && (threadId.length() == 0)) {
			vcmsThreadCacheModel.threadId = null;
		}

		vcmsThreadCacheModel.groupId = getGroupId();

		vcmsThreadCacheModel.companyId = getCompanyId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			vcmsThreadCacheModel.createdDate = createdDate.getTime();
		}
		else {
			vcmsThreadCacheModel.createdDate = Long.MIN_VALUE;
		}

		vcmsThreadCacheModel.createdByUser = getCreatedByUser();

		String createdByUser = vcmsThreadCacheModel.createdByUser;

		if ((createdByUser != null) && (createdByUser.length() == 0)) {
			vcmsThreadCacheModel.createdByUser = null;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			vcmsThreadCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			vcmsThreadCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		vcmsThreadCacheModel.modifiedByUser = getModifiedByUser();

		String modifiedByUser = vcmsThreadCacheModel.modifiedByUser;

		if ((modifiedByUser != null) && (modifiedByUser.length() == 0)) {
			vcmsThreadCacheModel.modifiedByUser = null;
		}

		vcmsThreadCacheModel.title = getTitle();

		String title = vcmsThreadCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			vcmsThreadCacheModel.title = null;
		}

		vcmsThreadCacheModel.description = getDescription();

		String description = vcmsThreadCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			vcmsThreadCacheModel.description = null;
		}

		vcmsThreadCacheModel.hasImage = getHasImage();

		vcmsThreadCacheModel.image = getImage();

		String image = vcmsThreadCacheModel.image;

		if ((image != null) && (image.length() == 0)) {
			vcmsThreadCacheModel.image = null;
		}

		vcmsThreadCacheModel.language = getLanguage();

		String language = vcmsThreadCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			vcmsThreadCacheModel.language = null;
		}

		return vcmsThreadCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{threadId=");
		sb.append(getThreadId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", hasImage=");
		sb.append(getHasImage());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.VcmsThread");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>threadId</column-name><column-value><![CDATA[");
		sb.append(getThreadId());
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
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdByUser</column-name><column-value><![CDATA[");
		sb.append(getCreatedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedByUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasImage</column-name><column-value><![CDATA[");
		sb.append(getHasImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VcmsThread.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VcmsThread.class
		};
	private String _threadId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private Date _createdDate;
	private String _createdByUser;
	private Date _modifiedDate;
	private String _modifiedByUser;
	private String _title;
	private String _description;
	private boolean _hasImage;
	private String _image;
	private String _language;
	private String _originalLanguage;
	private long _columnBitmask;
	private VcmsThread _escapedModel;
}