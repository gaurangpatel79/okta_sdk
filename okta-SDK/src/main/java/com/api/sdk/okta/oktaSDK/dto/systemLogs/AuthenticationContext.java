package com.api.sdk.okta.oktaSDK.dto.systemLogs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticationContext {

	private String authenticationProvider;
	private String credentialProvider;
	private String credentialType;
	private String issuer;

	@JsonProperty(value = "interface")
	private String interfaceRes;

	private int authenticationStep;
	private String externalSessionId;

}
