package com.api.sdk.okta.oktaSDK.service.application;

import java.io.IOException;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.application.BasicAuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSaml2AppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.OAuth2ClientAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.PluginSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.Saml2AuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.SwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.WsFedAppRequest;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class ApplicationServiceImpl implements ApplicationService {

	final ApplicationOktaService oktaService;

	public ApplicationServiceImpl() {
		oktaService = ServiceFactory.createService(ApplicationOktaService.class);
	}

	@Override
	public ApplicationResponse addSaml2AuthAppInstance(Saml2AuthAppRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.addSaml2AuthAppInstance(request);
			Response<ApplicationResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ApplicationResponse addCustomSaml2App(CustomSaml2AppRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.addCustomSaml2App(request);
			Response<ApplicationResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ApplicationResponse addCustomSwaApp(CustomSwaAppRequest request) {

		try {
			Call<ApplicationResponse> call = oktaService.addCustomSwaApp(request);
			Response<ApplicationResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	
	}

	@Override
	public ApplicationResponse addBasicAuthApp(BasicAuthAppRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.addBasicAuthApp(request);
			Response<ApplicationResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ApplicationResponse addPluginSwaApp(PluginSwaAppRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.addPluginSwaApp(request);
			Response<ApplicationResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ApplicationResponse addWsFedApp(WsFedAppRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.addWsFedApp(request);
			Response<ApplicationResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ApplicationResponse addSwaApp(SwaAppRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.addSwaApp(request);
			Response<ApplicationResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ApplicationResponse addOAuth2ClientApp(OAuth2ClientAppRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.addOAuth2ClientApp(request);
			Response<ApplicationResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
