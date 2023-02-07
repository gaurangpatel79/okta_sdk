package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyPassword {
	
	private PasswordPolicyComplexity complexity;
	private PasswordPolicyPasswordAge age;
	private PasswordPolicyPasswordLockout lockout;

}
