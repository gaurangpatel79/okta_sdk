package com.api.sdk.okta.oktaSDK.dto.brands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailTemplates {
	
	private String name;
	
	@JsonProperty(value = "_links")
	private EmailTemplatesLink links;

}
