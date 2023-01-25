package com.api.sdk.okta.oktaSDK.dto.application;

import lombok.Data;

@Data
public class AppSettingsRequest {

	private AppRequest app;
	private AppSignOnRequest signOn;
}
