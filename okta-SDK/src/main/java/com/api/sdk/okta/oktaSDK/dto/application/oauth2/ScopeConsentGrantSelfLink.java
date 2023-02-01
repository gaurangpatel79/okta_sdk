package com.api.sdk.okta.oktaSDK.dto.application.oauth2;

import com.api.sdk.okta.oktaSDK.dto.application.AppHints;

import lombok.Data;

@Data
public class ScopeConsentGrantSelfLink {
	
	private String href;
	private AppHints hints;

}
