package com.api.sdk.okta.oktaSDK.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivateResponse {
	
	private String activationUrl;
	private String activationToken;

}
