package com.api.sdk.okta.oktaSDK.dto.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PasswordPolicyResponse {
	
	private String id;
	private String status;
	private String name;
	private String description;
	private Integer priority;
	private Boolean system;
	private PasswordPolicyConditions conditions;
	private String created;
	private String lastUpdated;
	private PasswordPolicySettings settings;
	@JsonProperty(value = "_links")
	private PasswordPolicyLinks links;
	private String type;
	
	
}
