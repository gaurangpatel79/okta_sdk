package com.api.sdk.okta.oktaSDK.dto.policy;

import java.util.List;

import lombok.Data;

@Data
public class PasswordPolicyPasswordLockout {
	
	private Integer maxAttempts;
	private Integer autoUnlockMinutes;
	private List<Object> userLockoutNotificationChannels;
	private Boolean showLockoutFailures;


}
