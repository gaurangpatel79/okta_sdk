package com.api.sdk.okta.oktaSDK.dto.group;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties
public class Conditions {

	private People people;
	private Expression expression;
	
}
