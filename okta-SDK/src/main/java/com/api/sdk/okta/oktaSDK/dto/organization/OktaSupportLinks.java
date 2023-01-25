package com.api.sdk.okta.oktaSDK.dto.organization;

import com.api.sdk.okta.oktaSDK.dto.application.UploadLogo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OktaSupportLinks {
	
	private UploadLogo grant;

	private UploadLogo extend;
	private UploadLogo revoke;
}

