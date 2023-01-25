package com.api.sdk.okta.oktaSDK.factory;

import com.api.sdk.okta.oktaSDK.service.userType.UserTypeService;
import com.api.sdk.okta.oktaSDK.service.userType.UserTypeServiceImpl;

public class UserTypeServiceFactory {

	public static UserTypeService getUserTypeService() {
		return new UserTypeServiceImpl();
	}

}
