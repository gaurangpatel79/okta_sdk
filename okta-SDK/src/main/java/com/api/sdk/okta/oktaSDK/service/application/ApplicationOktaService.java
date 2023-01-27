package com.api.sdk.okta.oktaSDK.service.application;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.application.BasicAuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSaml2AppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.Saml2AuthAppRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApplicationOktaService {

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addSaml2AuthAppInstance(@Body Saml2AuthAppRequest appRequest);
	
	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addCustomSaml2App(@Body CustomSaml2AppRequest appRequest);
	
	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addCustomSwaApp(@Body CustomSwaAppRequest appRequest);
	
	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addBasicAuthApp(@Body BasicAuthAppRequest appRequest);
}
