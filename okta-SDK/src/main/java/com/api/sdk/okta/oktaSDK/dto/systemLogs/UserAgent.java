package com.api.sdk.okta.oktaSDK.dto.systemLogs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAgent {
	
	private String rawUserAgent;
	private String os;
	private String browser;

}
