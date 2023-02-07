package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyRequest {
	
	private String type;
	private String name;
	private String description;
	private PasswordPolicyConditions conditions;
	private PasswordPolicySettings settings;

}
