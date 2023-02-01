package com.api.sdk.okta.oktaSDK.dto.application.oauth2;

import lombok.Data;

@Data
public class ScopeConsentGrantRequest {
	
	private String issuer;
	private String scopeId;

}
