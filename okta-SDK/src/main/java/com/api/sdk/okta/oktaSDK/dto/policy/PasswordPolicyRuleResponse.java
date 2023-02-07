package com.api.sdk.okta.oktaSDK.dto.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PasswordPolicyRuleResponse {

	private String id;
	private String status;
	private String name;
	private Integer priority;
	private String created;
	private String lastUpdated;
	private Boolean system;
	private PasswordPolicyRuleConditions conditions;
	private PasswordPolicyRuleActions actions;
	private String type;
	@JsonProperty(value = "_links")
	private PasswordPolicyRuleLinks links;

}
