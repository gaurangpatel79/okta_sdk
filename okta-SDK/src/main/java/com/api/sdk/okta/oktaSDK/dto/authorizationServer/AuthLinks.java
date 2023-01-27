package com.api.sdk.okta.oktaSDK.dto.authorizationServer;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthLinks {

	private AuthSubLinks rotateKey;
	private List<AuthSubLinks> metadata;
	private AuthSubLinks keys;
	private AuthSubLinks claims;
	private AuthSubLinks policies;
	private AuthSubLinks self;
	private AuthSubLinks scopes;
	private AuthSubLinks deactivate;

}
