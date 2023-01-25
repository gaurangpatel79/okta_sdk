package com.api.sdk.okta.oktaSDK.service.application;

import java.io.IOException;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.application.Saml2AuthAppRequest;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class ApplicationServiceImpl implements ApplicationService{
	
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

}
