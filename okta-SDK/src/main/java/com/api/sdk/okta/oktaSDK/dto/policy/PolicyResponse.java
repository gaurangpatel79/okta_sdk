package com.api.sdk.okta.oktaSDK.dto.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PolicyResponse {

	private String id;
	private String status;
	private String name;
	private String description;
	private float priority;
	private boolean system;
	private PolicyConditions conditions;
	private String created;
	private String lastUpdated;
	private Settings settings;
	@JsonProperty(value = "_links")
	private GetLinks links;
	private String type;
}
