package com.api.sdk.okta.oktaSDK.dto.userType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTypeRequest {
	
	private String name;
	private String displayName;
	private String description;

}
