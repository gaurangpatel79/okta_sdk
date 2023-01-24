package com.api.sdk.okta.oktaSDK.factory;

import com.api.sdk.okta.oktaSDK.service.GroupService;
import com.api.sdk.okta.oktaSDK.service.GroupServiceImpl;

public class GroupServiceFactory {

	public static GroupService getGroupService() {
		return new GroupServiceImpl();
	}
}
