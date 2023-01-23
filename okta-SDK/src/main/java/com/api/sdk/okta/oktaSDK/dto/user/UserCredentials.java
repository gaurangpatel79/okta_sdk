package com.api.sdk.okta.oktaSDK.dto.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCredentials {

	@JsonProperty(value = "password")
	private UserPassword password;

	@JsonProperty(value = "recovery_question")
	private RecoveryQuestion recoveryQuestion;

	@JsonProperty(value = "provider")
	private UserProvider provider;
	
	@JsonProperty(value = "emails")
	private List<Email> emails;
}
