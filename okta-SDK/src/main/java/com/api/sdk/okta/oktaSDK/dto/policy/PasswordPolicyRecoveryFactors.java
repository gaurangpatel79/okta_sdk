package com.api.sdk.okta.oktaSDK.dto.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PasswordPolicyRecoveryFactors {

	@JsonProperty(value = "recovery_question")
	private PasswordPolicyRecoveryQuestions recoveryQuestions;
	
	@JsonProperty(value = "okta_email")
	private PasswordPolicyRecoveryOktaEmail oktaEmail;
	
	@JsonProperty(value = "okta_sms")
	private PasswordPolicyRecoveryOktaSms oktaSms;
	
	@JsonProperty(value = "okta_call")
	private PasswordPolicyRecoveryOktaCall oktaCall;
	
}
