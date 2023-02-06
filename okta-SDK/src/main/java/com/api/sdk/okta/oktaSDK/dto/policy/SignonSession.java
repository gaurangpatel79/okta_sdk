package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class SignonSession {
	
	private Boolean usePersistentCookie;
	private Integer maxSessionIdleMinutes;
	private Integer maxSessionLifetimeMinutes;

}
