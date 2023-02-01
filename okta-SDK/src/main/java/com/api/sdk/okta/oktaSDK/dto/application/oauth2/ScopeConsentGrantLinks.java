package com.api.sdk.okta.oktaSDK.dto.application.oauth2;

import lombok.Data;

@Data
public class ScopeConsentGrantLinks {
	
	private ScopeConsentGrantSubLink app;
	private ScopeConsentGrantSelfLink self;
	private ScopeConsentGrantSubLink client;
}
