package com.api.sdk.okta.oktaSDK.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	@JsonProperty(value = "id")
	private String id;

	@JsonProperty(value = "status")
	private String status;

	@JsonProperty(value = "created")
	private String created;

	@JsonProperty(value = "activated")
	private String activated;

	@JsonProperty(value = "statusChanged")
	private String statusChanged;

	@JsonProperty(value = "lastLogin")
	private String lastLogin;

	@JsonProperty(value = "lastUpdated")
	private String lastUpdated;

	@JsonProperty(value = "passwordChanged")
	private String passwordChanged;

	@JsonProperty(value = "profile")
	private ProfileRequestBody profile;

	@JsonProperty(value = "credentials")
	private UserCredentials credentials;

	@JsonProperty(value = "_links")
	private Links links;
}
