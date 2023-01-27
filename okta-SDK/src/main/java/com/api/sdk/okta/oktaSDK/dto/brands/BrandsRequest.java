package com.api.sdk.okta.oktaSDK.dto.brands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandsRequest {

	private String customPrivacyPolicyUrl;
	private String agreeToCustomPrivacyPolicy;

}
