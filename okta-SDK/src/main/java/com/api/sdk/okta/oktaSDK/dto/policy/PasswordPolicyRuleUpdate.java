package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyRuleUpdate {

	private String type;
	private String id;
	private String status;
	private String name;
	private Integer priority;
	private Boolean system;
	private PasswordPolicyRuleConditions conditions;
	private PasswordPolicyRuleActions actions;
}
