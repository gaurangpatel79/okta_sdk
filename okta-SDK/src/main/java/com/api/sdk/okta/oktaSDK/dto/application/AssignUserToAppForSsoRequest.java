package com.api.sdk.okta.oktaSDK.dto.application;

import lombok.Data;

@Data
public class AssignUserToAppForSsoRequest {
	
	private String id;
	private String scope;
	private AppUserCredentials credentials;

}
