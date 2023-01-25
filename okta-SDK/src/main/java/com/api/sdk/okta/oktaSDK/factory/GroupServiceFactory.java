package com.api.sdk.okta.oktaSDK.factory;

import com.api.sdk.okta.oktaSDK.service.group.GroupService;
import com.api.sdk.okta.oktaSDK.service.group.GroupServiceImpl;

public class GroupServiceFactory {

	public static GroupService getGroupService() {
		return new GroupServiceImpl();
	}
}
