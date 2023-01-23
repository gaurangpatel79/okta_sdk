package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppIdpInitiatedLogin {
	
	private String mode;
	private List<String> default_scope;

}
