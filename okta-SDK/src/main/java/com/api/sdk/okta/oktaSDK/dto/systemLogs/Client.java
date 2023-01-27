package com.api.sdk.okta.oktaSDK.dto.systemLogs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Client {

	private UserAgent userAgent;
	private String zone;
	private String device;
	private String id;
	private String ipAddress;
	private GeographicalContext geographicalContext;
}
