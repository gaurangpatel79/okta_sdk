package com.api.sdk.okta.oktaSDK.dto.application;

import lombok.Data;

@Data
public class AppUserCredentials {

	private String userName;
	private AppUserPassword password;
}
