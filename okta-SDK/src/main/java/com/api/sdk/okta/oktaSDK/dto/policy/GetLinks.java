package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class GetLinks {

	private SubLinks self;
	private SubLinks rules;
	private SubLinks deactivate;
}