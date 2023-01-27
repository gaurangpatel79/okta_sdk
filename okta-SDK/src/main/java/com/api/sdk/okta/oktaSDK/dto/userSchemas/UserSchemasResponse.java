package com.api.sdk.okta.oktaSDK.dto.userSchemas;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSchemasResponse {

	private String id;
	
	@JsonProperty(value = "$schema")
	private String schema;
	private String name;
	private String title;
	private String description;
	private String lastUpdated;
	private String created;
	
	private Definitions definitions;
	private String type;
	private UserProperties properties;
	private UserSchemasLink links;
	
}
