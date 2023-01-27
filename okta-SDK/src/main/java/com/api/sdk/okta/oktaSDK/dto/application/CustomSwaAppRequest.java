package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

import lombok.Data;

@Data
public class CustomSwaAppRequest {

	private String label;
    private Accessibility accessibility;
    private Visibility visibility;
    private List<Object> features;
    private String signOnMode;
    private AppCredentials credentials;
    private AppSettings settings;
	
}
