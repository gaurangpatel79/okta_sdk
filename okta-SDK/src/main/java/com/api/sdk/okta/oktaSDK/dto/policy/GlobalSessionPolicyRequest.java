package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class GlobalSessionPolicyRequest {
	
	private String type;
	private String name;
	private String description;
	private PolicyConditions conditions;

}
