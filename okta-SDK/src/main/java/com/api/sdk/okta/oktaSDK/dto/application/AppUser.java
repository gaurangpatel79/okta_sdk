package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AppUser {
	
	private String id;
	private String externalId;
	private String created;
	private String lastUpdated;
	private String scope;
	private String status;
	private String statusChanged;
	private String passwordChanged;
	private String syncState;
	private AppUserCredentials credentials;
	private Object profile;
	@JsonProperty(value = "_links")
	private AppUserLinks links;

}
