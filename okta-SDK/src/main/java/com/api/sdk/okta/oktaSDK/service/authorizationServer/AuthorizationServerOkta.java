package com.api.sdk.okta.oktaSDK.service.authorizationServer;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.authorizationServer.AuthorizationServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AuthorizationServerOkta {
	
	@GET("/api/v1/authorizationServers")
	public Call<List<AuthorizationServerResponse>> getAllAuthorizationServers();

	@POST("/api/v1/authorizationServers")
	public Call<AuthorizationServerResponse> createAuthorizationServer(@Body AuthorizationServerResponse authorizationServerResponse);

	@GET("/api/v1/authorizationServers/{authorizationServerId}")
	public Call<AuthorizationServerResponse> getAuthorizationServerById(@Path("authorizationServerId") String authorizationServerId);
	
	@PUT("/api/v1/authorizationServers/{authorizationServerId}")
	public Call<AuthorizationServerResponse> updateAuthorizationServer(@Path("authorizationServerId") String authorizationServerId,@Body AuthorizationServerResponse authorizationServerResponse);

	@GET("/api/v1/authorizationServers/{authorizationServerId}")
	public Call<Void> deleteAuthorizationServerById(@Path("authorizationServerId") String authorizationServerId);

	@POST("/api/v1/authorizationServers/{authorizationServerId}/lifecycle/activate")
	public Call<Void> activateAuthorizationServer(@Path("authorizationServerId") String authorizationServerId);

	@POST("/api/v1/authorizationServers/{authorizationServerId}/lifecycle/activate")
	public Call<Void> deactivateAuthorizationServer(@Path("authorizationServerId") String authorizationServerId);

}
