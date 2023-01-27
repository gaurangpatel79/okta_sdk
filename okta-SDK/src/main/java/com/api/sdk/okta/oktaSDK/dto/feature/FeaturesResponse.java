package com.api.sdk.okta.oktaSDK.dto.feature;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeaturesResponse {
	
	private String id;
	private String type;
	private String status;
	private String name;
	private String description;
	private Stage stage;
	private FeatureLinks links;
	
}
