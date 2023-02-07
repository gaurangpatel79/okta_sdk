package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class MFAEnrollRuleUpdateRequest {

	private String id;
	private String status;
	private String name;
	private float priority;
	private boolean system;
	private Conditions conditions;
	private Actions actions;
	private String type;

}
