package com.okta.sdk.test.application;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.application.Saml2AuthAppRequest;
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
		Saml2AuthAppRequest request = createSaml2AuthAppRequest("saml2AuthAppRequest.json");
		ApplicationResponse appResponse = applicationService.addSaml2AuthAppInstance(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}

	private Saml2AuthAppRequest createSaml2AuthAppRequest(String fileName) {
		try {
			String requestStr = loadJson(fileName);
			Saml2AuthAppRequest request = ObjectMapperHelper.readValueFromJSON(requestStr, Saml2AuthAppRequest.class);
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
