package com.api.sdk.okta.oktaSDK.dto.brands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailDefaultContent {

	private String subject;
	private String body;
	
	@JsonProperty(value = "_links")
	private EmailTemplatesLink links;
}
