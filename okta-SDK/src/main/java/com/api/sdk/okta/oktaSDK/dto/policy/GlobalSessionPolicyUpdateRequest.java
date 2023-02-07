package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class GlobalSessionPolicyUpdateRequest {
	
	private String name;
	private String description;
	private PolicyConditions conditions;

}
