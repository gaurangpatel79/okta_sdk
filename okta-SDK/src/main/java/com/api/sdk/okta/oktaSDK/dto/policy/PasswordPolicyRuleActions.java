package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyRuleActions {
	
	private PasswordPolicyRuleActionDetails passwordChange;
	private PasswordPolicyRuleActionDetails selfServicePasswordReset;
	private PasswordPolicyRuleActionDetails selfServiceUnlock;

}
