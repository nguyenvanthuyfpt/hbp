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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import vn.gov.hoabinh.model.VLegalDURel;
import vn.gov.hoabinh.model.VLegalDURelModel;
import vn.gov.hoabinh.service.persistence.VLegalDURelPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VLegalDURel service. Represents a row in the &quot;VLegalDURel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VLegalDURelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VLegalDURelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDURelImpl
 * @see VLegalDURel
 * @see VLegalDURelModel
 * @generated
 */
@ProviderType
public class VLegalDURelModelImpl extends BaseModelImpl<VLegalDURel>
	implements VLegalDURelModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a v legal d u rel model instance should use the {@link VLegalDURel} interface instead.
	 */
	public static final String TABLE_NAME = "VLegalDURel";
	public static final Object[][] TABLE_COLUMNS = {
			{ "departmentId", Types.BIGINT },
			{ "userid", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("departmentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userid", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table VLegalDURel (departmentId LONG not null,userid LONG not null,primary key (departmentId, userid))";
	public static final String TABLE_SQL_DROP = "drop table VLegalDURel";
	public static final String ORDER_BY_JPQL = " ORDER BY vLegalDURel.id.departmentId DESC, vLegalDURel.id.userid DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VLegalDURel.departmentId DESC, VLegalDURel.userid DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.VLegalDURel"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.VLegalDURel"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.VLegalDURel"),
			true);
	public static final long DEPARTMENTID_COLUMN_BITMASK = 1L;
	public static final long USERID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.VLegalDURel"));

	public VLegalDURelModelImpl() {
	}

	@Override
	public VLegalDURelPK getPrimaryKey() {
		return new VLegalDURelPK(_departmentId, _userid);
	}

	@Override
	public void setPrimaryKey(VLegalDURelPK primaryKey) {
		setDepartmentId(primaryKey.departmentId);
		setUserid(primaryKey.userid);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new VLegalDURelPK(_departmentId, _userid);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((VLegalDURelPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalDURel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalDURel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("departmentId", getDepartmentId());
		attributes.put("userid", getUserid());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long departmentId = (Long)attributes.get("departmentId");

		if (departmentId != null) {
			setDepartmentId(departmentId);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}
	}

	@Override
	public long getDepartmentId() {
		return _departmentId;
	}

	@Override
	public void setDepartmentId(long departmentId) {
		_columnBitmask = -1L;

		if (!_setOriginalDepartmentId) {
			_setOriginalDepartmentId = true;

			_originalDepartmentId = _departmentId;
		}

		_departmentId = departmentId;
	}

	public long getOriginalDepartmentId() {
		return _originalDepartmentId;
	}

	@Override
	public long getUserid() {
		return _userid;
	}

	@Override
	public void setUserid(long userid) {
		_columnBitmask = -1L;

		if (!_setOriginalUserid) {
			_setOriginalUserid = true;

			_originalUserid = _userid;
		}

		_userid = userid;
	}

	public long getOriginalUserid() {
		return _originalUserid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VLegalDURel toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VLegalDURel)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VLegalDURelImpl vLegalDURelImpl = new VLegalDURelImpl();

		vLegalDURelImpl.setDepartmentId(getDepartmentId());
		vLegalDURelImpl.setUserid(getUserid());

		vLegalDURelImpl.resetOriginalValues();

		return vLegalDURelImpl;
	}

	@Override
	public int compareTo(VLegalDURel vLegalDURel) {
		int value = 0;

		if (getDepartmentId() < vLegalDURel.getDepartmentId()) {
			value = -1;
		}
		else if (getDepartmentId() > vLegalDURel.getDepartmentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		if (getUserid() < vLegalDURel.getUserid()) {
			value = -1;
		}
		else if (getUserid() > vLegalDURel.getUserid()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof VLegalDURel)) {
			return false;
		}

		VLegalDURel vLegalDURel = (VLegalDURel)obj;

		VLegalDURelPK primaryKey = vLegalDURel.getPrimaryKey();

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
		VLegalDURelModelImpl vLegalDURelModelImpl = this;

		vLegalDURelModelImpl._originalDepartmentId = vLegalDURelModelImpl._departmentId;

		vLegalDURelModelImpl._setOriginalDepartmentId = false;

		vLegalDURelModelImpl._originalUserid = vLegalDURelModelImpl._userid;

		vLegalDURelModelImpl._setOriginalUserid = false;

		vLegalDURelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VLegalDURel> toCacheModel() {
		VLegalDURelCacheModel vLegalDURelCacheModel = new VLegalDURelCacheModel();

		vLegalDURelCacheModel.vLegalDURelPK = getPrimaryKey();

		vLegalDURelCacheModel.departmentId = getDepartmentId();

		vLegalDURelCacheModel.userid = getUserid();

		return vLegalDURelCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{departmentId=");
		sb.append(getDepartmentId());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.VLegalDURel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>departmentId</column-name><column-value><![CDATA[");
		sb.append(getDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VLegalDURel.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VLegalDURel.class
		};
	private long _departmentId;
	private long _originalDepartmentId;
	private boolean _setOriginalDepartmentId;
	private long _userid;
	private long _originalUserid;
	private boolean _setOriginalUserid;
	private long _columnBitmask;
	private VLegalDURel _escapedModel;
}