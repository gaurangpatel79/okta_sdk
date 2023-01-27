package com.api.sdk.okta.oktaSDK.dto.brands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandsLogoResponse {
	
	private String url;

}
