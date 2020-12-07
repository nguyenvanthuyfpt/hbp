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
 * The base model interface for the VLegalSuggestDocument service. Represents a row in the &quot;VLegalSuggestDocument&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.VLegalSuggestDocumentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.VLegalSuggestDocumentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSuggestDocument
 * @see vn.gov.hoabinh.model.impl.VLegalSuggestDocumentImpl
 * @see vn.gov.hoabinh.model.impl.VLegalSuggestDocumentModelImpl
 * @generated
 */
@ProviderType
public interface VLegalSuggestDocumentModel extends BaseModel<VLegalSuggestDocument>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a v legal suggest document model instance should use the {@link VLegalSuggestDocument} interface instead.
	 */

	/**
	 * Returns the primary key of this v legal suggest document.
	 *
	 * @return the primary key of this v legal suggest document
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this v legal suggest document.
	 *
	 * @param primaryKey the primary key of this v legal suggest document
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the sug ID of this v legal suggest document.
	 *
	 * @return the sug ID of this v legal suggest document
	 */
	@AutoEscape
	public String getSugId();

	/**
	 * Sets the sug ID of this v legal suggest document.
	 *
	 * @param sugId the sug ID of this v legal suggest document
	 */
	public void setSugId(String sugId);

	/**
	 * Returns the group ID of this v legal suggest document.
	 *
	 * @return the group ID of this v legal suggest document
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this v legal suggest document.
	 *
	 * @param groupId the group ID of this v legal suggest document
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this v legal suggest document.
	 *
	 * @return the company ID of this v legal suggest document
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this v legal suggest document.
	 *
	 * @param companyId the company ID of this v legal suggest document
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this v legal suggest document.
	 *
	 * @return the user ID of this v legal suggest document
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this v legal suggest document.
	 *
	 * @param userId the user ID of this v legal suggest document
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this v legal suggest document.
	 *
	 * @return the user uuid of this v legal suggest document
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this v legal suggest document.
	 *
	 * @param userUuid the user uuid of this v legal suggest document
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the created date of this v legal suggest document.
	 *
	 * @return the created date of this v legal suggest document
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this v legal suggest document.
	 *
	 * @param createdDate the created date of this v legal suggest document
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the modified date of this v legal suggest document.
	 *
	 * @return the modified date of this v legal suggest document
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this v legal suggest document.
	 *
	 * @param modifiedDate the modified date of this v legal suggest document
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the modified by user of this v legal suggest document.
	 *
	 * @return the modified by user of this v legal suggest document
	 */
	public long getModifiedByUser();

	/**
	 * Sets the modified by user of this v legal suggest document.
	 *
	 * @param modifiedByUser the modified by user of this v legal suggest document
	 */
	public void setModifiedByUser(long modifiedByUser);

	/**
	 * Returns the approved of this v legal suggest document.
	 *
	 * @return the approved of this v legal suggest document
	 */
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this v legal suggest document is approved.
	 *
	 * @return <code>true</code> if this v legal suggest document is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Sets whether this v legal suggest document is approved.
	 *
	 * @param approved the approved of this v legal suggest document
	 */
	public void setApproved(boolean approved);

	/**
	 * Returns the approved by user of this v legal suggest document.
	 *
	 * @return the approved by user of this v legal suggest document
	 */
	public long getApprovedByUser();

	/**
	 * Sets the approved by user of this v legal suggest document.
	 *
	 * @param approvedByUser the approved by user of this v legal suggest document
	 */
	public void setApprovedByUser(long approvedByUser);

	/**
	 * Returns the approved date of this v legal suggest document.
	 *
	 * @return the approved date of this v legal suggest document
	 */
	public Date getApprovedDate();

	/**
	 * Sets the approved date of this v legal suggest document.
	 *
	 * @param approvedDate the approved date of this v legal suggest document
	 */
	public void setApprovedDate(Date approvedDate);

	/**
	 * Returns the title of this v legal suggest document.
	 *
	 * @return the title of this v legal suggest document
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this v legal suggest document.
	 *
	 * @param title the title of this v legal suggest document
	 */
	public void setTitle(String title);

	/**
	 * Returns the content of this v legal suggest document.
	 *
	 * @return the content of this v legal suggest document
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this v legal suggest document.
	 *
	 * @param content the content of this v legal suggest document
	 */
	public void setContent(String content);

	/**
	 * Returns the language of this v legal suggest document.
	 *
	 * @return the language of this v legal suggest document
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this v legal suggest document.
	 *
	 * @param language the language of this v legal suggest document
	 */
	public void setLanguage(String language);

	/**
	 * Returns the visitor name of this v legal suggest document.
	 *
	 * @return the visitor name of this v legal suggest document
	 */
	@AutoEscape
	public String getVisitorName();

	/**
	 * Sets the visitor name of this v legal suggest document.
	 *
	 * @param visitorName the visitor name of this v legal suggest document
	 */
	public void setVisitorName(String visitorName);

	/**
	 * Returns the visitor email of this v legal suggest document.
	 *
	 * @return the visitor email of this v legal suggest document
	 */
	@AutoEscape
	public String getVisitorEmail();

	/**
	 * Sets the visitor email of this v legal suggest document.
	 *
	 * @param visitorEmail the visitor email of this v legal suggest document
	 */
	public void setVisitorEmail(String visitorEmail);

	/**
	 * Returns the visitor tel of this v legal suggest document.
	 *
	 * @return the visitor tel of this v legal suggest document
	 */
	@AutoEscape
	public String getVisitorTel();

	/**
	 * Sets the visitor tel of this v legal suggest document.
	 *
	 * @param visitorTel the visitor tel of this v legal suggest document
	 */
	public void setVisitorTel(String visitorTel);

	/**
	 * Returns the visitor address of this v legal suggest document.
	 *
	 * @return the visitor address of this v legal suggest document
	 */
	@AutoEscape
	public String getVisitorAddress();

	/**
	 * Sets the visitor address of this v legal suggest document.
	 *
	 * @param visitorAddress the visitor address of this v legal suggest document
	 */
	public void setVisitorAddress(String visitorAddress);

	/**
	 * Returns the draft ID of this v legal suggest document.
	 *
	 * @return the draft ID of this v legal suggest document
	 */
	@AutoEscape
	public String getDraftId();

	/**
	 * Sets the draft ID of this v legal suggest document.
	 *
	 * @param draftId the draft ID of this v legal suggest document
	 */
	public void setDraftId(String draftId);

	/**
	 * Returns the has attachment of this v legal suggest document.
	 *
	 * @return the has attachment of this v legal suggest document
	 */
	public boolean getHasAttachment();

	/**
	 * Returns <code>true</code> if this v legal suggest document is has attachment.
	 *
	 * @return <code>true</code> if this v legal suggest document is has attachment; <code>false</code> otherwise
	 */
	public boolean isHasAttachment();

	/**
	 * Sets whether this v legal suggest document is has attachment.
	 *
	 * @param hasAttachment the has attachment of this v legal suggest document
	 */
	public void setHasAttachment(boolean hasAttachment);

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
	public int compareTo(
		vn.gov.hoabinh.model.VLegalSuggestDocument vLegalSuggestDocument);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.VLegalSuggestDocument> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}