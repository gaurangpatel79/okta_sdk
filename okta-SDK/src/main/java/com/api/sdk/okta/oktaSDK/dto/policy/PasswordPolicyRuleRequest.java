package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyRuleRequest {
	
	private String type;
	private String name;
	private PasswordPolicyRuleConditions conditions;
	private PasswordPolicyRuleActions actions;

}
