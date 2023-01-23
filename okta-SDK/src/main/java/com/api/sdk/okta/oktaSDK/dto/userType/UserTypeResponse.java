package com.api.sdk.okta.oktaSDK.dto.userType;

import com.api.sdk.okta.oktaSDK.dto.user.Links;
import com.api.sdk.okta.oktaSDK.dto.user.ProfileRequestBody;
import com.api.sdk.okta.oktaSDK.dto.user.UserCredentials;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTypeResponse {

	@JsonProperty(value = "id")
	private String id;

	@JsonProperty(value = "displayName")
	private String displayName;

	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "description")
	private String description;

	@JsonProperty(value = "createdBy")
	private String createdBy;

	@JsonProperty(value = "lastUpdatedBy")
	private String lastUpdatedBy;

	@JsonProperty(value = "created")
	private String created;

	@JsonProperty(value = "lastUpdated")
	private String lastUpdated;

	@JsonProperty(value = "default")
	private boolean defaultValue;

	@JsonProperty(value = "_links")
	private UserTypeLinks links;
}
