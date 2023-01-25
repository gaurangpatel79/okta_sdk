package com.api.sdk.okta.oktaSDK.factory;

import com.api.sdk.okta.oktaSDK.service.application.ApplicationService;
import com.api.sdk.okta.oktaSDK.service.application.ApplicationServiceImpl;

public class ApplicationServiceFactory {

	public static ApplicationService getApplicationService() {
		return new ApplicationServiceImpl();
	}

}
