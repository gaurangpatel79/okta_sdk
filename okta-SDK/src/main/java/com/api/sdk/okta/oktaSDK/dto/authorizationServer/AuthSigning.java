package com.api.sdk.okta.oktaSDK.dto.authorizationServer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthSigning {

	private String kid;
	private String rotationMode;
	private String lastRotated;
	private String nextRotation;
}
