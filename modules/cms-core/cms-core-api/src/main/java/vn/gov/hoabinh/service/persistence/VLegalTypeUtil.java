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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import vn.gov.hoabinh.model.VLegalType;

import java.util.List;

/**
 * The persistence utility for the v legal type service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTypePersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalTypePersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalTypeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(VLegalType vLegalType) {
		getPersistence().clearCache(vLegalType);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VLegalType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalType update(VLegalType vLegalType) {
		return getPersistence().update(vLegalType);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalType update(VLegalType vLegalType,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalType, serviceContext);
	}

	/**
	* Returns all the v legal types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal types
	*/
	public static List<VLegalType> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the v legal types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of matching v legal types
	*/
	public static List<VLegalType> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal types
	*/
	public static List<VLegalType> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal types
	*/
	public static List<VLegalType> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public static VLegalType findByGroupId_First(long groupId,
		OrderByComparator<VLegalType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public static VLegalType fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public static VLegalType findByGroupId_Last(long groupId,
		OrderByComparator<VLegalType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public static VLegalType fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal types before and after the current v legal type in the ordered set where groupId = &#63;.
	*
	* @param typeId the primary key of the current v legal type
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal type
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public static VLegalType[] findByGroupId_PrevAndNext(
		java.lang.String typeId, long groupId,
		OrderByComparator<VLegalType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(typeId, groupId, orderByComparator);
	}

	/**
	* Removes all the v legal types where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal types
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the v legal type where groupId = &#63; and typeId = &#63; or throws a {@link NoSuchVLegalTypeException} if it could not be found.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public static VLegalType findByG_T(long groupId, java.lang.String typeId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence().findByG_T(groupId, typeId);
	}

	/**
	* Returns the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public static VLegalType fetchByG_T(long groupId, java.lang.String typeId) {
		return getPersistence().fetchByG_T(groupId, typeId);
	}

	/**
	* Returns the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public static VLegalType fetchByG_T(long groupId, java.lang.String typeId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByG_T(groupId, typeId, retrieveFromCache);
	}

	/**
	* Removes the v legal type where groupId = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the v legal type that was removed
	*/
	public static VLegalType removeByG_T(long groupId, java.lang.String typeId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence().removeByG_T(groupId, typeId);
	}

	/**
	* Returns the number of v legal types where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the number of matching v legal types
	*/
	public static int countByG_T(long groupId, java.lang.String typeId) {
		return getPersistence().countByG_T(groupId, typeId);
	}

	/**
	* Returns all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @return the matching v legal types
	*/
	public static List<VLegalType> findByS_L(long groupId, boolean statusType,
		java.lang.String language) {
		return getPersistence().findByS_L(groupId, statusType, language);
	}

	/**
	* Returns a range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of matching v legal types
	*/
	public static List<VLegalType> findByS_L(long groupId, boolean statusType,
		java.lang.String language, int start, int end) {
		return getPersistence()
				   .findByS_L(groupId, statusType, language, start, end);
	}

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal types
	*/
	public static List<VLegalType> findByS_L(long groupId, boolean statusType,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence()
				   .findByS_L(groupId, statusType, language, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal types
	*/
	public static List<VLegalType> findByS_L(long groupId, boolean statusType,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByS_L(groupId, statusType, language, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public static VLegalType findByS_L_First(long groupId, boolean statusType,
		java.lang.String language,
		OrderByComparator<VLegalType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_L_First(groupId, statusType, language,
			orderByComparator);
	}

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public static VLegalType fetchByS_L_First(long groupId, boolean statusType,
		java.lang.String language,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence()
				   .fetchByS_L_First(groupId, statusType, language,
			orderByComparator);
	}

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public static VLegalType findByS_L_Last(long groupId, boolean statusType,
		java.lang.String language,
		OrderByComparator<VLegalType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_L_Last(groupId, statusType, language,
			orderByComparator);
	}

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public static VLegalType fetchByS_L_Last(long groupId, boolean statusType,
		java.lang.String language,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence()
				   .fetchByS_L_Last(groupId, statusType, language,
			orderByComparator);
	}

	/**
	* Returns the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param typeId the primary key of the current v legal type
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal type
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public static VLegalType[] findByS_L_PrevAndNext(java.lang.String typeId,
		long groupId, boolean statusType, java.lang.String language,
		OrderByComparator<VLegalType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_L_PrevAndNext(typeId, groupId, statusType,
			language, orderByComparator);
	}

	/**
	* Removes all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	*/
	public static void removeByS_L(long groupId, boolean statusType,
		java.lang.String language) {
		getPersistence().removeByS_L(groupId, statusType, language);
	}

	/**
	* Returns the number of v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @return the number of matching v legal types
	*/
	public static int countByS_L(long groupId, boolean statusType,
		java.lang.String language) {
		return getPersistence().countByS_L(groupId, statusType, language);
	}

	/**
	* Returns all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @return the matching v legal types
	*/
	public static List<VLegalType> findByS_Rss(long groupId,
		boolean statusType, boolean rssable) {
		return getPersistence().findByS_Rss(groupId, statusType, rssable);
	}

	/**
	* Returns a range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of matching v legal types
	*/
	public static List<VLegalType> findByS_Rss(long groupId,
		boolean statusType, boolean rssable, int start, int end) {
		return getPersistence()
				   .findByS_Rss(groupId, statusType, rssable, start, end);
	}

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal types
	*/
	public static List<VLegalType> findByS_Rss(long groupId,
		boolean statusType, boolean rssable, int start, int end,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence()
				   .findByS_Rss(groupId, statusType, rssable, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal types
	*/
	public static List<VLegalType> findByS_Rss(long groupId,
		boolean statusType, boolean rssable, int start, int end,
		OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByS_Rss(groupId, statusType, rssable, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public static VLegalType findByS_Rss_First(long groupId,
		boolean statusType, boolean rssable,
		OrderByComparator<VLegalType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_Rss_First(groupId, statusType, rssable,
			orderByComparator);
	}

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public static VLegalType fetchByS_Rss_First(long groupId,
		boolean statusType, boolean rssable,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence()
				   .fetchByS_Rss_First(groupId, statusType, rssable,
			orderByComparator);
	}

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public static VLegalType findByS_Rss_Last(long groupId, boolean statusType,
		boolean rssable, OrderByComparator<VLegalType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_Rss_Last(groupId, statusType, rssable,
			orderByComparator);
	}

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public static VLegalType fetchByS_Rss_Last(long groupId,
		boolean statusType, boolean rssable,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence()
				   .fetchByS_Rss_Last(groupId, statusType, rssable,
			orderByComparator);
	}

	/**
	* Returns the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param typeId the primary key of the current v legal type
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal type
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public static VLegalType[] findByS_Rss_PrevAndNext(
		java.lang.String typeId, long groupId, boolean statusType,
		boolean rssable, OrderByComparator<VLegalType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_Rss_PrevAndNext(typeId, groupId, statusType,
			rssable, orderByComparator);
	}

	/**
	* Removes all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	*/
	public static void removeByS_Rss(long groupId, boolean statusType,
		boolean rssable) {
		getPersistence().removeByS_Rss(groupId, statusType, rssable);
	}

	/**
	* Returns the number of v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @return the number of matching v legal types
	*/
	public static int countByS_Rss(long groupId, boolean statusType,
		boolean rssable) {
		return getPersistence().countByS_Rss(groupId, statusType, rssable);
	}

	/**
	* Caches the v legal type in the entity cache if it is enabled.
	*
	* @param vLegalType the v legal type
	*/
	public static void cacheResult(VLegalType vLegalType) {
		getPersistence().cacheResult(vLegalType);
	}

	/**
	* Caches the v legal types in the entity cache if it is enabled.
	*
	* @param vLegalTypes the v legal types
	*/
	public static void cacheResult(List<VLegalType> vLegalTypes) {
		getPersistence().cacheResult(vLegalTypes);
	}

	/**
	* Creates a new v legal type with the primary key. Does not add the v legal type to the database.
	*
	* @param typeId the primary key for the new v legal type
	* @return the new v legal type
	*/
	public static VLegalType create(java.lang.String typeId) {
		return getPersistence().create(typeId);
	}

	/**
	* Removes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type that was removed
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public static VLegalType remove(java.lang.String typeId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence().remove(typeId);
	}

	public static VLegalType updateImpl(VLegalType vLegalType) {
		return getPersistence().updateImpl(vLegalType);
	}

	/**
	* Returns the v legal type with the primary key or throws a {@link NoSuchVLegalTypeException} if it could not be found.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public static VLegalType findByPrimaryKey(java.lang.String typeId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTypeException {
		return getPersistence().findByPrimaryKey(typeId);
	}

	/**
	* Returns the v legal type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type, or <code>null</code> if a v legal type with the primary key could not be found
	*/
	public static VLegalType fetchByPrimaryKey(java.lang.String typeId) {
		return getPersistence().fetchByPrimaryKey(typeId);
	}

	public static java.util.Map<java.io.Serializable, VLegalType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal types.
	*
	* @return the v legal types
	*/
	public static List<VLegalType> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of v legal types
	*/
	public static List<VLegalType> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal types
	*/
	public static List<VLegalType> findAll(int start, int end,
		OrderByComparator<VLegalType> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal types
	*/
	public static List<VLegalType> findAll(int start, int end,
		OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal types from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal types.
	*
	* @return the number of v legal types
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalTypePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalTypePersistence, VLegalTypePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalTypePersistence.class);
}