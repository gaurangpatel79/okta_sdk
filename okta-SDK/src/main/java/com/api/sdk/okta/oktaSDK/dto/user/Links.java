package com.api.sdk.okta.oktaSDK.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {

	@JsonProperty(value = "suspend")
	private SubLinks suspend;
	
	@JsonProperty(value = "activate")
	private SubLinks activate;
	
	@JsonProperty(value = "self")
	private SubLinks self;
	
	@JsonProperty(value = "resetPassword")
	private SubLinks resetPassword;
	
	@JsonProperty(value = "resetFactors")
	private SubLinks resetFactors;
	
	@JsonProperty(value = "expirePassword")
	private SubLinks expirePassword;
	
	@JsonProperty(value = "forgotPassword")
	private SubLinks forgotPassword;
	
	@JsonProperty(value = "changeRecoveryQuestion")
	private SubLinks changeRecoveryQuestion;
	
	@JsonProperty(value = "deactivate")
	private SubLinks deactivate;
	
	@JsonProperty(value = "changePassword")
	private SubLinks changePassword;
	
	@JsonProperty(value = "schema")
	private SubLinks schema;
	
	@JsonProperty(value = "type")
	private SubLinks type;

}