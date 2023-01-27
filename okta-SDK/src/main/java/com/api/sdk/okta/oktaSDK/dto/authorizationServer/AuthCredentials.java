package com.api.sdk.okta.oktaSDK.dto.authorizationServer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthCredentials {

	private AuthSigning signing;

}
