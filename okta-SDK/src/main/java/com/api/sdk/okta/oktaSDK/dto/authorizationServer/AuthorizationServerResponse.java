package com.api.sdk.okta.oktaSDK.dto.authorizationServer;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorizationServerResponse {
	
	private String id;
	private String name;
	private String description;
	private List<String> audiences; 
	private String issuer;
	private String issuerMode;
	private String status;
	private String created;
	private String lastUpdated;
	private AuthCredentials credentials;

	@JsonProperty(value = "default")
	private boolean defaultVal; 
	
	@JsonProperty(value = "_links")
	private AuthLinks links; 
	
	
	

}

