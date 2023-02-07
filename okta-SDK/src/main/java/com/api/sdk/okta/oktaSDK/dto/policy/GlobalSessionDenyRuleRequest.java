package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class GlobalSessionDenyRuleRequest {
	
	private String type;
	private String name;
	private GlobalSessionRuleConditions conditions;
	private GlobalSessionRuleActions actions;

}
