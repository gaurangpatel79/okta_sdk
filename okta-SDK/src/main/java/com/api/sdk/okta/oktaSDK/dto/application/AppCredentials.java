package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppCredentials {
	
	private String scheme;
	private UserNameTemplate userNameTemplate;
	private AppSigning signing;
	@JsonInclude(Include.NON_NULL)
	private AppOauthClient oauthClient;
	private boolean revealPassword;

}
