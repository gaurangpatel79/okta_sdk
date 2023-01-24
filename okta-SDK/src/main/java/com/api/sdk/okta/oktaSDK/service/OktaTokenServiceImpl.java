package com.api.sdk.okta.oktaSDK.service;

import java.io.IOException;

import com.api.sdk.okta.oktaSDK.dto.AccessToken;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;

import retrofit2.Call;
import retrofit2.Response;

public class OktaTokenServiceImpl implements OktaTokenService {

	final Okta oktaService;
	String authService;
	String grantType;
	String redirectUri;
	String clientId;
	String secret;

	public OktaTokenServiceImpl() {
		authService = System.getProperty("authService");
		grantType = System.getProperty("grantType");
		redirectUri = System.getProperty("redirectUri");
		clientId = System.getProperty("clientId");
		secret = System.getProperty("secret");

		oktaService = ServiceFactory.createService(Okta.class);
	}

	@Override
	public AccessToken generateAccessToken(String code) throws CustomValidationException {
		try {
			Call<AccessToken> call = oktaService.generateAccessToken(authService, grantType, code, redirectUri,
					clientId, secret);
			Response<AccessToken> response = call.execute();

			if (!response.isSuccessful()) {
				System.out.println("error occured..");
				System.out.println(response.errorBody());

				throw new CustomValidationException(response.raw().message());
			} else {
				System.out.println(response.body());
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public AccessToken generateAccessTokenFromRefreshToken(String refreshToken) throws CustomValidationException {
		try {
			Call<AccessToken> call = oktaService.generateAccessTokenFromRefreshToken(authService, "refresh_token",
					redirectUri, clientId, secret, refreshToken);
			Response<AccessToken> response = call.execute();

			if (!response.isSuccessful()) {
				System.out.println("error occured..");
				System.out.println(response.errorBody());

				throw new CustomValidationException(response.raw().message());
			} else {
				System.out.println(response.body());
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
