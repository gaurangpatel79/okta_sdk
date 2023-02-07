package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyConditions {
	
	private PasswordPolicyPeople people;
	private PasswordPolicyAuthProvider authProvider;

}
