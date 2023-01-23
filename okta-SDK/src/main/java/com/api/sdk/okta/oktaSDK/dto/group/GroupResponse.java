package com.api.sdk.okta.oktaSDK.dto.group;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupResponse {

	@JsonProperty(value = "id")
	private String id;

	@JsonProperty(value = "created")
	private String created;

	@JsonProperty(value = "lastUpdated")
	private String lastUpdated;

	@JsonProperty(value = "lastMembershipUpdated")
	private String lastMembershipUpdated;

	@JsonProperty(value = "objectClass")
	private List<String> objectClass;
	private String type;

	@JsonProperty(value = "profile")
	private GroupProfile profile;

	@JsonProperty(value = "_links")
	private GroupLinks links;

}
