package com.api.sdk.okta.oktaSDK.dto.organization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserLink {
	
	private OrgSubLinks user;	

}
