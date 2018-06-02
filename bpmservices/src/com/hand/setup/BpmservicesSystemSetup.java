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

import static com.hand.constants.BpmservicesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.hand.constants.BpmservicesConstants;
import com.hand.service.BpmservicesService;


@SystemSetup(extension = BpmservicesConstants.EXTENSIONNAME)
public class BpmservicesSystemSetup
{
	private final BpmservicesService bpmservicesService;

	public BpmservicesSystemSetup(final BpmservicesService bpmservicesService)
	{
		this.bpmservicesService = bpmservicesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		bpmservicesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return BpmservicesSystemSetup.class.getResourceAsStream("/bpmservices/sap-hybris-platform.png");
	}
}
