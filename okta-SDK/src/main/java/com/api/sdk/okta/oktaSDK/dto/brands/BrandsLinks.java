package com.api.sdk.okta.oktaSDK.dto.brands;

import com.api.sdk.okta.oktaSDK.dto.application.UploadLogo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandsLinks {
	private UploadLogo themes;
	private UploadLogo self;
}
