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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the VcmsCARelation service. Represents a row in the &quot;VcmsCARelation&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCARelationModel
 * @see vn.gov.hoabinh.model.impl.VcmsCARelationImpl
 * @see vn.gov.hoabinh.model.impl.VcmsCARelationModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.VcmsCARelationImpl")
@ProviderType
public interface VcmsCARelation extends VcmsCARelationModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.VcmsCARelationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VcmsCARelation, String> CATEGORY_ID_ACCESSOR = new Accessor<VcmsCARelation, String>() {
			@Override
			public String get(VcmsCARelation vcmsCARelation) {
				return vcmsCARelation.getCategoryId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VcmsCARelation> getTypeClass() {
				return VcmsCARelation.class;
			}
		};

	public static final Accessor<VcmsCARelation, String> ARTICLE_ID_ACCESSOR = new Accessor<VcmsCARelation, String>() {
			@Override
			public String get(VcmsCARelation vcmsCARelation) {
				return vcmsCARelation.getArticleId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VcmsCARelation> getTypeClass() {
				return VcmsCARelation.class;
			}
		};
}