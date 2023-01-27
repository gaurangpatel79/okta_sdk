package com.api.sdk.okta.oktaSDK.dto.application;

import lombok.Data;

@Data
public class BasicAuthAppRequest {
	
	public String name;
    public String label;
    public String signOnMode;
    public AppSettings settings;

}
