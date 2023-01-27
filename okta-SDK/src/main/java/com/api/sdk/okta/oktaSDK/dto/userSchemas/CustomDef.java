package com.api.sdk.okta.oktaSDK.dto.userSchemas;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomDef {

	private String id;
	private String type;
	private Map<String, SubProperties> properties;
//	private Properties properties;
}
