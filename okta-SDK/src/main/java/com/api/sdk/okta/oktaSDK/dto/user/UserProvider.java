package com.api.sdk.okta.oktaSDK.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserProvider {
	
	@JsonProperty(value = "type")
	private String type;
	
	@JsonProperty(value = "name")
	private String name;	

}
