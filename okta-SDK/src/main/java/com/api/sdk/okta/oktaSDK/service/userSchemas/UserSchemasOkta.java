package com.api.sdk.okta.oktaSDK.service.userSchemas;

import com.api.sdk.okta.oktaSDK.dto.userSchemas.Definitions;
import com.api.sdk.okta.oktaSDK.dto.userSchemas.UserSchemasResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserSchemasOkta {

	@GET("/api/v1/meta/schemas/user/default")
	public Call<UserSchemasResponse> getUserSchemas();

	@POST("/api/v1/meta/schemas/user/default")
	public Call<UserSchemasResponse> updateUserSchemasAttribute(@Body Definitions definitions);

//	for this api in response You do not have permission to access the feature you are requesting so i can not complete this api
	@GET("/api/v1/meta/schemas/logStream")
	public Call<Void> getAllLogStream();

//	for this api in response You do not have permission to access the feature you are requesting so i can not complete this api
	@GET("/api/v1/meta/schemas/logStream/{type}")
	public Call<Void> getLogStreamByType(@Path("type") String type);

}
