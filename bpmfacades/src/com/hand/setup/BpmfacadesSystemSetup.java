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
package com.hand.setup;

import static com.hand.constants.BpmfacadesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.hand.constants.BpmfacadesConstants;
import com.hand.service.BpmfacadesService;


@SystemSetup(extension = BpmfacadesConstants.EXTENSIONNAME)
public class BpmfacadesSystemSetup
{
	private final BpmfacadesService bpmfacadesService;

	public BpmfacadesSystemSetup(final BpmfacadesService bpmfacadesService)
	{
		this.bpmfacadesService = bpmfacadesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		bpmfacadesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return BpmfacadesSystemSetup.class.getResourceAsStream("/bpmfacades/sap-hybris-platform.png");
	}
}
