package com.api.sdk.okta.oktaSDK.dto.organization;

import com.api.sdk.okta.oktaSDK.dto.application.UploadLogo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgLinks {
	
	private OrgSubLinks preferences;
	private UploadLogo uploadLogo;
	private OrgSubLinks oktaCommunication;
	private OrgSubLinks logo;
	private OrgSubLinks oktaSupport;
	private OrgSubLinks contacts;
	

}
