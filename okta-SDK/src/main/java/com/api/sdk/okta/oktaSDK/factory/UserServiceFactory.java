package com.api.sdk.okta.oktaSDK.factory;

import com.api.sdk.okta.oktaSDK.service.UserService;
import com.api.sdk.okta.oktaSDK.service.UserServiceImpl;

public class UserServiceFactory {
	
	
	public static UserService getUserService() {
		return new UserServiceImpl();
	}
	

}
