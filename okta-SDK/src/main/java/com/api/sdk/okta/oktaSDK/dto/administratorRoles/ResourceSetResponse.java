package com.api.sdk.okta.oktaSDK.dto.administratorRoles;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceSetResponse {

	private String id;
	private String label;
	private String description;
	private String created;
	private String lastUpdated;
	
	@JsonProperty(value = "_links")
	private ResourceLinks links;

}
