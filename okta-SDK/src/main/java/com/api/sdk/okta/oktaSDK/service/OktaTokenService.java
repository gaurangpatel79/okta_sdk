package com.api.sdk.okta.oktaSDK.service;

import com.api.sdk.okta.oktaSDK.dto.AccessToken;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;

public interface OktaTokenService {
	
	public AccessToken generateAccessToken(String code) throws CustomValidationException;
	
	public AccessToken generateAccessTokenFromRefreshToken(String refreshToken) throws CustomValidationException;

}
