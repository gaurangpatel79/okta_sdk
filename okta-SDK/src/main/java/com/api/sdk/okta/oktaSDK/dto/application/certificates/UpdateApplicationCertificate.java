package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import com.api.sdk.okta.oktaSDK.dto.application.AppCredentials;

import lombok.Data;

@Data
public class UpdateApplicationCertificate {

	private String name;
	private String label;
	private String signOnMode;
	private AppCredentials credentials;
	
}
