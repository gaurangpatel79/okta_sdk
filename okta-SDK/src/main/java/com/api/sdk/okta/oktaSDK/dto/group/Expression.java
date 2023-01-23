package com.api.sdk.okta.oktaSDK.dto.group;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Expression {

	private String value;
	private String type;

}
