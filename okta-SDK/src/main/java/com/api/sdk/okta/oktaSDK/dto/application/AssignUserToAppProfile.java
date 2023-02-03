package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

import lombok.Data;

@Data
public class AssignUserToAppProfile {
	
	private List<String> roles;
	private String accountType;
	private String role;
	private String region;
	private List<String> groups;

}
