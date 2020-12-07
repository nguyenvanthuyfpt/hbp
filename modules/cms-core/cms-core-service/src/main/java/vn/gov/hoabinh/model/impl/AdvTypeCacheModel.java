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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.AdvType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AdvType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AdvType
 * @generated
 */
@ProviderType
public class AdvTypeCacheModel implements CacheModel<AdvType>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvTypeCacheModel)) {
			return false;
		}

		AdvTypeCacheModel advTypeCacheModel = (AdvTypeCacheModel)obj;

		if (typeId == advTypeCacheModel.typeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, typeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{typeId=");
		sb.append(typeId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AdvType toEntityModel() {
		AdvTypeImpl advTypeImpl = new AdvTypeImpl();

		advTypeImpl.setTypeId(typeId);

		if (createDate == Long.MIN_VALUE) {
			advTypeImpl.setCreateDate(null);
		}
		else {
			advTypeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			advTypeImpl.setModifiedDate(null);
		}
		else {
			advTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		advTypeImpl.setGroupId(groupId);
		advTypeImpl.setCompanyId(companyId);

		if (name == null) {
			advTypeImpl.setName(StringPool.BLANK);
		}
		else {
			advTypeImpl.setName(name);
		}

		if (description == null) {
			advTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			advTypeImpl.setDescription(description);
		}

		advTypeImpl.resetOriginalValues();

		return advTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		typeId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(typeId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long typeId;
	public long createDate;
	public long modifiedDate;
	public long groupId;
	public long companyId;
	public String name;
	public String description;
}