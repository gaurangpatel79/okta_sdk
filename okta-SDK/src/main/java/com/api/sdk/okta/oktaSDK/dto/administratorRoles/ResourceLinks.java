package com.api.sdk.okta.oktaSDK.dto.administratorRoles;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceLinks {

	private SubLinks bindings;
	private SubLinks self;
	private SubLinks resources;
	
	@JsonProperty(value = "resource-set")
	private SubLinks resourceSet;
	

}
