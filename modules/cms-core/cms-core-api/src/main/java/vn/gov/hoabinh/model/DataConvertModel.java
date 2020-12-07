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
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DataConvert service. Represents a row in the &quot;DataConvert&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.DataConvertModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.DataConvertImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DataConvert
 * @see vn.gov.hoabinh.model.impl.DataConvertImpl
 * @see vn.gov.hoabinh.model.impl.DataConvertModelImpl
 * @generated
 */
@ProviderType
public interface DataConvertModel extends BaseModel<DataConvert> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a data convert model instance should use the {@link DataConvert} interface instead.
	 */

	/**
	 * Returns the primary key of this data convert.
	 *
	 * @return the primary key of this data convert
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this data convert.
	 *
	 * @param primaryKey the primary key of this data convert
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this data convert.
	 *
	 * @return the ID of this data convert
	 */
	public long getId();

	/**
	 * Sets the ID of this data convert.
	 *
	 * @param id the ID of this data convert
	 */
	public void setId(long id);

	/**
	 * Returns the folder ID of this data convert.
	 *
	 * @return the folder ID of this data convert
	 */
	public long getFolderId();

	/**
	 * Sets the folder ID of this data convert.
	 *
	 * @param folderId the folder ID of this data convert
	 */
	public void setFolderId(long folderId);

	/**
	 * Returns the data ID of this data convert.
	 *
	 * @return the data ID of this data convert
	 */
	@AutoEscape
	public String getDataId();

	/**
	 * Sets the data ID of this data convert.
	 *
	 * @param dataId the data ID of this data convert
	 */
	public void setDataId(String dataId);

	/**
	 * Returns the group ID of this data convert.
	 *
	 * @return the group ID of this data convert
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this data convert.
	 *
	 * @param groupId the group ID of this data convert
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the file entry ID of this data convert.
	 *
	 * @return the file entry ID of this data convert
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this data convert.
	 *
	 * @param fileEntryId the file entry ID of this data convert
	 */
	public void setFileEntryId(long fileEntryId);

	/**
	 * Returns the created date of this data convert.
	 *
	 * @return the created date of this data convert
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this data convert.
	 *
	 * @param createdDate the created date of this data convert
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the file name of this data convert.
	 *
	 * @return the file name of this data convert
	 */
	@AutoEscape
	public String getFileName();

	/**
	 * Sets the file name of this data convert.
	 *
	 * @param fileName the file name of this data convert
	 */
	public void setFileName(String fileName);

	/**
	 * Returns the url of this data convert.
	 *
	 * @return the url of this data convert
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this data convert.
	 *
	 * @param url the url of this data convert
	 */
	public void setUrl(String url);

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
	public int compareTo(vn.gov.hoabinh.model.DataConvert dataConvert);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.DataConvert> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.DataConvert toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.DataConvert toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}