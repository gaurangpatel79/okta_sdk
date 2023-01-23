package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppCredentials {
	
	private UserNameTemplate userNameTemplate;
	private AppSigning signing;
	private AppOauthClient oauthClient;

}
