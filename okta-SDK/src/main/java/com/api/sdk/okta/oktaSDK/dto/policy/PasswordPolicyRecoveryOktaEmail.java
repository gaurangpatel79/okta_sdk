package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyRecoveryOktaEmail {

	private String status;
	private PasswordPolicyRecoveryOktaEmailProperties properties;
}
