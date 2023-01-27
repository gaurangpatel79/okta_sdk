package com.api.sdk.okta.oktaSDK.dto.systemLogs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IpChain {
	
	private String ip;
	private GeographicalContext geographicalContext;
	private String version;
	private String source;

}
