package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

public class CustomSwaAppRequest {

	public String label;
    public Accessibility accessibility;
    public Visibility visibility;
    public List<Object> features;
    public String signOnMode;
    public AppCredentials credentials;
    public AppSettings settings;
	
}
