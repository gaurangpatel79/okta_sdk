package com.api.sdk.okta.oktaSDK.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PasswordRequest {
	
	@JsonProperty(value = "value")
	private String value;

}
