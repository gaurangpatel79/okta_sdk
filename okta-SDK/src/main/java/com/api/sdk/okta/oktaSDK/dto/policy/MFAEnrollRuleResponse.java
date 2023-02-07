package com.api.sdk.okta.oktaSDK.dto.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MFAEnrollRuleResponse {
	
	private String id;
	private String status;
	private String name;
	private float priority;
	private String created;
	private String lastUpdated;
	private boolean system;
	private Conditions conditions;
	private Actions actions;
	@JsonProperty(value = "_links")
	private Links links;
	private String type;
}
