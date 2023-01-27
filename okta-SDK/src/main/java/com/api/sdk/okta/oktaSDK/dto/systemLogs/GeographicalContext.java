package com.api.sdk.okta.oktaSDK.dto.systemLogs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeographicalContext {
	
	private String city;
	private String state;
	private String country;
	private String postalCode;
	private Geolocation geolocation;
}

