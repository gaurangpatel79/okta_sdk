package com.api.sdk.okta.oktaSDK.dto.userSchemas;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubProperties {

	private String title;
	private String type;
	private boolean required; 
	private String mutability;
	private String scope;
	private Long minLength; 
	private Long maxLength;
	
	private List<Permissions> permissions;
	private Master master;
	
}
