package com.api.sdk.okta.oktaSDK.dto.userType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTypeLinks {

	@JsonProperty(value = "schema")
	private UserTypeSubLink schema;
	
	@JsonProperty(value = "self")
	private UserTypeSubLink self;

}
