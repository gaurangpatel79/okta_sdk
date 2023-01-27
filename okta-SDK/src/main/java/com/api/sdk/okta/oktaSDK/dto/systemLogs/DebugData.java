package com.api.sdk.okta.oktaSDK.dto.systemLogs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DebugData {

	private String requestId;
	private String dtHash;
	private String origin;
	private String requestUri;
	private String threatSuspected;
	private String url;
	
}
