package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class App {

	private String loginUrlRegex;
	private String authURL;
	private String url;
	private String buttonField;
	private String passwordField;
	private String usernameField;
	private String redirectUrl;
	private String checkbox;
	private String audienceRestriction;
	private Object groupName;
	private String groupValueFormat;
	private String realm;
	@JsonProperty(value = "wReplyURL")
	private String wReplyURL;
	private Object attributeStatements;
	private String nameIDFormat;
	private String authnContextClassRef;
	private String siteURL;
	@JsonProperty(value = "wReplyOverride")
	private boolean wReplyOverride;
	private Object groupFilter;
	private String usernameAttribute;
	@JsonInclude(Include.NON_NULL)
	private String digestAlgorithm;
	@JsonInclude(Include.NON_NULL)
	private String signatureAlgorithm;
	private String optionalField1;
	private String optionalField1Value;
	private String optionalField2;
	private String optionalField2Value;
	private String optionalField3;
	private String optionalField3Value;
}
