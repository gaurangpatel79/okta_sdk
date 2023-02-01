package com.api.sdk.okta.oktaSDK.dto.application.credentials;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.application.Accessibility;
import com.api.sdk.okta.oktaSDK.dto.application.AppCredentials;
import com.api.sdk.okta.oktaSDK.dto.application.AppSettings;
import com.api.sdk.okta.oktaSDK.dto.application.Visibility;

import lombok.Data;

@Data
public class UpdatePluginAppCredentialsRequest {
	
	private String name;
	private String label;
	private String status;
    private Accessibility accessibility;
    private Visibility visibility;
    private List<Object> features;
    private String signOnMode;
    private AppCredentials credentials;
    private AppSettings settings;

}
