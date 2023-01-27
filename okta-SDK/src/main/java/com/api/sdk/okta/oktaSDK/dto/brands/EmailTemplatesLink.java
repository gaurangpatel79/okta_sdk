package com.api.sdk.okta.oktaSDK.dto.brands;

import com.api.sdk.okta.oktaSDK.dto.application.UploadLogo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailTemplatesLink {
	
	private UploadLogo settings;
	private UploadLogo self;
	private UploadLogo defaultContent;
	private UploadLogo test;
	private UploadLogo customizations;
	private UploadLogo preview;
	private UploadLogo template;

}
