package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyRuleConditions {

	private PasswordPolicyRulePeople people;
	private PasswordPolicyRuleNetwork network;
}
