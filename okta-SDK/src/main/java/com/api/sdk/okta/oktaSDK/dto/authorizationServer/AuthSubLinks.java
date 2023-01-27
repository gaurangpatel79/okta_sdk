package com.api.sdk.okta.oktaSDK.dto.authorizationServer;

import com.api.sdk.okta.oktaSDK.dto.application.AppHints;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthSubLinks {
	
	private String href;
	private String name;
	private AppHints hints;

}
