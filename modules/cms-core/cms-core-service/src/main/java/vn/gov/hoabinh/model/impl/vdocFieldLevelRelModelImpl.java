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

import vn.gov.hoabinh.model.vdocFieldLevelRel;
import vn.gov.hoabinh.model.vdocFieldLevelRelModel;
import vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the vdocFieldLevelRel service. Represents a row in the &quot;vdocFieldLevelRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vdocFieldLevelRelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vdocFieldLevelRelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLevelRelImpl
 * @see vdocFieldLevelRel
 * @see vdocFieldLevelRelModel
 * @generated
 */
@ProviderType
public class vdocFieldLevelRelModelImpl extends BaseModelImpl<vdocFieldLevelRel>
	implements vdocFieldLevelRelModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vdoc field level rel model instance should use the {@link vdocFieldLevelRel} interface instead.
	 */
	public static final String TABLE_NAME = "vdocFieldLevelRel";
	public static final Object[][] TABLE_COLUMNS = {
			{ "fieldId", Types.VARCHAR },
			{ "levelId", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("fieldId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("levelId", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table vdocFieldLevelRel (fieldId VARCHAR(75) not null,levelId VARCHAR(75) not null,primary key (fieldId, levelId))";
	public static final String TABLE_SQL_DROP = "drop table vdocFieldLevelRel";
	public static final String ORDER_BY_JPQL = " ORDER BY vdocFieldLevelRel.id.fieldId DESC, vdocFieldLevelRel.id.levelId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vdocFieldLevelRel.fieldId DESC, vdocFieldLevelRel.levelId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.vdocFieldLevelRel"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.vdocFieldLevelRel"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.vdocFieldLevelRel"),
			true);
	public static final long FIELDID_COLUMN_BITMASK = 1L;
	public static final long LEVELID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.vdocFieldLevelRel"));

	public vdocFieldLevelRelModelImpl() {
	}

	@Override
	public vdocFieldLevelRelPK getPrimaryKey() {
		return new vdocFieldLevelRelPK(_fieldId, _levelId);
	}

	@Override
	public void setPrimaryKey(vdocFieldLevelRelPK primaryKey) {
		setFieldId(primaryKey.fieldId);
		setLevelId(primaryKey.levelId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new vdocFieldLevelRelPK(_fieldId, _levelId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((vdocFieldLevelRelPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return vdocFieldLevelRel.class;
	}

	@Override
	public String getModelClassName() {
		return vdocFieldLevelRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fieldId", getFieldId());
		attributes.put("levelId", getLevelId());

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

		String levelId = (String)attributes.get("levelId");

		if (levelId != null) {
			setLevelId(levelId);
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
	public String getLevelId() {
		if (_levelId == null) {
			return StringPool.BLANK;
		}
		else {
			return _levelId;
		}
	}

	@Override
	public void setLevelId(String levelId) {
		_columnBitmask = -1L;

		if (_originalLevelId == null) {
			_originalLevelId = _levelId;
		}

		_levelId = levelId;
	}

	public String getOriginalLevelId() {
		return GetterUtil.getString(_originalLevelId);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public vdocFieldLevelRel toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (vdocFieldLevelRel)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		vdocFieldLevelRelImpl vdocFieldLevelRelImpl = new vdocFieldLevelRelImpl();

		vdocFieldLevelRelImpl.setFieldId(getFieldId());
		vdocFieldLevelRelImpl.setLevelId(getLevelId());

		vdocFieldLevelRelImpl.resetOriginalValues();

		return vdocFieldLevelRelImpl;
	}

	@Override
	public int compareTo(vdocFieldLevelRel vdocFieldLevelRel) {
		int value = 0;

		value = getFieldId().compareTo(vdocFieldLevelRel.getFieldId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getLevelId().compareTo(vdocFieldLevelRel.getLevelId());

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

		if (!(obj instanceof vdocFieldLevelRel)) {
			return false;
		}

		vdocFieldLevelRel vdocFieldLevelRel = (vdocFieldLevelRel)obj;

		vdocFieldLevelRelPK primaryKey = vdocFieldLevelRel.getPrimaryKey();

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
		vdocFieldLevelRelModelImpl vdocFieldLevelRelModelImpl = this;

		vdocFieldLevelRelModelImpl._originalFieldId = vdocFieldLevelRelModelImpl._fieldId;

		vdocFieldLevelRelModelImpl._originalLevelId = vdocFieldLevelRelModelImpl._levelId;

		vdocFieldLevelRelModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<vdocFieldLevelRel> toCacheModel() {
		vdocFieldLevelRelCacheModel vdocFieldLevelRelCacheModel = new vdocFieldLevelRelCacheModel();

		vdocFieldLevelRelCacheModel.vdocFieldLevelRelPK = getPrimaryKey();

		vdocFieldLevelRelCacheModel.fieldId = getFieldId();

		String fieldId = vdocFieldLevelRelCacheModel.fieldId;

		if ((fieldId != null) && (fieldId.length() == 0)) {
			vdocFieldLevelRelCacheModel.fieldId = null;
		}

		vdocFieldLevelRelCacheModel.levelId = getLevelId();

		String levelId = vdocFieldLevelRelCacheModel.levelId;

		if ((levelId != null) && (levelId.length() == 0)) {
			vdocFieldLevelRelCacheModel.levelId = null;
		}

		return vdocFieldLevelRelCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{fieldId=");
		sb.append(getFieldId());
		sb.append(", levelId=");
		sb.append(getLevelId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.vdocFieldLevelRel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fieldId</column-name><column-value><![CDATA[");
		sb.append(getFieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>levelId</column-name><column-value><![CDATA[");
		sb.append(getLevelId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = vdocFieldLevelRel.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			vdocFieldLevelRel.class
		};
	private String _fieldId;
	private String _originalFieldId;
	private String _levelId;
	private String _originalLevelId;
	private long _columnBitmask;
	private vdocFieldLevelRel _escapedModel;
}