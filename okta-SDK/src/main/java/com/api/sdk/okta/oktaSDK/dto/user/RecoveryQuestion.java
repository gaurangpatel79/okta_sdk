package com.api.sdk.okta.oktaSDK.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecoveryQuestion {

	@JsonProperty(value = "question")
	private String question;
	
	@JsonProperty(value = "answer")
	private String answer;
}
