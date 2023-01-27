package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppSettings {
	
	@JsonInclude(Include.NON_NULL)
	private App app;
	@JsonInclude(Include.NON_NULL)
	private AppNotifications notifications;
	@JsonInclude(Include.NON_NULL)
	private AppNotes notes;
	@JsonInclude(Include.NON_NULL)
	private AppSignOn signOn;
	private AppOauthClient oauthClient;

}
