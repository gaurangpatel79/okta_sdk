package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AppGroup {

	private String id;
	private String lastUpdated;
	private int priority;
	private Object profile;
	@JsonProperty(value = "_links")
	private AppGroupLinks links;
}
