package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Accessibility {

	private boolean selfService;
	private String errorRedirectUrl;
	private String loginRedirectUrl;
}
