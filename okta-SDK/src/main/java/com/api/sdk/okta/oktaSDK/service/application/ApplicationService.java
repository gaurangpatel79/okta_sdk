package com.api.sdk.okta.oktaSDK.service.application;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.application.BasicAuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSaml2AppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.Saml2AuthAppRequest;

public interface ApplicationService {

	public ApplicationResponse addSaml2AuthAppInstance(Saml2AuthAppRequest request);
	
	public ApplicationResponse addCustomSaml2App(CustomSaml2AppRequest request);
	
	public ApplicationResponse addCustomSwaApp(CustomSwaAppRequest request);
	
	public ApplicationResponse addBasicAuthApp(BasicAuthAppRequest request);
	
}
