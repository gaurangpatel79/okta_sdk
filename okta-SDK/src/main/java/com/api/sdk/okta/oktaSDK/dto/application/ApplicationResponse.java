package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationResponse {

	private String id;
	private String name;
	private String label;
	private String status;
	private String lastUpdated;
	private String created;
	private Accessibility accessibility;
	private Visibility visibility;
	private Object features; 
	
	@JsonProperty(value = "request_object_signing_alg")
	private String requestObjectSigningAlg;
	private String signOnMode;
	private AppCredentials credentials;
	private AppSettings settings;

	@JsonProperty(value = "_links")
	private AppLinks links;
	
	private AppProfile profile;
}
