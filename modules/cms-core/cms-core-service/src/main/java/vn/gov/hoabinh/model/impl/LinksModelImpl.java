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

import vn.gov.hoabinh.model.Links;
import vn.gov.hoabinh.model.LinksModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Links service. Represents a row in the &quot;Links&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link LinksModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LinksImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LinksImpl
 * @see Links
 * @see LinksModel
 * @generated
 */
@ProviderType
public class LinksModelImpl extends BaseModelImpl<Links> implements LinksModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a links model instance should use the {@link Links} interface instead.
	 */
	public static final String TABLE_NAME = "Links";
	public static final Object[][] TABLE_COLUMNS = {
			{ "linkId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "linkgroupId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "url", Types.VARCHAR },
			{ "position", Types.INTEGER },
			{ "image", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("linkId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("linkgroupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("url", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("position", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("image", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table Links (linkId LONG not null primary key,groupId LONG,companyId LONG,createdDate DATE null,modifiedDate DATE null,linkgroupId LONG,name VARCHAR(75) null,description VARCHAR(75) null,url VARCHAR(75) null,position INTEGER,image VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Links";
	public static final String ORDER_BY_JPQL = " ORDER BY links.position ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Links.position ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.Links"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.Links"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.Links"),
			true);
	public static final long GROUPID_COLUMN_BITMASK = 1L;
	public static final long LINKGROUPID_COLUMN_BITMASK = 2L;
	public static final long POSITION_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.Links"));

	public LinksModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _linkId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLinkId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _linkId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Links.class;
	}

	@Override
	public String getModelClassName() {
		return Links.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("linkId", getLinkId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("linkgroupId", getLinkgroupId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("url", getUrl());
		attributes.put("position", getPosition());
		attributes.put("image", getImage());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long linkId = (Long)attributes.get("linkId");

		if (linkId != null) {
			setLinkId(linkId);
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

		Long linkgroupId = (Long)attributes.get("linkgroupId");

		if (linkgroupId != null) {
			setLinkgroupId(linkgroupId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}
	}

	@Override
	public long getLinkId() {
		return _linkId;
	}

	@Override
	public void setLinkId(long linkId) {
		_linkId = linkId;
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
	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Links.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Links toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Links)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LinksImpl linksImpl = new LinksImpl();

		linksImpl.setLinkId(getLinkId());
		linksImpl.setGroupId(getGroupId());
		linksImpl.setCompanyId(getCompanyId());
		linksImpl.setCreatedDate(getCreatedDate());
		linksImpl.setModifiedDate(getModifiedDate());
		linksImpl.setLinkgroupId(getLinkgroupId());
		linksImpl.setName(getName());
		linksImpl.setDescription(getDescription());
		linksImpl.setUrl(getUrl());
		linksImpl.setPosition(getPosition());
		linksImpl.setImage(getImage());

		linksImpl.resetOriginalValues();

		return linksImpl;
	}

	@Override
	public int compareTo(Links links) {
		int value = 0;

		if (getPosition() < links.getPosition()) {
			value = -1;
		}
		else if (getPosition() > links.getPosition()) {
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

		if (!(obj instanceof Links)) {
			return false;
		}

		Links links = (Links)obj;

		long primaryKey = links.getPrimaryKey();

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
		LinksModelImpl linksModelImpl = this;

		linksModelImpl._originalGroupId = linksModelImpl._groupId;

		linksModelImpl._setOriginalGroupId = false;

		linksModelImpl._originalLinkgroupId = linksModelImpl._linkgroupId;

		linksModelImpl._setOriginalLinkgroupId = false;

		linksModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Links> toCacheModel() {
		LinksCacheModel linksCacheModel = new LinksCacheModel();

		linksCacheModel.linkId = getLinkId();

		linksCacheModel.groupId = getGroupId();

		linksCacheModel.companyId = getCompanyId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			linksCacheModel.createdDate = createdDate.getTime();
		}
		else {
			linksCacheModel.createdDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			linksCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			linksCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		linksCacheModel.linkgroupId = getLinkgroupId();

		linksCacheModel.name = getName();

		String name = linksCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			linksCacheModel.name = null;
		}

		linksCacheModel.description = getDescription();

		String description = linksCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			linksCacheModel.description = null;
		}

		linksCacheModel.url = getUrl();

		String url = linksCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			linksCacheModel.url = null;
		}

		linksCacheModel.position = getPosition();

		linksCacheModel.image = getImage();

		String image = linksCacheModel.image;

		if ((image != null) && (image.length() == 0)) {
			linksCacheModel.image = null;
		}

		return linksCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{linkId=");
		sb.append(getLinkId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", linkgroupId=");
		sb.append(getLinkgroupId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", image=");
		sb.append(getImage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.Links");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>linkId</column-name><column-value><![CDATA[");
		sb.append(getLinkId());
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
			"<column><column-name>linkgroupId</column-name><column-value><![CDATA[");
		sb.append(getLinkgroupId());
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
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Links.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Links.class
		};
	private long _linkId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private Date _createdDate;
	private Date _modifiedDate;
	private long _linkgroupId;
	private long _originalLinkgroupId;
	private boolean _setOriginalLinkgroupId;
	private String _name;
	private String _description;
	private String _url;
	private int _position;
	private String _image;
	private long _columnBitmask;
	private Links _escapedModel;
}