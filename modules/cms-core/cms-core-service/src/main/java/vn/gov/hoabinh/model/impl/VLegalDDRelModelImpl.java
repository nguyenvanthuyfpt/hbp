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
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.VLegalDDRel;
import vn.gov.hoabinh.model.VLegalDDRelModel;
import vn.gov.hoabinh.service.persistence.VLegalDDRelPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VLegalDDRel service. Represents a row in the &quot;VLegalDDRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VLegalDDRelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VLegalDDRelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDDRelImpl
 * @see VLegalDDRel
 * @see VLegalDDRelModel
 * @generated
 */
@ProviderType
public class VLegalDDRelModelImpl extends BaseModelImpl<VLegalDDRel>
	implements VLegalDDRelModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a v legal d d rel model instance should use the {@link VLegalDDRel} interface instead.
	 */
	public static final String TABLE_NAME = "VLegalDDRel";
	public static final Object[][] TABLE_COLUMNS = {
			{ "departmentId", Types.BIGINT },
			{ "docId", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("departmentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("docId", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table VLegalDDRel (departmentId LONG not null,docId VARCHAR(75) not null,primary key (departmentId, docId))";
	public static final String TABLE_SQL_DROP = "drop table VLegalDDRel";
	public static final String ORDER_BY_JPQL = " ORDER BY vLegalDDRel.id.departmentId DESC, vLegalDDRel.id.docId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VLegalDDRel.departmentId DESC, VLegalDDRel.docId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.VLegalDDRel"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.VLegalDDRel"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.VLegalDDRel"),
			true);
	public static final long DEPARTMENTID_COLUMN_BITMASK = 1L;
	public static final long DOCID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.VLegalDDRel"));

	public VLegalDDRelModelImpl() {
	}

	@Override
	public VLegalDDRelPK getPrimaryKey() {
		return new VLegalDDRelPK(_departmentId, _docId);
	}

	@Override
	public void setPrimaryKey(VLegalDDRelPK primaryKey) {
		setDepartmentId(primaryKey.departmentId);
		setDocId(primaryKey.docId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new VLegalDDRelPK(_departmentId, _docId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((VLegalDDRelPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalDDRel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalDDRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("departmentId", getDepartmentId());
		attributes.put("docId", getDocId());

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

		String docId = (String)attributes.get("docId");

		if (docId != null) {
			setDocId(docId);
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
	public String getDocId() {
		if (_docId == null) {
			return StringPool.BLANK;
		}
		else {
			return _docId;
		}
	}

	@Override
	public void setDocId(String docId) {
		_columnBitmask = -1L;

		if (_originalDocId == null) {
			_originalDocId = _docId;
		}

		_docId = docId;
	}

	public String getOriginalDocId() {
		return GetterUtil.getString(_originalDocId);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VLegalDDRel toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VLegalDDRel)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VLegalDDRelImpl vLegalDDRelImpl = new VLegalDDRelImpl();

		vLegalDDRelImpl.setDepartmentId(getDepartmentId());
		vLegalDDRelImpl.setDocId(getDocId());

		vLegalDDRelImpl.resetOriginalValues();

		return vLegalDDRelImpl;
	}

	@Override
	public int compareTo(VLegalDDRel vLegalDDRel) {
		int value = 0;

		if (getDepartmentId() < vLegalDDRel.getDepartmentId()) {
			value = -1;
		}
		else if (getDepartmentId() > vLegalDDRel.getDepartmentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getDocId().compareTo(vLegalDDRel.getDocId());

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

		if (!(obj instanceof VLegalDDRel)) {
			return false;
		}

		VLegalDDRel vLegalDDRel = (VLegalDDRel)obj;

		VLegalDDRelPK primaryKey = vLegalDDRel.getPrimaryKey();

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
		VLegalDDRelModelImpl vLegalDDRelModelImpl = this;

		vLegalDDRelModelImpl._originalDepartmentId = vLegalDDRelModelImpl._departmentId;

		vLegalDDRelModelImpl._setOriginalDepartmentId = false;

		vLegalDDRelModelImpl._originalDocId = vLegalDDRelModelImpl._docId;

		vLegalDDRelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VLegalDDRel> toCacheModel() {
		VLegalDDRelCacheModel vLegalDDRelCacheModel = new VLegalDDRelCacheModel();

		vLegalDDRelCacheModel.vLegalDDRelPK = getPrimaryKey();

		vLegalDDRelCacheModel.departmentId = getDepartmentId();

		vLegalDDRelCacheModel.docId = getDocId();

		String docId = vLegalDDRelCacheModel.docId;

		if ((docId != null) && (docId.length() == 0)) {
			vLegalDDRelCacheModel.docId = null;
		}

		return vLegalDDRelCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{departmentId=");
		sb.append(getDepartmentId());
		sb.append(", docId=");
		sb.append(getDocId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.VLegalDDRel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>departmentId</column-name><column-value><![CDATA[");
		sb.append(getDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docId</column-name><column-value><![CDATA[");
		sb.append(getDocId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VLegalDDRel.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VLegalDDRel.class
		};
	private long _departmentId;
	private long _originalDepartmentId;
	private boolean _setOriginalDepartmentId;
	private String _docId;
	private String _originalDocId;
	private long _columnBitmask;
	private VLegalDDRel _escapedModel;
}