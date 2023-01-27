package com.api.sdk.okta.oktaSDK.dto.userSchemas;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Master {
	
	private String type;

}
