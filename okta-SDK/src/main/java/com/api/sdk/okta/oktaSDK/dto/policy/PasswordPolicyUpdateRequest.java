package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyUpdateRequest {
	
	private String type;
	private String id;
	private String status;
	private String name;
	private String description;
	private Integer priority;
	private Boolean system;
	private PasswordPolicyConditions conditions;

}
