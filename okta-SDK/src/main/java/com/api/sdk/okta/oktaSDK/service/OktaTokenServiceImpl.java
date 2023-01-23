package com.api.sdk.okta.oktaSDK.service;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sdk.okta.oktaSDK.configuration.OktaConfig;
import com.api.sdk.okta.oktaSDK.dto.AccessToken;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;

import retrofit2.Call;
import retrofit2.Response;

@Service
public class OktaTokenServiceImpl implements OktaTokenService {

	final Okta oktaService;

	@Autowired
	public OktaTokenServiceImpl() {
		oktaService = ServiceFactory.createService(Okta.class);
	}

	@Autowired
	private OktaConfig oktaConfig;

	@Override
	public AccessToken generateAccessToken(String code) throws CustomValidationException {
		try {
			Call<AccessToken> call = oktaService.generateAccessToken(oktaConfig.getAuthService(),
					oktaConfig.getGrantType(), code, oktaConfig.getRedirectUri(), oktaConfig.getClientId(),
					oktaConfig.getSecret());
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
			Call<AccessToken> call = oktaService.generateAccessTokenFromRefreshToken(oktaConfig.getAuthService(),
					"refresh_token", oktaConfig.getRedirectUri(), oktaConfig.getClientId(),
					oktaConfig.getSecret(), refreshToken);
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
