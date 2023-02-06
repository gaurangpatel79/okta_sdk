package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicySettings {
	
	private PasswordPolicyPassword password;
	private PasswordPolicyRecovery recovery;
	private PasswordPolicyDelegation delegation;
	

}
