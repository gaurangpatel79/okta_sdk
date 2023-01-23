package com.api.sdk.okta.oktaSDK.dto.userType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTypeSubLink {
	
	@JsonProperty(value = "rel")
	private String rel;
	
	@JsonProperty(value = "href")
	private String href;
	
	@JsonProperty(value = "method")
	private String method;
	

}
