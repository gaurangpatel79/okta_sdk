package com.api.sdk.okta.oktaSDK.dto.organization;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailAddresses {
	
	private List<String> emailAddresses;

}
