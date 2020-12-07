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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import vn.gov.hoabinh.model.VLegalDSRel;
import vn.gov.hoabinh.service.persistence.VLegalDSRelPK;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for VLegalDSRel. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDSRelLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VLegalDSRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalDSRelLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalDSRelLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalDSRelLocalServiceUtil} to access the v legal d s rel local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalDSRelLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery dynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of v legal d s rels.
	*
	* @return the number of v legal d s rels
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVLegalDSRelsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getRelByDoc(java.lang.String docId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getRelByField(java.lang.String fieldId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @return the range of v legal d s rels
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDSRel> getVLegalDSRels(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public VLegalDSRel addRelation(java.lang.String docId,
		java.lang.String sigId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the v legal d s rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRel the v legal d s rel
	* @return the v legal d s rel that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalDSRel addVLegalDSRel(VLegalDSRel vLegalDSRel);

	/**
	* Creates a new v legal d s rel with the primary key. Does not add the v legal d s rel to the database.
	*
	* @param vLegalDSRelPK the primary key for the new v legal d s rel
	* @return the new v legal d s rel
	*/
	public VLegalDSRel createVLegalDSRel(VLegalDSRelPK vLegalDSRelPK);

	/**
	* Deletes the v legal d s rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRel the v legal d s rel
	* @return the v legal d s rel that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalDSRel deleteVLegalDSRel(VLegalDSRel vLegalDSRel);

	/**
	* Deletes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel that was removed
	* @throws PortalException if a v legal d s rel with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalDSRel deleteVLegalDSRel(VLegalDSRelPK vLegalDSRelPK)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDSRel fetchVLegalDSRel(VLegalDSRelPK vLegalDSRelPK);

	/**
	* Returns the v legal d s rel with the primary key.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel
	* @throws PortalException if a v legal d s rel with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDSRel getVLegalDSRel(VLegalDSRelPK vLegalDSRelPK)
		throws PortalException;

	/**
	* Updates the v legal d s rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRel the v legal d s rel
	* @return the v legal d s rel that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalDSRel updateVLegalDSRel(VLegalDSRel vLegalDSRel);

	public void deleteRelByDoc(java.lang.String docId)
		throws PortalException, SystemException, RemoteException;

	public void deleteRelBySigner(java.lang.String sigId)
		throws PortalException, SystemException, RemoteException;

	public void deleteRelation(java.lang.String docId, java.lang.String sigId)
		throws PortalException, SystemException, RemoteException;
}