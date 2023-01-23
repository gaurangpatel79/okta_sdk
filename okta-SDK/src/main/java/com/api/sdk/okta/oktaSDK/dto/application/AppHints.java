package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppHints {
	
	private List<String> allow;

}
