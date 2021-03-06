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

package com.liferay.contenttargeting.rules.scorepoints.service.persistence;

import com.liferay.contenttargeting.rules.scorepoints.model.ScorePoint;
import com.liferay.contenttargeting.rules.scorepoints.service.ScorePointLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ScorePointActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ScorePointActionableDynamicQuery() throws SystemException {
		setBaseLocalService(ScorePointLocalServiceUtil.getService());
		setClass(ScorePoint.class);

		setClassLoader(com.liferay.contenttargeting.rules.scorepoints.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("scorePointId");
	}
}