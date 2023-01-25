package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

import lombok.Data;

@Data
public class AppSignOnRequest {

	private String destinationOverride;
	private List<AppAttributeStatements> attributeStatements;
}
