package com.api.sdk.okta.oktaSDK.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Email {

	@JsonProperty(value = "value")
	private String value;

	@JsonProperty(value = "status")
	private String status;

	@JsonProperty(value = "type")
	private String type;
}
