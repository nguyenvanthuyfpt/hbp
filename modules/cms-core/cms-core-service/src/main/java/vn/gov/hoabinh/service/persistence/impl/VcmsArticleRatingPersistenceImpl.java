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

package vn.gov.hoabinh.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException;
import vn.gov.hoabinh.model.VcmsArticleRating;
import vn.gov.hoabinh.model.impl.VcmsArticleRatingImpl;
import vn.gov.hoabinh.model.impl.VcmsArticleRatingModelImpl;
import vn.gov.hoabinh.service.persistence.VcmsArticleRatingPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vcms article rating service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleRatingPersistence
 * @see vn.gov.hoabinh.service.persistence.VcmsArticleRatingUtil
 * @generated
 */
@ProviderType
public class VcmsArticleRatingPersistenceImpl extends BasePersistenceImpl<VcmsArticleRating>
	implements VcmsArticleRatingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VcmsArticleRatingUtil} to access the vcms article rating persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsArticleRatingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_R = new FinderPath(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_R",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R = new FinderPath(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_R",
			new String[] { Long.class.getName() },
			VcmsArticleRatingModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsArticleRatingModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_R = new FinderPath(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_R",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vcms article ratings where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the matching vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findByA_R(long articleId) {
		return findByA_R(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms article ratings where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article ratings
	 * @param end the upper bound of the range of vcms article ratings (not inclusive)
	 * @return the range of matching vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findByA_R(long articleId, int start, int end) {
		return findByA_R(articleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article ratings where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article ratings
	 * @param end the upper bound of the range of vcms article ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findByA_R(long articleId, int start,
		int end, OrderByComparator<VcmsArticleRating> orderByComparator) {
		return findByA_R(articleId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article ratings where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param start the lower bound of the range of vcms article ratings
	 * @param end the upper bound of the range of vcms article ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findByA_R(long articleId, int start,
		int end, OrderByComparator<VcmsArticleRating> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R;
			finderArgs = new Object[] { articleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_R;
			finderArgs = new Object[] { articleId, start, end, orderByComparator };
		}

		List<VcmsArticleRating> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleRating>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticleRating vcmsArticleRating : list) {
					if ((articleId != vcmsArticleRating.getArticleId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VCMSARTICLERATING_WHERE);

			query.append(_FINDER_COLUMN_A_R_ARTICLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleRatingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(articleId);

				if (!pagination) {
					list = (List<VcmsArticleRating>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleRating>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first vcms article rating in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article rating
	 * @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	 */
	@Override
	public VcmsArticleRating findByA_R_First(long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException {
		VcmsArticleRating vcmsArticleRating = fetchByA_R_First(articleId,
				orderByComparator);

		if (vcmsArticleRating != null) {
			return vcmsArticleRating;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleRatingException(msg.toString());
	}

	/**
	 * Returns the first vcms article rating in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	 */
	@Override
	public VcmsArticleRating fetchByA_R_First(long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		List<VcmsArticleRating> list = findByA_R(articleId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article rating in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article rating
	 * @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	 */
	@Override
	public VcmsArticleRating findByA_R_Last(long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException {
		VcmsArticleRating vcmsArticleRating = fetchByA_R_Last(articleId,
				orderByComparator);

		if (vcmsArticleRating != null) {
			return vcmsArticleRating;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleRatingException(msg.toString());
	}

	/**
	 * Returns the last vcms article rating in the ordered set where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	 */
	@Override
	public VcmsArticleRating fetchByA_R_Last(long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		int count = countByA_R(articleId);

		if (count == 0) {
			return null;
		}

		List<VcmsArticleRating> list = findByA_R(articleId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms article ratings before and after the current vcms article rating in the ordered set where articleId = &#63;.
	 *
	 * @param Id the primary key of the current vcms article rating
	 * @param articleId the article ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article rating
	 * @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	 */
	@Override
	public VcmsArticleRating[] findByA_R_PrevAndNext(long Id, long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException {
		VcmsArticleRating vcmsArticleRating = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleRating[] array = new VcmsArticleRatingImpl[3];

			array[0] = getByA_R_PrevAndNext(session, vcmsArticleRating,
					articleId, orderByComparator, true);

			array[1] = vcmsArticleRating;

			array[2] = getByA_R_PrevAndNext(session, vcmsArticleRating,
					articleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticleRating getByA_R_PrevAndNext(Session session,
		VcmsArticleRating vcmsArticleRating, long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLERATING_WHERE);

		query.append(_FINDER_COLUMN_A_R_ARTICLEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(VcmsArticleRatingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(articleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticleRating);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleRating> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms article ratings where articleId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 */
	@Override
	public void removeByA_R(long articleId) {
		for (VcmsArticleRating vcmsArticleRating : findByA_R(articleId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticleRating);
		}
	}

	/**
	 * Returns the number of vcms article ratings where articleId = &#63;.
	 *
	 * @param articleId the article ID
	 * @return the number of matching vcms article ratings
	 */
	@Override
	public int countByA_R(long articleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_R;

		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLERATING_WHERE);

			query.append(_FINDER_COLUMN_A_R_ARTICLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(articleId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_A_R_ARTICLEID_2 = "vcmsArticleRating.articleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_S = new FinderPath(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_S = new FinderPath(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingModelImpl.FINDER_CACHE_ENABLED,
			VcmsArticleRatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_S",
			new String[] { Long.class.getName(), String.class.getName() },
			VcmsArticleRatingModelImpl.ARTICLEID_COLUMN_BITMASK |
			VcmsArticleRatingModelImpl.SESSIONID_COLUMN_BITMASK |
			VcmsArticleRatingModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_A_S = new FinderPath(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_S",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @return the matching vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findByA_S(long articleId, String sessionId) {
		return findByA_S(articleId, sessionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @param start the lower bound of the range of vcms article ratings
	 * @param end the upper bound of the range of vcms article ratings (not inclusive)
	 * @return the range of matching vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findByA_S(long articleId, String sessionId,
		int start, int end) {
		return findByA_S(articleId, sessionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @param start the lower bound of the range of vcms article ratings
	 * @param end the upper bound of the range of vcms article ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findByA_S(long articleId, String sessionId,
		int start, int end,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		return findByA_S(articleId, sessionId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @param start the lower bound of the range of vcms article ratings
	 * @param end the upper bound of the range of vcms article ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findByA_S(long articleId, String sessionId,
		int start, int end,
		OrderByComparator<VcmsArticleRating> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_S;
			finderArgs = new Object[] { articleId, sessionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_S;
			finderArgs = new Object[] {
					articleId, sessionId,
					
					start, end, orderByComparator
				};
		}

		List<VcmsArticleRating> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleRating>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VcmsArticleRating vcmsArticleRating : list) {
					if ((articleId != vcmsArticleRating.getArticleId()) ||
							!Objects.equals(sessionId,
								vcmsArticleRating.getSessionId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_VCMSARTICLERATING_WHERE);

			query.append(_FINDER_COLUMN_A_S_ARTICLEID_2);

			boolean bindSessionId = false;

			if (sessionId == null) {
				query.append(_FINDER_COLUMN_A_S_SESSIONID_1);
			}
			else if (sessionId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_S_SESSIONID_3);
			}
			else {
				bindSessionId = true;

				query.append(_FINDER_COLUMN_A_S_SESSIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VcmsArticleRatingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(articleId);

				if (bindSessionId) {
					qPos.add(sessionId);
				}

				if (!pagination) {
					list = (List<VcmsArticleRating>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleRating>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article rating
	 * @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	 */
	@Override
	public VcmsArticleRating findByA_S_First(long articleId, String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException {
		VcmsArticleRating vcmsArticleRating = fetchByA_S_First(articleId,
				sessionId, orderByComparator);

		if (vcmsArticleRating != null) {
			return vcmsArticleRating;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", sessionId=");
		msg.append(sessionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleRatingException(msg.toString());
	}

	/**
	 * Returns the first vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	 */
	@Override
	public VcmsArticleRating fetchByA_S_First(long articleId, String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		List<VcmsArticleRating> list = findByA_S(articleId, sessionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article rating
	 * @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	 */
	@Override
	public VcmsArticleRating findByA_S_Last(long articleId, String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException {
		VcmsArticleRating vcmsArticleRating = fetchByA_S_Last(articleId,
				sessionId, orderByComparator);

		if (vcmsArticleRating != null) {
			return vcmsArticleRating;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("articleId=");
		msg.append(articleId);

		msg.append(", sessionId=");
		msg.append(sessionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVcmsArticleRatingException(msg.toString());
	}

	/**
	 * Returns the last vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	 */
	@Override
	public VcmsArticleRating fetchByA_S_Last(long articleId, String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		int count = countByA_S(articleId, sessionId);

		if (count == 0) {
			return null;
		}

		List<VcmsArticleRating> list = findByA_S(articleId, sessionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vcms article ratings before and after the current vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	 *
	 * @param Id the primary key of the current vcms article rating
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vcms article rating
	 * @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	 */
	@Override
	public VcmsArticleRating[] findByA_S_PrevAndNext(long Id, long articleId,
		String sessionId, OrderByComparator<VcmsArticleRating> orderByComparator)
		throws NoSuchVcmsArticleRatingException {
		VcmsArticleRating vcmsArticleRating = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleRating[] array = new VcmsArticleRatingImpl[3];

			array[0] = getByA_S_PrevAndNext(session, vcmsArticleRating,
					articleId, sessionId, orderByComparator, true);

			array[1] = vcmsArticleRating;

			array[2] = getByA_S_PrevAndNext(session, vcmsArticleRating,
					articleId, sessionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticleRating getByA_S_PrevAndNext(Session session,
		VcmsArticleRating vcmsArticleRating, long articleId, String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VCMSARTICLERATING_WHERE);

		query.append(_FINDER_COLUMN_A_S_ARTICLEID_2);

		boolean bindSessionId = false;

		if (sessionId == null) {
			query.append(_FINDER_COLUMN_A_S_SESSIONID_1);
		}
		else if (sessionId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_A_S_SESSIONID_3);
		}
		else {
			bindSessionId = true;

			query.append(_FINDER_COLUMN_A_S_SESSIONID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(VcmsArticleRatingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(articleId);

		if (bindSessionId) {
			qPos.add(sessionId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vcmsArticleRating);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleRating> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vcms article ratings where articleId = &#63; and sessionId = &#63; from the database.
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 */
	@Override
	public void removeByA_S(long articleId, String sessionId) {
		for (VcmsArticleRating vcmsArticleRating : findByA_S(articleId,
				sessionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vcmsArticleRating);
		}
	}

	/**
	 * Returns the number of vcms article ratings where articleId = &#63; and sessionId = &#63;.
	 *
	 * @param articleId the article ID
	 * @param sessionId the session ID
	 * @return the number of matching vcms article ratings
	 */
	@Override
	public int countByA_S(long articleId, String sessionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_A_S;

		Object[] finderArgs = new Object[] { articleId, sessionId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSARTICLERATING_WHERE);

			query.append(_FINDER_COLUMN_A_S_ARTICLEID_2);

			boolean bindSessionId = false;

			if (sessionId == null) {
				query.append(_FINDER_COLUMN_A_S_SESSIONID_1);
			}
			else if (sessionId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_S_SESSIONID_3);
			}
			else {
				bindSessionId = true;

				query.append(_FINDER_COLUMN_A_S_SESSIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(articleId);

				if (bindSessionId) {
					qPos.add(sessionId);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_A_S_ARTICLEID_2 = "vcmsArticleRating.articleId = ? AND ";
	private static final String _FINDER_COLUMN_A_S_SESSIONID_1 = "vcmsArticleRating.sessionId IS NULL";
	private static final String _FINDER_COLUMN_A_S_SESSIONID_2 = "vcmsArticleRating.sessionId = ?";
	private static final String _FINDER_COLUMN_A_S_SESSIONID_3 = "(vcmsArticleRating.sessionId IS NULL OR vcmsArticleRating.sessionId = '')";

	public VcmsArticleRatingPersistenceImpl() {
		setModelClass(VcmsArticleRating.class);
	}

	/**
	 * Caches the vcms article rating in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleRating the vcms article rating
	 */
	@Override
	public void cacheResult(VcmsArticleRating vcmsArticleRating) {
		entityCache.putResult(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingImpl.class, vcmsArticleRating.getPrimaryKey(),
			vcmsArticleRating);

		vcmsArticleRating.resetOriginalValues();
	}

	/**
	 * Caches the vcms article ratings in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleRatings the vcms article ratings
	 */
	@Override
	public void cacheResult(List<VcmsArticleRating> vcmsArticleRatings) {
		for (VcmsArticleRating vcmsArticleRating : vcmsArticleRatings) {
			if (entityCache.getResult(
						VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleRatingImpl.class,
						vcmsArticleRating.getPrimaryKey()) == null) {
				cacheResult(vcmsArticleRating);
			}
			else {
				vcmsArticleRating.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vcms article ratings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VcmsArticleRatingImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vcms article rating.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VcmsArticleRating vcmsArticleRating) {
		entityCache.removeResult(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingImpl.class, vcmsArticleRating.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VcmsArticleRating> vcmsArticleRatings) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VcmsArticleRating vcmsArticleRating : vcmsArticleRatings) {
			entityCache.removeResult(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleRatingImpl.class, vcmsArticleRating.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vcms article rating with the primary key. Does not add the vcms article rating to the database.
	 *
	 * @param Id the primary key for the new vcms article rating
	 * @return the new vcms article rating
	 */
	@Override
	public VcmsArticleRating create(long Id) {
		VcmsArticleRating vcmsArticleRating = new VcmsArticleRatingImpl();

		vcmsArticleRating.setNew(true);
		vcmsArticleRating.setPrimaryKey(Id);

		return vcmsArticleRating;
	}

	/**
	 * Removes the vcms article rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the vcms article rating
	 * @return the vcms article rating that was removed
	 * @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	 */
	@Override
	public VcmsArticleRating remove(long Id)
		throws NoSuchVcmsArticleRatingException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the vcms article rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms article rating
	 * @return the vcms article rating that was removed
	 * @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	 */
	@Override
	public VcmsArticleRating remove(Serializable primaryKey)
		throws NoSuchVcmsArticleRatingException {
		Session session = null;

		try {
			session = openSession();

			VcmsArticleRating vcmsArticleRating = (VcmsArticleRating)session.get(VcmsArticleRatingImpl.class,
					primaryKey);

			if (vcmsArticleRating == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVcmsArticleRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vcmsArticleRating);
		}
		catch (NoSuchVcmsArticleRatingException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected VcmsArticleRating removeImpl(VcmsArticleRating vcmsArticleRating) {
		vcmsArticleRating = toUnwrappedModel(vcmsArticleRating);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vcmsArticleRating)) {
				vcmsArticleRating = (VcmsArticleRating)session.get(VcmsArticleRatingImpl.class,
						vcmsArticleRating.getPrimaryKeyObj());
			}

			if (vcmsArticleRating != null) {
				session.delete(vcmsArticleRating);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vcmsArticleRating != null) {
			clearCache(vcmsArticleRating);
		}

		return vcmsArticleRating;
	}

	@Override
	public VcmsArticleRating updateImpl(VcmsArticleRating vcmsArticleRating) {
		vcmsArticleRating = toUnwrappedModel(vcmsArticleRating);

		boolean isNew = vcmsArticleRating.isNew();

		VcmsArticleRatingModelImpl vcmsArticleRatingModelImpl = (VcmsArticleRatingModelImpl)vcmsArticleRating;

		Session session = null;

		try {
			session = openSession();

			if (vcmsArticleRating.isNew()) {
				session.save(vcmsArticleRating);

				vcmsArticleRating.setNew(false);
			}
			else {
				vcmsArticleRating = (VcmsArticleRating)session.merge(vcmsArticleRating);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VcmsArticleRatingModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vcmsArticleRatingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleRatingModelImpl.getOriginalArticleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_R, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R,
					args);

				args = new Object[] { vcmsArticleRatingModelImpl.getArticleId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_R, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_R,
					args);
			}

			if ((vcmsArticleRatingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vcmsArticleRatingModelImpl.getOriginalArticleId(),
						vcmsArticleRatingModelImpl.getOriginalSessionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_S,
					args);

				args = new Object[] {
						vcmsArticleRatingModelImpl.getArticleId(),
						vcmsArticleRatingModelImpl.getSessionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_A_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_S,
					args);
			}
		}

		entityCache.putResult(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleRatingImpl.class, vcmsArticleRating.getPrimaryKey(),
			vcmsArticleRating, false);

		vcmsArticleRating.resetOriginalValues();

		return vcmsArticleRating;
	}

	protected VcmsArticleRating toUnwrappedModel(
		VcmsArticleRating vcmsArticleRating) {
		if (vcmsArticleRating instanceof VcmsArticleRatingImpl) {
			return vcmsArticleRating;
		}

		VcmsArticleRatingImpl vcmsArticleRatingImpl = new VcmsArticleRatingImpl();

		vcmsArticleRatingImpl.setNew(vcmsArticleRating.isNew());
		vcmsArticleRatingImpl.setPrimaryKey(vcmsArticleRating.getPrimaryKey());

		vcmsArticleRatingImpl.setId(vcmsArticleRating.getId());
		vcmsArticleRatingImpl.setCreatedDate(vcmsArticleRating.getCreatedDate());
		vcmsArticleRatingImpl.setArticleId(vcmsArticleRating.getArticleId());
		vcmsArticleRatingImpl.setRating(vcmsArticleRating.getRating());
		vcmsArticleRatingImpl.setSessionId(vcmsArticleRating.getSessionId());

		return vcmsArticleRatingImpl;
	}

	/**
	 * Returns the vcms article rating with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article rating
	 * @return the vcms article rating
	 * @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	 */
	@Override
	public VcmsArticleRating findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVcmsArticleRatingException {
		VcmsArticleRating vcmsArticleRating = fetchByPrimaryKey(primaryKey);

		if (vcmsArticleRating == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVcmsArticleRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vcmsArticleRating;
	}

	/**
	 * Returns the vcms article rating with the primary key or throws a {@link NoSuchVcmsArticleRatingException} if it could not be found.
	 *
	 * @param Id the primary key of the vcms article rating
	 * @return the vcms article rating
	 * @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	 */
	@Override
	public VcmsArticleRating findByPrimaryKey(long Id)
		throws NoSuchVcmsArticleRatingException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the vcms article rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article rating
	 * @return the vcms article rating, or <code>null</code> if a vcms article rating with the primary key could not be found
	 */
	@Override
	public VcmsArticleRating fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleRatingImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VcmsArticleRating vcmsArticleRating = (VcmsArticleRating)serializable;

		if (vcmsArticleRating == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsArticleRating = (VcmsArticleRating)session.get(VcmsArticleRatingImpl.class,
						primaryKey);

				if (vcmsArticleRating != null) {
					cacheResult(vcmsArticleRating);
				}
				else {
					entityCache.putResult(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleRatingImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleRatingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vcmsArticleRating;
	}

	/**
	 * Returns the vcms article rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the vcms article rating
	 * @return the vcms article rating, or <code>null</code> if a vcms article rating with the primary key could not be found
	 */
	@Override
	public VcmsArticleRating fetchByPrimaryKey(long Id) {
		return fetchByPrimaryKey((Serializable)Id);
	}

	@Override
	public Map<Serializable, VcmsArticleRating> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VcmsArticleRating> map = new HashMap<Serializable, VcmsArticleRating>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VcmsArticleRating vcmsArticleRating = fetchByPrimaryKey(primaryKey);

			if (vcmsArticleRating != null) {
				map.put(primaryKey, vcmsArticleRating);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleRatingImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VcmsArticleRating)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VCMSARTICLERATING_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (VcmsArticleRating vcmsArticleRating : (List<VcmsArticleRating>)q.list()) {
				map.put(vcmsArticleRating.getPrimaryKeyObj(), vcmsArticleRating);

				cacheResult(vcmsArticleRating);

				uncachedPrimaryKeys.remove(vcmsArticleRating.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VcmsArticleRatingModelImpl.ENTITY_CACHE_ENABLED,
					VcmsArticleRatingImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the vcms article ratings.
	 *
	 * @return the vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vcms article ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article ratings
	 * @param end the upper bound of the range of vcms article ratings (not inclusive)
	 * @return the range of vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vcms article ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article ratings
	 * @param end the upper bound of the range of vcms article ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findAll(int start, int end,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vcms article ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article ratings
	 * @param end the upper bound of the range of vcms article ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vcms article ratings
	 */
	@Override
	public List<VcmsArticleRating> findAll(int start, int end,
		OrderByComparator<VcmsArticleRating> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<VcmsArticleRating> list = null;

		if (retrieveFromCache) {
			list = (List<VcmsArticleRating>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VCMSARTICLERATING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSARTICLERATING;

				if (pagination) {
					sql = sql.concat(VcmsArticleRatingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VcmsArticleRating>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VcmsArticleRating>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vcms article ratings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VcmsArticleRating vcmsArticleRating : findAll()) {
			remove(vcmsArticleRating);
		}
	}

	/**
	 * Returns the number of vcms article ratings.
	 *
	 * @return the number of vcms article ratings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VCMSARTICLERATING);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VcmsArticleRatingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vcms article rating persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VcmsArticleRatingImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VCMSARTICLERATING = "SELECT vcmsArticleRating FROM VcmsArticleRating vcmsArticleRating";
	private static final String _SQL_SELECT_VCMSARTICLERATING_WHERE_PKS_IN = "SELECT vcmsArticleRating FROM VcmsArticleRating vcmsArticleRating WHERE Id IN (";
	private static final String _SQL_SELECT_VCMSARTICLERATING_WHERE = "SELECT vcmsArticleRating FROM VcmsArticleRating vcmsArticleRating WHERE ";
	private static final String _SQL_COUNT_VCMSARTICLERATING = "SELECT COUNT(vcmsArticleRating) FROM VcmsArticleRating vcmsArticleRating";
	private static final String _SQL_COUNT_VCMSARTICLERATING_WHERE = "SELECT COUNT(vcmsArticleRating) FROM VcmsArticleRating vcmsArticleRating WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsArticleRating.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsArticleRating exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsArticleRating exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VcmsArticleRatingPersistenceImpl.class);
}