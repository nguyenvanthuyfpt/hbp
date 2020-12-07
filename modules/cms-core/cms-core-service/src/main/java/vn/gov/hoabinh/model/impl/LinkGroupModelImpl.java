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

import vn.gov.hoabinh.model.LinkGroup;
import vn.gov.hoabinh.model.LinkGroupModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LinkGroup service. Represents a row in the &quot;LinkGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link LinkGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LinkGroupImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LinkGroupImpl
 * @see LinkGroup
 * @see LinkGroupModel
 * @generated
 */
@ProviderType
public class LinkGroupModelImpl extends BaseModelImpl<LinkGroup>
	implements LinkGroupModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a link group model instance should use the {@link LinkGroup} interface instead.
	 */
	public static final String TABLE_NAME = "LinkGroup";
	public static final Object[][] TABLE_COLUMNS = {
			{ "linkgroupId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "position", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("linkgroupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("position", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table LinkGroup (linkgroupId LONG not null primary key,groupId LONG,companyId LONG,createdDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,description VARCHAR(75) null,position INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table LinkGroup";
	public static final String ORDER_BY_JPQL = " ORDER BY linkGroup.position ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LinkGroup.position ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.LinkGroup"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.LinkGroup"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.LinkGroup"),
			true);
	public static final long GROUPID_COLUMN_BITMASK = 1L;
	public static final long LINKGROUPID_COLUMN_BITMASK = 2L;
	public static final long POSITION_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.LinkGroup"));

	public LinkGroupModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _linkgroupId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLinkgroupId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _linkgroupId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LinkGroup.class;
	}

	@Override
	public String getModelClassName() {
		return LinkGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("linkgroupId", getLinkgroupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("position", getPosition());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long linkgroupId = (Long)attributes.get("linkgroupId");

		if (linkgroupId != null) {
			setLinkgroupId(linkgroupId);
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

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}
	}

	@Override
	public long getLinkgroupId() {
		return _linkgroupId;
	}

	@Override
	public void setLinkgroupId(long linkgroupId) {
		_columnBitmask |= LINKGROUPID_COLUMN_BITMASK;

		if (!_setOriginalLinkgroupId) {
			_setOriginalLinkgroupId = true;

			_originalLinkgroupId = _linkgroupId;
		}

		_linkgroupId = linkgroupId;
	}

	public long getOriginalLinkgroupId() {
		return _originalLinkgroupId;
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
		_createdDate = createdDate;
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
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
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
	public int getPosition() {
		return _position;
	}

	@Override
	public void setPosition(int position) {
		_columnBitmask = -1L;

		_position = position;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LinkGroup.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LinkGroup toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LinkGroup)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LinkGroupImpl linkGroupImpl = new LinkGroupImpl();

		linkGroupImpl.setLinkgroupId(getLinkgroupId());
		linkGroupImpl.setGroupId(getGroupId());
		linkGroupImpl.setCompanyId(getCompanyId());
		linkGroupImpl.setCreatedDate(getCreatedDate());
		linkGroupImpl.setModifiedDate(getModifiedDate());
		linkGroupImpl.setName(getName());
		linkGroupImpl.setDescription(getDescription());
		linkGroupImpl.setPosition(getPosition());

		linkGroupImpl.resetOriginalValues();

		return linkGroupImpl;
	}

	@Override
	public int compareTo(LinkGroup linkGroup) {
		int value = 0;

		if (getPosition() < linkGroup.getPosition()) {
			value = -1;
		}
		else if (getPosition() > linkGroup.getPosition()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof LinkGroup)) {
			return false;
		}

		LinkGroup linkGroup = (LinkGroup)obj;

		long primaryKey = linkGroup.getPrimaryKey();

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
		LinkGroupModelImpl linkGroupModelImpl = this;

		linkGroupModelImpl._originalLinkgroupId = linkGroupModelImpl._linkgroupId;

		linkGroupModelImpl._setOriginalLinkgroupId = false;

		linkGroupModelImpl._originalGroupId = linkGroupModelImpl._groupId;

		linkGroupModelImpl._setOriginalGroupId = false;

		linkGroupModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LinkGroup> toCacheModel() {
		LinkGroupCacheModel linkGroupCacheModel = new LinkGroupCacheModel();

		linkGroupCacheModel.linkgroupId = getLinkgroupId();

		linkGroupCacheModel.groupId = getGroupId();

		linkGroupCacheModel.companyId = getCompanyId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			linkGroupCacheModel.createdDate = createdDate.getTime();
		}
		else {
			linkGroupCacheModel.createdDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			linkGroupCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			linkGroupCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		linkGroupCacheModel.name = getName();

		String name = linkGroupCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			linkGroupCacheModel.name = null;
		}

		linkGroupCacheModel.description = getDescription();

		String description = linkGroupCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			linkGroupCacheModel.description = null;
		}

		linkGroupCacheModel.position = getPosition();

		return linkGroupCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{linkgroupId=");
		sb.append(getLinkgroupId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.LinkGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>linkgroupId</column-name><column-value><![CDATA[");
		sb.append(getLinkgroupId());
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
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = LinkGroup.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			LinkGroup.class
		};
	private long _linkgroupId;
	private long _originalLinkgroupId;
	private boolean _setOriginalLinkgroupId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private Date _createdDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
	private int _position;
	private long _columnBitmask;
	private LinkGroup _escapedModel;
}