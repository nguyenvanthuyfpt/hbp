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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.FAQAnswer;
import vn.gov.hoabinh.model.FAQAnswerModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the FAQAnswer service. Represents a row in the &quot;FAQAnswer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link FAQAnswerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FAQAnswerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQAnswerImpl
 * @see FAQAnswer
 * @see FAQAnswerModel
 * @generated
 */
@ProviderType
public class FAQAnswerModelImpl extends BaseModelImpl<FAQAnswer>
	implements FAQAnswerModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a f a q answer model instance should use the {@link FAQAnswer} interface instead.
	 */
	public static final String TABLE_NAME = "FAQAnswer";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "questionid", Types.BIGINT },
			{ "content", Types.VARCHAR },
			{ "answerOrder", Types.INTEGER },
			{ "answeredByUser", Types.VARCHAR },
			{ "answeredDate", Types.TIMESTAMP },
			{ "modifiedByUser", Types.VARCHAR },
			{ "language", Types.VARCHAR },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "approved", Types.BOOLEAN },
			{ "approvedByUser", Types.VARCHAR },
			{ "approvedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "attachName", Types.VARCHAR },
			{ "folderId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("questionid", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("content", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("answerOrder", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("answeredByUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("answeredDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedByUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("language", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("approved", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("approvedByUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("approvedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("attachName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("folderId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table FAQAnswer (id_ LONG not null primary key,questionid LONG,content VARCHAR(75) null,answerOrder INTEGER,answeredByUser VARCHAR(75) null,answeredDate DATE null,modifiedByUser VARCHAR(75) null,language VARCHAR(75) null,modifiedDate DATE null,approved BOOLEAN,approvedByUser VARCHAR(75) null,approvedDate DATE null,userId LONG,attachName VARCHAR(75) null,folderId LONG)";
	public static final String TABLE_SQL_DROP = "drop table FAQAnswer";
	public static final String ORDER_BY_JPQL = " ORDER BY faqAnswer.answeredDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY FAQAnswer.answeredDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.FAQAnswer"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.FAQAnswer"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.FAQAnswer"),
			true);
	public static final long APPROVED_COLUMN_BITMASK = 1L;
	public static final long LANGUAGE_COLUMN_BITMASK = 2L;
	public static final long QUESTIONID_COLUMN_BITMASK = 4L;
	public static final long ANSWEREDDATE_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.FAQAnswer"));

	public FAQAnswerModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FAQAnswer.class;
	}

	@Override
	public String getModelClassName() {
		return FAQAnswer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("questionid", getQuestionid());
		attributes.put("content", getContent());
		attributes.put("answerOrder", getAnswerOrder());
		attributes.put("answeredByUser", getAnsweredByUser());
		attributes.put("answeredDate", getAnsweredDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("language", getLanguage());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("approved", getApproved());
		attributes.put("approvedByUser", getApprovedByUser());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("userId", getUserId());
		attributes.put("attachName", getAttachName());
		attributes.put("folderId", getFolderId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long questionid = (Long)attributes.get("questionid");

		if (questionid != null) {
			setQuestionid(questionid);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Integer answerOrder = (Integer)attributes.get("answerOrder");

		if (answerOrder != null) {
			setAnswerOrder(answerOrder);
		}

		String answeredByUser = (String)attributes.get("answeredByUser");

		if (answeredByUser != null) {
			setAnsweredByUser(answeredByUser);
		}

		Date answeredDate = (Date)attributes.get("answeredDate");

		if (answeredDate != null) {
			setAnsweredDate(answeredDate);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Boolean approved = (Boolean)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
		}

		String approvedByUser = (String)attributes.get("approvedByUser");

		if (approvedByUser != null) {
			setApprovedByUser(approvedByUser);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String attachName = (String)attributes.get("attachName");

		if (attachName != null) {
			setAttachName(attachName);
		}

		Long folderId = (Long)attributes.get("folderId");

		if (folderId != null) {
			setFolderId(folderId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getQuestionid() {
		return _questionid;
	}

	@Override
	public void setQuestionid(long questionid) {
		_columnBitmask |= QUESTIONID_COLUMN_BITMASK;

		if (!_setOriginalQuestionid) {
			_setOriginalQuestionid = true;

			_originalQuestionid = _questionid;
		}

		_questionid = questionid;
	}

	public long getOriginalQuestionid() {
		return _originalQuestionid;
	}

	@Override
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@Override
	public int getAnswerOrder() {
		return _answerOrder;
	}

	@Override
	public void setAnswerOrder(int answerOrder) {
		_answerOrder = answerOrder;
	}

	@Override
	public String getAnsweredByUser() {
		if (_answeredByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _answeredByUser;
		}
	}

	@Override
	public void setAnsweredByUser(String answeredByUser) {
		_answeredByUser = answeredByUser;
	}

	@Override
	public Date getAnsweredDate() {
		return _answeredDate;
	}

	@Override
	public void setAnsweredDate(Date answeredDate) {
		_columnBitmask = -1L;

		_answeredDate = answeredDate;
	}

	@Override
	public String getModifiedByUser() {
		if (_modifiedByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _modifiedByUser;
		}
	}

	@Override
	public void setModifiedByUser(String modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	@Override
	public String getLanguage() {
		if (_language == null) {
			return StringPool.BLANK;
		}
		else {
			return _language;
		}
	}

	@Override
	public void setLanguage(String language) {
		_columnBitmask |= LANGUAGE_COLUMN_BITMASK;

		if (_originalLanguage == null) {
			_originalLanguage = _language;
		}

		_language = language;
	}

	public String getOriginalLanguage() {
		return GetterUtil.getString(_originalLanguage);
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public boolean getApproved() {
		return _approved;
	}

	@Override
	public boolean isApproved() {
		return _approved;
	}

	@Override
	public void setApproved(boolean approved) {
		_columnBitmask |= APPROVED_COLUMN_BITMASK;

		if (!_setOriginalApproved) {
			_setOriginalApproved = true;

			_originalApproved = _approved;
		}

		_approved = approved;
	}

	public boolean getOriginalApproved() {
		return _originalApproved;
	}

	@Override
	public String getApprovedByUser() {
		if (_approvedByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _approvedByUser;
		}
	}

	@Override
	public void setApprovedByUser(String approvedByUser) {
		_approvedByUser = approvedByUser;
	}

	@Override
	public Date getApprovedDate() {
		return _approvedDate;
	}

	@Override
	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getAttachName() {
		if (_attachName == null) {
			return StringPool.BLANK;
		}
		else {
			return _attachName;
		}
	}

	@Override
	public void setAttachName(String attachName) {
		_attachName = attachName;
	}

	@Override
	public long getFolderId() {
		return _folderId;
	}

	@Override
	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			FAQAnswer.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FAQAnswer toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FAQAnswer)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FAQAnswerImpl faqAnswerImpl = new FAQAnswerImpl();

		faqAnswerImpl.setId(getId());
		faqAnswerImpl.setQuestionid(getQuestionid());
		faqAnswerImpl.setContent(getContent());
		faqAnswerImpl.setAnswerOrder(getAnswerOrder());
		faqAnswerImpl.setAnsweredByUser(getAnsweredByUser());
		faqAnswerImpl.setAnsweredDate(getAnsweredDate());
		faqAnswerImpl.setModifiedByUser(getModifiedByUser());
		faqAnswerImpl.setLanguage(getLanguage());
		faqAnswerImpl.setModifiedDate(getModifiedDate());
		faqAnswerImpl.setApproved(getApproved());
		faqAnswerImpl.setApprovedByUser(getApprovedByUser());
		faqAnswerImpl.setApprovedDate(getApprovedDate());
		faqAnswerImpl.setUserId(getUserId());
		faqAnswerImpl.setAttachName(getAttachName());
		faqAnswerImpl.setFolderId(getFolderId());

		faqAnswerImpl.resetOriginalValues();

		return faqAnswerImpl;
	}

	@Override
	public int compareTo(FAQAnswer faqAnswer) {
		int value = 0;

		value = DateUtil.compareTo(getAnsweredDate(),
				faqAnswer.getAnsweredDate());

		value = value * -1;

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

		if (!(obj instanceof FAQAnswer)) {
			return false;
		}

		FAQAnswer faqAnswer = (FAQAnswer)obj;

		long primaryKey = faqAnswer.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		FAQAnswerModelImpl faqAnswerModelImpl = this;

		faqAnswerModelImpl._originalQuestionid = faqAnswerModelImpl._questionid;

		faqAnswerModelImpl._setOriginalQuestionid = false;

		faqAnswerModelImpl._originalLanguage = faqAnswerModelImpl._language;

		faqAnswerModelImpl._originalApproved = faqAnswerModelImpl._approved;

		faqAnswerModelImpl._setOriginalApproved = false;

		faqAnswerModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FAQAnswer> toCacheModel() {
		FAQAnswerCacheModel faqAnswerCacheModel = new FAQAnswerCacheModel();

		faqAnswerCacheModel.id = getId();

		faqAnswerCacheModel.questionid = getQuestionid();

		faqAnswerCacheModel.content = getContent();

		String content = faqAnswerCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			faqAnswerCacheModel.content = null;
		}

		faqAnswerCacheModel.answerOrder = getAnswerOrder();

		faqAnswerCacheModel.answeredByUser = getAnsweredByUser();

		String answeredByUser = faqAnswerCacheModel.answeredByUser;

		if ((answeredByUser != null) && (answeredByUser.length() == 0)) {
			faqAnswerCacheModel.answeredByUser = null;
		}

		Date answeredDate = getAnsweredDate();

		if (answeredDate != null) {
			faqAnswerCacheModel.answeredDate = answeredDate.getTime();
		}
		else {
			faqAnswerCacheModel.answeredDate = Long.MIN_VALUE;
		}

		faqAnswerCacheModel.modifiedByUser = getModifiedByUser();

		String modifiedByUser = faqAnswerCacheModel.modifiedByUser;

		if ((modifiedByUser != null) && (modifiedByUser.length() == 0)) {
			faqAnswerCacheModel.modifiedByUser = null;
		}

		faqAnswerCacheModel.language = getLanguage();

		String language = faqAnswerCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			faqAnswerCacheModel.language = null;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			faqAnswerCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			faqAnswerCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		faqAnswerCacheModel.approved = getApproved();

		faqAnswerCacheModel.approvedByUser = getApprovedByUser();

		String approvedByUser = faqAnswerCacheModel.approvedByUser;

		if ((approvedByUser != null) && (approvedByUser.length() == 0)) {
			faqAnswerCacheModel.approvedByUser = null;
		}

		Date approvedDate = getApprovedDate();

		if (approvedDate != null) {
			faqAnswerCacheModel.approvedDate = approvedDate.getTime();
		}
		else {
			faqAnswerCacheModel.approvedDate = Long.MIN_VALUE;
		}

		faqAnswerCacheModel.userId = getUserId();

		faqAnswerCacheModel.attachName = getAttachName();

		String attachName = faqAnswerCacheModel.attachName;

		if ((attachName != null) && (attachName.length() == 0)) {
			faqAnswerCacheModel.attachName = null;
		}

		faqAnswerCacheModel.folderId = getFolderId();

		return faqAnswerCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", questionid=");
		sb.append(getQuestionid());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", answerOrder=");
		sb.append(getAnswerOrder());
		sb.append(", answeredByUser=");
		sb.append(getAnsweredByUser());
		sb.append(", answeredDate=");
		sb.append(getAnsweredDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", approved=");
		sb.append(getApproved());
		sb.append(", approvedByUser=");
		sb.append(getApprovedByUser());
		sb.append(", approvedDate=");
		sb.append(getApprovedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", attachName=");
		sb.append(getAttachName());
		sb.append(", folderId=");
		sb.append(getFolderId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.FAQAnswer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionid</column-name><column-value><![CDATA[");
		sb.append(getQuestionid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answerOrder</column-name><column-value><![CDATA[");
		sb.append(getAnswerOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answeredByUser</column-name><column-value><![CDATA[");
		sb.append(getAnsweredByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answeredDate</column-name><column-value><![CDATA[");
		sb.append(getAnsweredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedByUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approved</column-name><column-value><![CDATA[");
		sb.append(getApproved());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedByUser</column-name><column-value><![CDATA[");
		sb.append(getApprovedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedDate</column-name><column-value><![CDATA[");
		sb.append(getApprovedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachName</column-name><column-value><![CDATA[");
		sb.append(getAttachName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>folderId</column-name><column-value><![CDATA[");
		sb.append(getFolderId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = FAQAnswer.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			FAQAnswer.class
		};
	private long _id;
	private long _questionid;
	private long _originalQuestionid;
	private boolean _setOriginalQuestionid;
	private String _content;
	private int _answerOrder;
	private String _answeredByUser;
	private Date _answeredDate;
	private String _modifiedByUser;
	private String _language;
	private String _originalLanguage;
	private Date _modifiedDate;
	private boolean _approved;
	private boolean _originalApproved;
	private boolean _setOriginalApproved;
	private String _approvedByUser;
	private Date _approvedDate;
	private long _userId;
	private String _attachName;
	private long _folderId;
	private long _columnBitmask;
	private FAQAnswer _escapedModel;
}