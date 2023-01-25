package com.api.sdk.okta.oktaSDK.service.user;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.user.ActivateResponse;
import com.api.sdk.okta.oktaSDK.dto.user.ChangePasswordRequest;
import com.api.sdk.okta.oktaSDK.dto.user.User;
import com.api.sdk.okta.oktaSDK.dto.user.UserCredentials;
import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeRequest;
import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserOkta {

	@POST("/api/v1/users?activate=true")
	public Call<User> createUser( @Body User user);

	@GET("/api/v1/users/{userId}")
	public Call<User> getUserById( @Path("userId") String userId);

	@GET("/api/v1/users/{userId}/appLinks")
	public Call<List<User>> getAssignedAppLinks(
			@Path("userId") String userId);

	@GET("/api/v1/users/{userId}/groups")
	public Call<List<User>> getGroupsForUser(
			@Path("userId") String userId);

	@GET("/api/v1/users")
	public Call<List<User>> findUser( @Query("q") String query,
			@Query("limit") int limit);

	@GET("/api/v1/users")
	public Call<List<User>> clearUserSession( @Query("q") String query,
			@Query("limit") int limit);

	@GET("/api/v1/users")
	public Call<List<User>> listUser( @Query("limit") int limit);

	@GET("/api/v1/users")
	public Call<List<User>> searchUser( @Query("search") String search);

	@GET("/api/v1/users")
	public Call<List<User>> filterUser( @Query("filter") String filter,
			@Query("limit") int limit);

	@POST("/api/v1/users/{userId}/lifecycle/activate")
	public Call<ActivateResponse> activateUser(
			@Path("userId") String userId, @Query("sendEmail") boolean isSendEmail);

	@POST("/api/v1/users/{userId}/lifecycle/deactivate")
	public Call<Void> deactivateUser( @Path("userId") String userId);

	@POST("/api/v1/users/{userId}/lifecycle/unlock")
	public Call<Void> unlockUser( @Path("userId") String userId);

	@POST("/api/v1/users/{userId}/lifecycle/expire_password")
	public Call<User> expirePassword( @Path("userId") String userId);

	@POST("/api/v1/users/{userId}/lifecycle/expire_password")
	public Call<Object> setTemporaryPassword(
			@Path("userId") String userId, @Query("tempPassword") boolean tempPassword);

	@POST("/api/v1/users/{userId}/lifecycle/reset_password")
	public Call<Object> resetPasswordUser( @Path("userId") String userId,
			@Query("sendEmail") boolean isSendEmail);

	@POST("/api/v1/users/{userId}/lifecycle/suspend")
	public Call<Void> suspendUser( @Path("userId") String userId);

	@POST("/api/v1/users/{userId}/lifecycle/suspend")
	public Call<Void> unsuspendUser( @Path("userId") String userId);

	@DELETE("/api/v1/users/{userId}")
	public Call<Void> deleteUser( @Path("userId") String userId);

	@PUT("/api/v1/users/{userId}")
	public Call<User> updateUser( @Path("userId") String userId,
			@Body User user);

	@POST("/api/v1/users/{userId}/credentials/change_password")
	public Call<UserCredentials> changePasswordOfUserById(
			@Path("userId") String userId, @Body ChangePasswordRequest changePasswordRequest);

	@POST("/api/v1/users/{userId}/credentials/change_recovery_question")
	public Call<UserCredentials> changeRecoveryQuestionOfUserById(
			@Path("userId") String userId, @Body UserCredentials userCredentials);

	@POST("/api/v1/users/{userId}/credentials/forgot_password")
	public Call<UserCredentials> forgotPasswordWithSecurityAnswerByUserId(
			@Path("userId") String userId, @Query("sendEmail") boolean isSendEmail,
			@Body UserCredentials userCredentials);

	@POST("/api/v1/users/{userId}/credentials/forgot_password")
	public Call<Object> forgotPasswordWithOTPByUserId(
			@Path("userId") String userId, @Query("sendEmail") boolean isSendEmail);

	@POST("/api/v1/meta/types/user")
	public Call<UserTypeResponse> createUserType(
			@Body UserTypeRequest userTypeRequest);

	@GET("/api/v1/meta/types/user")
	public Call<List<UserTypeResponse>> getAllUserType();

	@GET("/api/v1/meta/types/user/default")
	public Call<UserTypeResponse> getDefaultUserType();

	@GET("/api/v1/meta/types/user/{typeId}")
	public Call<UserTypeResponse> getUserTypeById(
			@Path("typeId") String typeId);

	@PUT("/api/v1/meta/types/user/{typeId}")
	public Call<UserTypeResponse> updateUserTypeById(
			@Path("typeId") String typeId, @Body UserTypeRequest userTypeRequest);

	@DELETE("/api/v1/meta/types/user/{typeId}")
	public Call<Void> deleteUserTypeById( @Path("typeId") String typeId);
	
}

