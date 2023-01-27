package com.api.sdk.okta.oktaSDK.dto.brands;

import com.api.sdk.okta.oktaSDK.dto.application.UploadLogo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandsThemesLink {

	private UploadLogo favicon;
	private UploadLogo self;
	private UploadLogo logo;

	@JsonProperty(value = "background-image")
	private UploadLogo backgroundImage;

}
