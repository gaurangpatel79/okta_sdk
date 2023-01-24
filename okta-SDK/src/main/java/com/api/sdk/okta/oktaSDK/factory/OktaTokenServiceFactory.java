package com.api.sdk.okta.oktaSDK.factory;

import com.api.sdk.okta.oktaSDK.service.OktaTokenService;
import com.api.sdk.okta.oktaSDK.service.OktaTokenServiceImpl;

public class OktaTokenServiceFactory {

	public static OktaTokenService getOktaTokenService() {
		return new OktaTokenServiceImpl();
	}

}
