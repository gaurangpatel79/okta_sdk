package com.api.sdk.okta.oktaSDK.service;

import com.api.sdk.okta.oktaSDK.dto.AccessToken;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Okta {

	@FormUrlEncoded
	@POST("/oauth2/{authService}/v1/token")
	public Call<AccessToken> generateAccessToken(@Path("authService") String authService,
			@Field("grant_type") String grantType, @Field("code") String code,
			@Field("redirect_uri") String redirectUri, @Field("client_id") String clientId,
			@Field("client_secret") String clientSecret);

	@FormUrlEncoded
	@POST("/oauth2/{authService}/v1/token")
	public Call<AccessToken> generateAccessTokenFromRefreshToken(@Path("authService") String authService,
			@Field("grant_type") String grantType, @Field("redirect_uri") String redirectUri,
			@Field("client_id") String clientId, @Field("client_secret") String clientSecret,
			@Field("refresh_token") String refreshToken);

}
