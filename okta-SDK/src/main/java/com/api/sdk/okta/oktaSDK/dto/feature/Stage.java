package com.api.sdk.okta.oktaSDK.dto.feature;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stage {
	
	private String value;
	private String state;

}
