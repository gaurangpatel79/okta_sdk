package com.api.sdk.okta.oktaSDK.dto.group;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupProfile {
	
	@JsonProperty(value = "name")
	private String name;
	
	@JsonProperty(value = "description")
	private String description;

}
