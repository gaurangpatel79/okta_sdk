package com.api.sdk.okta.oktaSDK.service.authorizationServer;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.authorizationServer.AuthorizationServerResponse;

public interface AuthorizationServerService {

	public List<AuthorizationServerResponse> getAllAuthorizationServers();

	public AuthorizationServerResponse createAuthorizationServer(
			AuthorizationServerResponse authorizationServerResponse);

	public AuthorizationServerResponse getAuthorizationServerById(String authorizationServerId);

	public AuthorizationServerResponse updateAuthorizationServer(String authorizationServerId,
			AuthorizationServerResponse authorizationServerResponse);

	public String deleteAuthorizationServerById(String authorizationServerId);

	public String activateAuthorizationServer(String authorizationServerId);

	public String deactivateAuthorizationServer(String authorizationServerId);

}
