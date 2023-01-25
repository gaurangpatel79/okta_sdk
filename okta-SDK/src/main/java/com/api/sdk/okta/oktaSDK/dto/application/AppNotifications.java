package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppNotifications {
	
	private AppVpn vpn;
	private String message;
	private String helpUrl;

}
