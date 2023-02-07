package com.api.sdk.okta.oktaSDK.dto.application;

import lombok.Data;

@Data
public class AppGroupLinks {
	
	private AppUserSubLink app;
	private AppUserSubLink self;
	private AppUserSubLink group;
}
