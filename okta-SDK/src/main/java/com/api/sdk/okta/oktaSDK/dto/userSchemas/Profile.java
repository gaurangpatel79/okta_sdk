package com.api.sdk.okta.oktaSDK.dto.userSchemas;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {
	
	private List<AllOf> allOf;

}
