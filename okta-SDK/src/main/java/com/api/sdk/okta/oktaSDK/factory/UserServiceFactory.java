package com.api.sdk.okta.oktaSDK.factory;

import com.api.sdk.okta.oktaSDK.service.user.UserService;
import com.api.sdk.okta.oktaSDK.service.user.UserServiceImpl;

public class UserServiceFactory {
	
	
	public static UserService getUserService() {
		return new UserServiceImpl();
	}
	

}
