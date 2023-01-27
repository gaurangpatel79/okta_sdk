package com.api.sdk.okta.oktaSDK.dto.feature;

import com.api.sdk.okta.oktaSDK.dto.application.UploadLogo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureLinks {
	
	private UploadLogo helpDoc;
	private UploadLogo enable;
	private UploadLogo self;
	private UploadLogo dependents;
	private UploadLogo dependencies;
	private UploadLogo survey;
	

}
