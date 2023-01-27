package com.api.sdk.okta.oktaSDK.dto.systemLogs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecurityContext {
	
	private Long asNumber;
	private String asOrg;
	private String isp;
	private String domain;
	private boolean isProxy;
	
}
