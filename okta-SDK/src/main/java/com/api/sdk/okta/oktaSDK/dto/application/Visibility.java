package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Visibility {
	
	private boolean autoLaunch;
	private boolean autoSubmitToolbar;
	private Hide hide;
	private Map<String, Object> appLinks;

}
