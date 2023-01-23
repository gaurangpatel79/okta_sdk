package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppLinks {

	private UploadLogo uploadLogo;
	private List<AppSubLinks> appLinks;
	private AppSubLinks groups;
	private List<AppSubLinks> logo;
	private List<AppSubLinks> clientCredentials;
	private AppSubLinks users;
	private AppSubLinks deactivate;

}
