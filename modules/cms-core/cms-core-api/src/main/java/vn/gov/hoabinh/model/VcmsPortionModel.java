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
 * The base model interface for the VcmsPortion service. Represents a row in the &quot;VcmsPortion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.VcmsPortionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.VcmsPortionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPortion
 * @see vn.gov.hoabinh.model.impl.VcmsPortionImpl
 * @see vn.gov.hoabinh.model.impl.VcmsPortionModelImpl
 * @generated
 */
@ProviderType
public interface VcmsPortionModel extends BaseModel<VcmsPortion>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vcms portion model instance should use the {@link VcmsPortion} interface instead.
	 */

	/**
	 * Returns the primary key of this vcms portion.
	 *
	 * @return the primary key of this vcms portion
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this vcms portion.
	 *
	 * @param primaryKey the primary key of this vcms portion
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the portion ID of this vcms portion.
	 *
	 * @return the portion ID of this vcms portion
	 */
	@AutoEscape
	public String getPortionId();

	/**
	 * Sets the portion ID of this vcms portion.
	 *
	 * @param portionId the portion ID of this vcms portion
	 */
	public void setPortionId(String portionId);

	/**
	 * Returns the group ID of this vcms portion.
	 *
	 * @return the group ID of this vcms portion
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this vcms portion.
	 *
	 * @param groupId the group ID of this vcms portion
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this vcms portion.
	 *
	 * @return the company ID of this vcms portion
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this vcms portion.
	 *
	 * @param companyId the company ID of this vcms portion
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the created date of this vcms portion.
	 *
	 * @return the created date of this vcms portion
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this vcms portion.
	 *
	 * @param createdDate the created date of this vcms portion
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the created by user of this vcms portion.
	 *
	 * @return the created by user of this vcms portion
	 */
	@AutoEscape
	public String getCreatedByUser();

	/**
	 * Sets the created by user of this vcms portion.
	 *
	 * @param createdByUser the created by user of this vcms portion
	 */
	public void setCreatedByUser(String createdByUser);

	/**
	 * Returns the modified date of this vcms portion.
	 *
	 * @return the modified date of this vcms portion
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this vcms portion.
	 *
	 * @param modifiedDate the modified date of this vcms portion
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the modified by user of this vcms portion.
	 *
	 * @return the modified by user of this vcms portion
	 */
	@AutoEscape
	public String getModifiedByUser();

	/**
	 * Sets the modified by user of this vcms portion.
	 *
	 * @param modifiedByUser the modified by user of this vcms portion
	 */
	public void setModifiedByUser(String modifiedByUser);

	/**
	 * Returns the code of this vcms portion.
	 *
	 * @return the code of this vcms portion
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this vcms portion.
	 *
	 * @param code the code of this vcms portion
	 */
	public void setCode(String code);

	/**
	 * Returns the name of this vcms portion.
	 *
	 * @return the name of this vcms portion
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this vcms portion.
	 *
	 * @param name the name of this vcms portion
	 */
	public void setName(String name);

	/**
	 * Returns the description of this vcms portion.
	 *
	 * @return the description of this vcms portion
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this vcms portion.
	 *
	 * @param description the description of this vcms portion
	 */
	public void setDescription(String description);

	/**
	 * Returns the categorizable of this vcms portion.
	 *
	 * @return the categorizable of this vcms portion
	 */
	public boolean getCategorizable();

	/**
	 * Returns <code>true</code> if this vcms portion is categorizable.
	 *
	 * @return <code>true</code> if this vcms portion is categorizable; <code>false</code> otherwise
	 */
	public boolean isCategorizable();

	/**
	 * Sets whether this vcms portion is categorizable.
	 *
	 * @param categorizable the categorizable of this vcms portion
	 */
	public void setCategorizable(boolean categorizable);

	/**
	 * Returns the language of this vcms portion.
	 *
	 * @return the language of this vcms portion
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this vcms portion.
	 *
	 * @param language the language of this vcms portion
	 */
	public void setLanguage(String language);

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
	public int compareTo(vn.gov.hoabinh.model.VcmsPortion vcmsPortion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.VcmsPortion> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.VcmsPortion toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.VcmsPortion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}