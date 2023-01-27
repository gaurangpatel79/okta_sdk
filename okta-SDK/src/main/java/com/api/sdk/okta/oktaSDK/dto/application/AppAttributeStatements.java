package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
public class AppAttributeStatements {
	
	private String type;
	private String name;
	private String namespace;
	@JsonInclude(Include.NON_NULL)
	private List<String> values;
	@JsonInclude(Include.NON_NULL)
	private String filterType;
	@JsonInclude(Include.NON_NULL)
	private String filterValue;
}
