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

package vn.gov.hoabinh.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for VLegalDFRel. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VLegalDFRelLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDFRelLocalService
 * @see vn.gov.hoabinh.service.base.VLegalDFRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalDFRelLocalServiceImpl
 * @generated
 */
@ProviderType
public class VLegalDFRelLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalDFRelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of v legal d f rels.
	*
	* @return the number of v legal d f rels
	*/
	public static int getVLegalDFRelsCount() {
		return getService().getVLegalDFRelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByDoc(docId);
	}

	public static java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByField(fieldId);
	}

	/**
	* Returns a range of all the v legal d f rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @return the range of v legal d f rels
	*/
	public static java.util.List<vn.gov.hoabinh.model.VLegalDFRel> getVLegalDFRels(
		int start, int end) {
		return getService().getVLegalDFRels(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.gov.hoabinh.model.VLegalDFRel addRelation(
		java.lang.String docId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().addRelation(docId, fieldId);
	}

	/**
	* Adds the v legal d f rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRel the v legal d f rel
	* @return the v legal d f rel that was added
	*/
	public static vn.gov.hoabinh.model.VLegalDFRel addVLegalDFRel(
		vn.gov.hoabinh.model.VLegalDFRel vLegalDFRel) {
		return getService().addVLegalDFRel(vLegalDFRel);
	}

	/**
	* Creates a new v legal d f rel with the primary key. Does not add the v legal d f rel to the database.
	*
	* @param vLegalDFRelPK the primary key for the new v legal d f rel
	* @return the new v legal d f rel
	*/
	public static vn.gov.hoabinh.model.VLegalDFRel createVLegalDFRel(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK) {
		return getService().createVLegalDFRel(vLegalDFRelPK);
	}

	/**
	* Deletes the v legal d f rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRel the v legal d f rel
	* @return the v legal d f rel that was removed
	*/
	public static vn.gov.hoabinh.model.VLegalDFRel deleteVLegalDFRel(
		vn.gov.hoabinh.model.VLegalDFRel vLegalDFRel) {
		return getService().deleteVLegalDFRel(vLegalDFRel);
	}

	/**
	* Deletes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel that was removed
	* @throws PortalException if a v legal d f rel with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalDFRel deleteVLegalDFRel(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVLegalDFRel(vLegalDFRelPK);
	}

	public static vn.gov.hoabinh.model.VLegalDFRel fetchVLegalDFRel(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK) {
		return getService().fetchVLegalDFRel(vLegalDFRelPK);
	}

	/**
	* Returns the v legal d f rel with the primary key.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel
	* @throws PortalException if a v legal d f rel with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalDFRel getVLegalDFRel(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVLegalDFRel(vLegalDFRelPK);
	}

	/**
	* Updates the v legal d f rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRel the v legal d f rel
	* @return the v legal d f rel that was updated
	*/
	public static vn.gov.hoabinh.model.VLegalDFRel updateVLegalDFRel(
		vn.gov.hoabinh.model.VLegalDFRel vLegalDFRel) {
		return getService().updateVLegalDFRel(vLegalDFRel);
	}

	public static void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelByDoc(docId);
	}

	public static void deleteRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelByField(fieldId);
	}

	public static void deleteRelation(java.lang.String docId,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelation(docId, fieldId);
	}

	public static VLegalDFRelLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalDFRelLocalService, VLegalDFRelLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VLegalDFRelLocalService.class);
}