package com.api.sdk.okta.oktaSDK.dto.brands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailCustomizations {
	
	private String subject;
	private String body;
	private String id;
	private String language;
	private boolean isDefault;
	private String created;
	private String lastUpdated;
	
	@JsonProperty(value = "_links")
	private EmailTemplatesLink link;

}
