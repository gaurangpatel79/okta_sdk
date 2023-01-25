package com.api.sdk.okta.oktaSDK.dto.organization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OktaSupportSetting {
	
	private String support;
	private String expiration;
	@JsonProperty(value = "_links")
	private OktaSupportLinks links;
	
}
