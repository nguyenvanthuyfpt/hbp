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

import vn.gov.hoabinh.model.VLegalFTRel;
import vn.gov.hoabinh.model.VLegalFTRelModel;
import vn.gov.hoabinh.service.persistence.VLegalFTRelPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VLegalFTRel service. Represents a row in the &quot;VLegalFTRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VLegalFTRelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VLegalFTRelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFTRelImpl
 * @see VLegalFTRel
 * @see VLegalFTRelModel
 * @generated
 */
@ProviderType
public class VLegalFTRelModelImpl extends BaseModelImpl<VLegalFTRel>
	implements VLegalFTRelModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a v legal f t rel model instance should use the {@link VLegalFTRel} interface instead.
	 */
	public static final String TABLE_NAME = "VLegalFTRel";
	public static final Object[][] TABLE_COLUMNS = {
			{ "fieldId", Types.VARCHAR },
			{ "typeId", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("fieldId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("typeId", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table VLegalFTRel (fieldId VARCHAR(75) not null,typeId VARCHAR(75) not null,primary key (fieldId, typeId))";
	public static final String TABLE_SQL_DROP = "drop table VLegalFTRel";
	public static final String ORDER_BY_JPQL = " ORDER BY vLegalFTRel.id.fieldId DESC, vLegalFTRel.id.typeId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VLegalFTRel.fieldId DESC, VLegalFTRel.typeId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.VLegalFTRel"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.VLegalFTRel"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.VLegalFTRel"),
			true);
	public static final long FIELDID_COLUMN_BITMASK = 1L;
	public static final long TYPEID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.VLegalFTRel"));

	public VLegalFTRelModelImpl() {
	}

	@Override
	public VLegalFTRelPK getPrimaryKey() {
		return new VLegalFTRelPK(_fieldId, _typeId);
	}

	@Override
	public void setPrimaryKey(VLegalFTRelPK primaryKey) {
		setFieldId(primaryKey.fieldId);
		setTypeId(primaryKey.typeId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new VLegalFTRelPK(_fieldId, _typeId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((VLegalFTRelPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalFTRel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalFTRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fieldId", getFieldId());
		attributes.put("typeId", getTypeId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String fieldId = (String)attributes.get("fieldId");

		if (fieldId != null) {
			setFieldId(fieldId);
		}

		String typeId = (String)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}
	}

	@Override
	public String getFieldId() {
		if (_fieldId == null) {
			return StringPool.BLANK;
		}
		else {
			return _fieldId;
		}
	}

	@Override
	public void setFieldId(String fieldId) {
		_columnBitmask = -1L;

		if (_originalFieldId == null) {
			_originalFieldId = _fieldId;
		}

		_fieldId = fieldId;
	}

	public String getOriginalFieldId() {
		return GetterUtil.getString(_originalFieldId);
	}

	@Override
	public String getTypeId() {
		if (_typeId == null) {
			return StringPool.BLANK;
		}
		else {
			return _typeId;
		}
	}

	@Override
	public void setTypeId(String typeId) {
		_columnBitmask = -1L;

		if (_originalTypeId == null) {
			_originalTypeId = _typeId;
		}

		_typeId = typeId;
	}

	public String getOriginalTypeId() {
		return GetterUtil.getString(_originalTypeId);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VLegalFTRel toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VLegalFTRel)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VLegalFTRelImpl vLegalFTRelImpl = new VLegalFTRelImpl();

		vLegalFTRelImpl.setFieldId(getFieldId());
		vLegalFTRelImpl.setTypeId(getTypeId());

		vLegalFTRelImpl.resetOriginalValues();

		return vLegalFTRelImpl;
	}

	@Override
	public int compareTo(VLegalFTRel vLegalFTRel) {
		int value = 0;

		value = getFieldId().compareTo(vLegalFTRel.getFieldId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getTypeId().compareTo(vLegalFTRel.getTypeId());

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

		if (!(obj instanceof VLegalFTRel)) {
			return false;
		}

		VLegalFTRel vLegalFTRel = (VLegalFTRel)obj;

		VLegalFTRelPK primaryKey = vLegalFTRel.getPrimaryKey();

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
		VLegalFTRelModelImpl vLegalFTRelModelImpl = this;

		vLegalFTRelModelImpl._originalFieldId = vLegalFTRelModelImpl._fieldId;

		vLegalFTRelModelImpl._originalTypeId = vLegalFTRelModelImpl._typeId;

		vLegalFTRelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VLegalFTRel> toCacheModel() {
		VLegalFTRelCacheModel vLegalFTRelCacheModel = new VLegalFTRelCacheModel();

		vLegalFTRelCacheModel.vLegalFTRelPK = getPrimaryKey();

		vLegalFTRelCacheModel.fieldId = getFieldId();

		String fieldId = vLegalFTRelCacheModel.fieldId;

		if ((fieldId != null) && (fieldId.length() == 0)) {
			vLegalFTRelCacheModel.fieldId = null;
		}

		vLegalFTRelCacheModel.typeId = getTypeId();

		String typeId = vLegalFTRelCacheModel.typeId;

		if ((typeId != null) && (typeId.length() == 0)) {
			vLegalFTRelCacheModel.typeId = null;
		}

		return vLegalFTRelCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{fieldId=");
		sb.append(getFieldId());
		sb.append(", typeId=");
		sb.append(getTypeId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.VLegalFTRel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fieldId</column-name><column-value><![CDATA[");
		sb.append(getFieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VLegalFTRel.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VLegalFTRel.class
		};
	private String _fieldId;
	private String _originalFieldId;
	private String _typeId;
	private String _originalTypeId;
	private long _columnBitmask;
	private VLegalFTRel _escapedModel;
}