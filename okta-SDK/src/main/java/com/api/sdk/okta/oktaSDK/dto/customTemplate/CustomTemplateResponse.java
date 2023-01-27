package com.api.sdk.okta.oktaSDK.dto.customTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomTemplateResponse {
	
	private String id;
	private String name;
	private String type;
	private String template;
	private String created;
	private String lastUpdated;
	private Translations translations;

}
