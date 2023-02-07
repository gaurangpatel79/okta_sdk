package com.api.sdk.okta.oktaSDK.dto.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Factors {

	@JsonProperty(value = "okta_otp")
	private SubFactors oktaOtp;
	@JsonProperty(value = "okta_sms")
	private SubFactors oktaSms;
	@JsonProperty(value = "symantec_vip")
	private SubFactors symantecVip;
	@JsonProperty(value = "google_otp")
	private SubFactors googleOtp;
	@JsonProperty(value = "fido_webauthn")
	private SubFactors fidoWebauthn;
	@JsonProperty(value = "okta_password")
	private SubFactors oktaPassword;
}
