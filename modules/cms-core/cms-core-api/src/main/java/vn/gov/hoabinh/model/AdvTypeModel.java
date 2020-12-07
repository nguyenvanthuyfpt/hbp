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

package vn.gov.hoabinh.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AdvType service. Represents a row in the &quot;AdvType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.AdvTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.AdvTypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvType
 * @see vn.gov.hoabinh.model.impl.AdvTypeImpl
 * @see vn.gov.hoabinh.model.impl.AdvTypeModelImpl
 * @generated
 */
@ProviderType
public interface AdvTypeModel extends BaseModel<AdvType>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a adv type model instance should use the {@link AdvType} interface instead.
	 */

	/**
	 * Returns the primary key of this adv type.
	 *
	 * @return the primary key of this adv type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this adv type.
	 *
	 * @param primaryKey the primary key of this adv type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the type ID of this adv type.
	 *
	 * @return the type ID of this adv type
	 */
	public long getTypeId();

	/**
	 * Sets the type ID of this adv type.
	 *
	 * @param typeId the type ID of this adv type
	 */
	public void setTypeId(long typeId);

	/**
	 * Returns the create date of this adv type.
	 *
	 * @return the create date of this adv type
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this adv type.
	 *
	 * @param createDate the create date of this adv type
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this adv type.
	 *
	 * @return the modified date of this adv type
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this adv type.
	 *
	 * @param modifiedDate the modified date of this adv type
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the group ID of this adv type.
	 *
	 * @return the group ID of this adv type
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this adv type.
	 *
	 * @param groupId the group ID of this adv type
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this adv type.
	 *
	 * @return the company ID of this adv type
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this adv type.
	 *
	 * @param companyId the company ID of this adv type
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the name of this adv type.
	 *
	 * @return the name of this adv type
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this adv type.
	 *
	 * @param name the name of this adv type
	 */
	public void setName(String name);

	/**
	 * Returns the description of this adv type.
	 *
	 * @return the description of this adv type
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this adv type.
	 *
	 * @param description the description of this adv type
	 */
	public void setDescription(String description);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(vn.gov.hoabinh.model.AdvType advType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.AdvType> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.AdvType toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.AdvType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}