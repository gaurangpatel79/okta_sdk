package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data	
public class PasswordPolicyRecoveryCredentials {
	
	private PasswordPolicyRecoveryToken recoveryToken;
	private PasswordPolicySecurityAnswer securityAnswer;
	private PasswordPolicySms sms;

}
