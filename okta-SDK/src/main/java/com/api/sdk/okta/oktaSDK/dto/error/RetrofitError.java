package com.api.sdk.okta.oktaSDK.dto.error;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetrofitError {

	private String errorCode;
	private String errorSummary;
	private String errorLink;
	private String errorId;
	private List<ErrorCause> errorCauses;

}
