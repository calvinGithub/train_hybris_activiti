/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.hand.components.navigationarea;

import de.hybris.platform.cockpit.components.navigationarea.DefaultNavigationAreaModel;
import de.hybris.platform.cockpit.session.impl.AbstractUINavigationArea;

import com.hand.session.impl.HepbaseNavigationArea;


/**
 * Hepbase navigation area model.
 */
public class HepbaseNavigationAreaModel extends DefaultNavigationAreaModel
{
	public HepbaseNavigationAreaModel()
	{
		super();
	}

	public HepbaseNavigationAreaModel(final AbstractUINavigationArea area)
	{
		super(area);
	}

	@Override
	public HepbaseNavigationArea getNavigationArea()
	{
		return (HepbaseNavigationArea) super.getNavigationArea();
	}
}
