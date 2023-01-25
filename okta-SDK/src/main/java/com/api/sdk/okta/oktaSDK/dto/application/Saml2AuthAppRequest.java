package com.api.sdk.okta.oktaSDK.dto.application;

import lombok.Data;

@Data
public class Saml2AuthAppRequest {
	
	private String name;
	private  String label;
	private String signOnMode;
	private AppSettingsRequest settings;
}
