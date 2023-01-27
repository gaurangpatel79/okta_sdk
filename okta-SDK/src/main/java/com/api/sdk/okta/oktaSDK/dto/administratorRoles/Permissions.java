package com.api.sdk.okta.oktaSDK.dto.administratorRoles;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Permissions {
	
	private String label;
	private String created;
	private String lastUpdated;
	private String conditions;
	
	@JsonProperty(value = "_links")
	private AddministratorLinks links;

}
