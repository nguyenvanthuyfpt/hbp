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

package vn.gov.hoabinh.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class VcmsCARelationPK implements Comparable<VcmsCARelationPK>,
	Serializable {
	public String categoryId;
	public String articleId;

	public VcmsCARelationPK() {
	}

	public VcmsCARelationPK(String categoryId, String articleId) {
		this.categoryId = categoryId;
		this.articleId = articleId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	@Override
	public int compareTo(VcmsCARelationPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = categoryId.compareTo(pk.categoryId);

		if (value != 0) {
			return value;
		}

		value = articleId.compareTo(pk.articleId);

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

		if (!(obj instanceof VcmsCARelationPK)) {
			return false;
		}

		VcmsCARelationPK pk = (VcmsCARelationPK)obj;

		if ((categoryId.equals(pk.categoryId)) &&
				(articleId.equals(pk.articleId))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, categoryId);
		hashCode = HashUtil.hash(hashCode, articleId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("categoryId");
		sb.append(StringPool.EQUAL);
		sb.append(categoryId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("articleId");
		sb.append(StringPool.EQUAL);
		sb.append(articleId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}