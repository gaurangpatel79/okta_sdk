package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class GlobalSessionRadiusRuleRequest {
	
	private String type;
	private String status;
	private String name;
	private GlobalSessionRuleConditions conditions;
	private GlobalSessionRuleActions actions;

}
