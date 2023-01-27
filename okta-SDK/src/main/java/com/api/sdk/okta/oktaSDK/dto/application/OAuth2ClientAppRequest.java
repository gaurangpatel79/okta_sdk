package com.api.sdk.okta.oktaSDK.dto.application;

import lombok.Data;

@Data
public class OAuth2ClientAppRequest {
	
	private String name;
    private String label;
    private String signOnMode;
    private AppCredentials credentials;
    private AppProfile profile;
    private AppSettings settings;

}
