package com.api.sdk.okta.oktaSDK.factory;

import com.api.sdk.okta.oktaSDK.service.policy.PolicyService;
import com.api.sdk.okta.oktaSDK.service.policy.PolicyServiceImpl;

public class PolicyServiceFactory {

	public static PolicyService getPolicyService() {
		return new PolicyServiceImpl();
	}
}
