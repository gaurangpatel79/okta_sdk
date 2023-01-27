package com.okta.sdk.test.application;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.application.BasicAuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSaml2AppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.OAuth2ClientAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.PluginSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.Saml2AuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.SwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.WsFedAppRequest;
import com.api.sdk.okta.oktaSDK.factory.ApplicationServiceFactory;
import com.api.sdk.okta.oktaSDK.service.application.ApplicationService;
import com.api.sdk.okta.oktaSDK.util.ObjectMapperHelper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class ApplicationServiceTests {

	private ApplicationService applicationService;

	@BeforeEach
	public void tearUp() {
		applicationService = ApplicationServiceFactory.getApplicationService();
	}

	@Test
	public void testAddSaml2AuthAppInstance() {
		Saml2AuthAppRequest request = createRequest("saml2AuthAppRequest.json", Saml2AuthAppRequest.class);
		ApplicationResponse appResponse = applicationService.addSaml2AuthAppInstance(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}

	@Test
	public void testAddCustomSaml2App() {
		CustomSaml2AppRequest request = createRequest("customSaml2AppRequest.json", CustomSaml2AppRequest.class);
		ApplicationResponse appResponse = applicationService.addCustomSaml2App(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testAddCustomSwaApp() {
		CustomSwaAppRequest request = createRequest("customSwaAppRequest.json", CustomSwaAppRequest.class);
		ApplicationResponse appResponse = applicationService.addCustomSwaApp(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testAddBasicAuthApp() {
		BasicAuthAppRequest request = createRequest("basicAuthAppRequest.json", BasicAuthAppRequest.class);
		ApplicationResponse appResponse = applicationService.addBasicAuthApp(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testAddPluginSwaApp() {
		PluginSwaAppRequest request = createRequest("pluginSwaAppRequest.json", PluginSwaAppRequest.class);
		ApplicationResponse appResponse = applicationService.addPluginSwaApp(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testAddWsFedApp() {
		WsFedAppRequest request = createRequest("wsFedAppRequest.json", WsFedAppRequest.class);
		String requestStr = ObjectMapperHelper.toJSON(request);
		System.out.println("Request String: " + requestStr);
		ApplicationResponse appResponse = applicationService.addWsFedApp(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testAddSwaApp() {
		SwaAppRequest request = createRequest("swaAppRequest.json", SwaAppRequest.class);
		ApplicationResponse appResponse = applicationService.addSwaApp(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testAddOAuth2ClientApp() {
		OAuth2ClientAppRequest request = createRequest("oAuth2ClientAppRequest.json", OAuth2ClientAppRequest.class);
		String requestStr = ObjectMapperHelper.toJSON(request);
		System.out.println("Request String: " + requestStr);
		ApplicationResponse appResponse = applicationService.addOAuth2ClientApp(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}
	
	

	private <T> T createRequest(String fileName, Class<T> valueType) {
		try {
			String requestStr = loadJson(fileName);
			T request = ObjectMapperHelper.readValueFromJSON(requestStr, valueType);
			return request;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public String loadJson(String fileName) {
		URL url = Resources.getResource(this.getClass(), fileName);
		try {
			String data = Resources.toString(url, Charsets.UTF_8);
			return data;
		} catch (IOException e) {
			throw new RuntimeException("Couldn't load a JSON file.", e);
		}
	}
}
