package com.api.sdk.okta.oktaSDK.service.userType;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeRequest;
import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserTypeOkta {

	@POST("/api/v1/meta/types/user")
	public Call<UserTypeResponse> createUserType(@Header("Authorization") String authorization,
			@Body UserTypeRequest userTypeRequest);

	@GET("/api/v1/meta/types/user")
	public Call<List<UserTypeResponse>> getAllUserType(@Header("Authorization") String authorization);

	@GET("/api/v1/meta/types/user/default")
	public Call<UserTypeResponse> getDefaultUserType(@Header("Authorization") String authorization);

	@GET("/api/v1/meta/types/user/{typeId}")
	public Call<UserTypeResponse> getUserTypeById(@Header("Authorization") String authorization,
			@Path("typeId") String typeId);

	@PUT("/api/v1/meta/types/user/{typeId}")
	public Call<UserTypeResponse> updateUserTypeById(@Header("Authorization") String authorization,
			@Path("typeId") String typeId, @Body UserTypeRequest userTypeRequest);

	@DELETE("/api/v1/meta/types/user/{typeId}")
	public Call<Void> deleteUserTypeById(@Header("Authorization") String authorization, @Path("typeId") String typeId);

}
