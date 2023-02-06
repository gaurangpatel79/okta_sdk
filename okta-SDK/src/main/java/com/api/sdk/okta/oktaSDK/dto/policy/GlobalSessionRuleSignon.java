package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class GlobalSessionRuleSignon {
	
	private String access;
	private Boolean requireFactor;
	private String primaryFactor;
	private String factorPromptMode;
	private Boolean rememberDeviceByDefault;
	private SignonSession session;
	

}
