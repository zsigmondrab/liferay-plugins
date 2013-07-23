package com.liferay.netvibeswidget.util;

import com.liferay.util.portlet.PortletProps;
public interface NetvibesConstants {

	public static final String FEED_PROVIDER_URL = PortletProps.get(
		"netvibes.feedProviderURL");

	public static final String UWA_URL = PortletProps.get("netvibes.uwaURL");

}