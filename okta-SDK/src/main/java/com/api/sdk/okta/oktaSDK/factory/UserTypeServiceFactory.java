package com.api.sdk.okta.oktaSDK.factory;

import com.api.sdk.okta.oktaSDK.service.UserTypeService;
import com.api.sdk.okta.oktaSDK.service.UserTypeServiceImpl;

public class UserTypeServiceFactory {

	public static UserTypeService getUserTypeService() {
		return new UserTypeServiceImpl();
	}

}
