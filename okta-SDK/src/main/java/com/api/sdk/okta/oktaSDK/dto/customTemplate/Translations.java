package com.api.sdk.okta.oktaSDK.dto.customTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Translations {

	private String es;
	private String fr;
	private String it;

}
