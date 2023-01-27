package com.api.sdk.okta.oktaSDK.dto.brands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandsResponse {
	
	private String id;
	private boolean removePoweredByOkta;
	private String customPrivacyPolicyUrl;
	
	@JsonProperty(value = "_links")
	private BrandsLinks links;

}
