package com.api.sdk.okta.oktaSDK.dto.group;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties
public class RulesRequest {

	private String type;
	private String name;
	private Conditions conditions;
	private RuleActions actions;
	
}
