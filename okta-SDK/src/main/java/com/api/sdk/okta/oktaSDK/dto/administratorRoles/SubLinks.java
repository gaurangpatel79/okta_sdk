package com.api.sdk.okta.oktaSDK.dto.administratorRoles;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubLinks {

	private String href;

}