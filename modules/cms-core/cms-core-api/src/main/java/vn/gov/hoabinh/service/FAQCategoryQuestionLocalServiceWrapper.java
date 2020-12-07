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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FAQCategoryQuestionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryQuestionLocalService
 * @generated
 */
@ProviderType
public class FAQCategoryQuestionLocalServiceWrapper
	implements FAQCategoryQuestionLocalService,
		ServiceWrapper<FAQCategoryQuestionLocalService> {
	public FAQCategoryQuestionLocalServiceWrapper(
		FAQCategoryQuestionLocalService faqCategoryQuestionLocalService) {
		_faqCategoryQuestionLocalService = faqCategoryQuestionLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _faqCategoryQuestionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _faqCategoryQuestionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _faqCategoryQuestionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCategoryQuestionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCategoryQuestionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of f a q category questions.
	*
	* @return the number of f a q category questions
	*/
	@Override
	public int getFAQCategoryQuestionsCount() {
		return _faqCategoryQuestionLocalService.getFAQCategoryQuestionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _faqCategoryQuestionLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _faqCategoryQuestionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _faqCategoryQuestionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _faqCategoryQuestionLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategoryQuestion> getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.getAll();
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategoryQuestion> getCategoriesOfQuestion(
		long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.getCategoriesOfQuestion(questionId);
	}

	/**
	* Returns a range of all the f a q category questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @return the range of f a q category questions
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategoryQuestion> getFAQCategoryQuestions(
		int start, int end) {
		return _faqCategoryQuestionLocalService.getFAQCategoryQuestions(start,
			end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategoryQuestion> getQuestionsInCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.getQuestionsInCategory(categoryId);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _faqCategoryQuestionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _faqCategoryQuestionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion addCategoryQuestion(
		long categoryId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.addCategoryQuestion(categoryId,
			questionId);
	}

	/**
	* Adds the f a q category question to the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question
	* @return the f a q category question that was added
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion addFAQCategoryQuestion(
		vn.gov.hoabinh.model.FAQCategoryQuestion faqCategoryQuestion) {
		return _faqCategoryQuestionLocalService.addFAQCategoryQuestion(faqCategoryQuestion);
	}

	/**
	* Creates a new f a q category question with the primary key. Does not add the f a q category question to the database.
	*
	* @param id the primary key for the new f a q category question
	* @return the new f a q category question
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion createFAQCategoryQuestion(
		long id) {
		return _faqCategoryQuestionLocalService.createFAQCategoryQuestion(id);
	}

	/**
	* Deletes the f a q category question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category question
	* @return the f a q category question that was removed
	* @throws PortalException if a f a q category question with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion deleteFAQCategoryQuestion(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCategoryQuestionLocalService.deleteFAQCategoryQuestion(id);
	}

	/**
	* Deletes the f a q category question from the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question
	* @return the f a q category question that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion deleteFAQCategoryQuestion(
		vn.gov.hoabinh.model.FAQCategoryQuestion faqCategoryQuestion) {
		return _faqCategoryQuestionLocalService.deleteFAQCategoryQuestion(faqCategoryQuestion);
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion fetchFAQCategoryQuestion(
		long id) {
		return _faqCategoryQuestionLocalService.fetchFAQCategoryQuestion(id);
	}

	/**
	* Returns the f a q category question with the primary key.
	*
	* @param id the primary key of the f a q category question
	* @return the f a q category question
	* @throws PortalException if a f a q category question with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion getFAQCategoryQuestion(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCategoryQuestionLocalService.getFAQCategoryQuestion(id);
	}

	/**
	* Updates the f a q category question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question
	* @return the f a q category question that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion updateFAQCategoryQuestion(
		vn.gov.hoabinh.model.FAQCategoryQuestion faqCategoryQuestion) {
		return _faqCategoryQuestionLocalService.updateFAQCategoryQuestion(faqCategoryQuestion);
	}

	@Override
	public void deleteByCategoryId(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCategoryQuestionLocalService.deleteByCategoryId(categoryId);
	}

	@Override
	public void deleteByQuestionId(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCategoryQuestionLocalService.deleteByQuestionId(questionId);
	}

	@Override
	public FAQCategoryQuestionLocalService getWrappedService() {
		return _faqCategoryQuestionLocalService;
	}

	@Override
	public void setWrappedService(
		FAQCategoryQuestionLocalService faqCategoryQuestionLocalService) {
		_faqCategoryQuestionLocalService = faqCategoryQuestionLocalService;
	}

	private FAQCategoryQuestionLocalService _faqCategoryQuestionLocalService;
}