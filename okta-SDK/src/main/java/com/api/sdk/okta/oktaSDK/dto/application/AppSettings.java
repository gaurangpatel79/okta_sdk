package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppSettings {
	
	private App app;
	private AppNotifications notifications;
	private AppNotes notes;
	private AppSignOn signOn;
	private AppOauthClient oauthClient;

}
