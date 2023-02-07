package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class MFAEnrollRuleRequest {
	
	private String type;
	private String status;
	private String name;
	private boolean system;
	private Conditions conditions;
	private Actions actions;	

}
