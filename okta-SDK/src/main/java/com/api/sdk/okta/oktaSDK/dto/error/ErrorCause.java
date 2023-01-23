package com.api.sdk.okta.oktaSDK.dto.error;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorCause {

	private String errorSummary;

}
