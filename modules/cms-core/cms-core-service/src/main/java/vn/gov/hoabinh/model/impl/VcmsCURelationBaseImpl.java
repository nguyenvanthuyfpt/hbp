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

import vn.gov.hoabinh.model.VcmsCURelation;
import vn.gov.hoabinh.service.VcmsCURelationLocalServiceUtil;

/**
 * The extended model base implementation for the VcmsCURelation service. Represents a row in the &quot;VcmsCURelation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsCURelationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCURelationImpl
 * @see VcmsCURelation
 * @generated
 */
@ProviderType
public abstract class VcmsCURelationBaseImpl extends VcmsCURelationModelImpl
	implements VcmsCURelation {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vcms c u relation model instance should use the {@link VcmsCURelation} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			VcmsCURelationLocalServiceUtil.addVcmsCURelation(this);
		}
		else {
			VcmsCURelationLocalServiceUtil.updateVcmsCURelation(this);
		}
	}
}