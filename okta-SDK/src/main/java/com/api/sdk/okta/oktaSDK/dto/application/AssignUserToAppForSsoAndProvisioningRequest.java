package com.api.sdk.okta.oktaSDK.dto.application;

import lombok.Data;

@Data
public class AssignUserToAppForSsoAndProvisioningRequest {
	
	private String id;
	private String scope;
	private AppUserCredentials credentials;
	private AssignUserToAppProfile profile;
	
}
