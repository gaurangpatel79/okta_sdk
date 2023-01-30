package com.api.sdk.okta.oktaSDK.service.application;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.application.BasicAuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.BookmarkAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSaml2AppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.OAuth2ClientAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.OktaOrg2OrgAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.PluginSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.Saml2AuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.SwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.WsFedAppRequest;

public interface ApplicationService {

	public ApplicationResponse addSaml2AuthAppInstance(Saml2AuthAppRequest request);
	
	public ApplicationResponse addCustomSaml2App(CustomSaml2AppRequest request);
	
	public ApplicationResponse addCustomSwaApp(CustomSwaAppRequest request);
	
	public ApplicationResponse addBasicAuthApp(BasicAuthAppRequest request);
	
	public ApplicationResponse addPluginSwaApp(PluginSwaAppRequest request);
	
	public ApplicationResponse addWsFedApp(WsFedAppRequest request);
	
	public ApplicationResponse addSwaApp(SwaAppRequest request);
	
	public ApplicationResponse addOAuth2ClientApp(OAuth2ClientAppRequest request);
	
	public ApplicationResponse addBookmarkApp(BookmarkAppRequest request);
	
	public ApplicationResponse addOktaOrg2OrgApp(OktaOrg2OrgAppRequest request);
	
}
