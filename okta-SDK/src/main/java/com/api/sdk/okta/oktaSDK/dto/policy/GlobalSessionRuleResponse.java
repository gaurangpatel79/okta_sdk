package com.api.sdk.okta.oktaSDK.dto.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GlobalSessionRuleResponse {
	
	private String id;
	private String status;
	private String name;
	private Integer priority;
	private String created;
	private String lastUpdated;
	private Boolean system;
	private GlobalSessionRuleConditions conditions;
	private GlobalSessionRuleActions actions;
	@JsonProperty(value = "_links")
	private GlobalSessionRuleLinks links;
	private String type;
}
