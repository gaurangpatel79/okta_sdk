package com.okta.sdk.test.application;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
import com.api.sdk.okta.oktaSDK.dto.application.certificates.CertificateResponse;
import com.api.sdk.okta.oktaSDK.dto.application.certificates.CsrRequest;
import com.api.sdk.okta.oktaSDK.dto.application.certificates.CsrResponse;
import com.api.sdk.okta.oktaSDK.dto.application.certificates.SamlMetadata;
import com.api.sdk.okta.oktaSDK.dto.application.certificates.UpdateApplicationCertificate;
import com.api.sdk.okta.oktaSDK.dto.application.credentials.UpdatePluginAppCredentialsRequest;
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

	@Test
	public void testAddBookmarkApp() {
		BookmarkAppRequest request = createRequest("bookmarkAppRequest.json", BookmarkAppRequest.class);
		String requestStr = ObjectMapperHelper.toJSON(request);
		System.out.println("Request String: " + requestStr);
		ApplicationResponse appResponse = applicationService.addBookmarkApp(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}

	@Test
	public void testAddOktaOrg2OrgApp() {
		OktaOrg2OrgAppRequest request = createRequest("oktaOrg2OrgAppRequest.json", OktaOrg2OrgAppRequest.class);
		String requestStr = ObjectMapperHelper.toJSON(request);
		System.out.println("Request String: " + requestStr);
		ApplicationResponse appResponse = applicationService.addOktaOrg2OrgApp(request);
		assertNotNull(appResponse);
		assertNotNull(appResponse.getId());
		System.out.println("App Response: " + appResponse);
	}

	@Test
	public void testGenerateCertificate() {
		CertificateResponse certResponse = applicationService.generateCertificate("0oap7h19agEJqnZFB357", 2);
		assertNotNull(certResponse);
		assertNotNull(certResponse.getKid());
		System.out.println("Certificate Response: " + certResponse);
	}

	@Test
	public void testShareCloneCertificate() {
		CertificateResponse certResponse = applicationService.shareCloneCertificate("0oap7h19agEJqnZFB357",
				"MqD1EaUUHh7rBmxa2k5R0cFHOidssxJOFlqj--IOZUU", "0oap7ioqstjUyfc77357");
		assertNotNull(certResponse);
		assertNotNull(certResponse.getKid());
		System.out.println("Certificate Response: " + certResponse);
	}

	@Test
	public void testGetCertificate() {
		CertificateResponse certResponse = applicationService.getCertificate("0oap7h19agEJqnZFB357",
				"MqD1EaUUHh7rBmxa2k5R0cFHOidssxJOFlqj--IOZUU");
		assertNotNull(certResponse);
		assertNotNull(certResponse.getKid());
		System.out.println("Certificate Response: " + certResponse);
	}

	@Test
	public void testListCertificates() {
		List<CertificateResponse> certResponse = applicationService.listCertificates("0oap7h19agEJqnZFB357");
		assertNotNull(certResponse);
		assertTrue(certResponse.size() > 0);
		System.out.println("Certificate Response: " + certResponse);
	}

	@Test
	public void testGenerateCsrInJson() {
		CsrRequest request = createRequest("csrRequest.json", CsrRequest.class);
		CsrResponse csrResponse = applicationService.generateCsrInJson("0oap7h19agEJqnZFB357", request);
		assertNotNull(csrResponse);
		assertNotNull(csrResponse.getId());
		System.out.println("Csr Response: " + csrResponse);
	}

	@Test
	public void testListCsrs() {
		List<CsrResponse> csrResponse = applicationService.listCsrs("0oap7h19agEJqnZFB357");
		assertNotNull(csrResponse);
		assertTrue(csrResponse.size() > 0);
		System.out.println("Csr Response: " + csrResponse);
	}

	@Test
	public void testGetCsr() {
		CsrResponse csrResponse = applicationService.getCsr("0oap7h19agEJqnZFB357",
				"4ezSQaTleUN5LT3pPn-adC2weZlks1ztALHWyf4bAsA");
		assertNotNull(csrResponse);
		assertNotNull(csrResponse.getId());
		System.out.println("Csr Response: " + csrResponse);
	}

	@Test
	public void testRevokeCsr() {
		String csrResponse = applicationService.revokeCsr("0oap7h19agEJqnZFB357",
				"b4et_JSrWupfQaEH53kqJX-hkylrM_P2NhfQXt2ZuJU");
		assertNotNull(csrResponse);
		System.out.println("Csr Response: " + csrResponse);
	}

	@Test
	public void testPreviewSamlMetadata() {
		SamlMetadata samlMetadata = applicationService.previewSamlMetadata("0oap7h19agEJqnZFB357",
				"t7Sp8j0ITYT_so_3TNkAMM9t-NSB1h-eQoC8qfuY_7k");
		assertNotNull(samlMetadata);
		System.out.println("Saml Metadata: " + samlMetadata);
	}

	@Test
	public void testGenerateCsrInPkcs10() {
		CsrRequest request = createRequest("csrRequest.json", CsrRequest.class);
		String csrResponse = applicationService.generateCsrInPkcs10("0oap7h19agEJqnZFB357", request);
		assertNotNull(csrResponse);
		System.out.println("Csr Response: " + csrResponse);
	}

	@Test
	public void testUpdateApplicationCertificate() {
		UpdateApplicationCertificate request = createRequest("updateAppRequest.json",
				UpdateApplicationCertificate.class);
		ApplicationResponse appResponse = applicationService.updateApplicationCertificate("0oap7h19agEJqnZFB357",
				request);
		assertNotNull(appResponse);
		System.out.println("App Response: " + appResponse);
	}

	@Test
	public void testUpdatePluginSWAToSharedCreds() {
		UpdatePluginAppCredentialsRequest request = createRequest("updatePluginSwaToSharedCreds.json",
				UpdatePluginAppCredentialsRequest.class);
		ApplicationResponse appResponse = applicationService.updatePluginSWAToSharedCreds("0oapa27vaekofYvUq357",
				request);
		assertNotNull(appResponse);
		System.out.println("App Response: " + appResponse);
	}

	@Test
	public void testUpdatePluginSWAToUserEditPassword() {
		UpdatePluginAppCredentialsRequest request = createRequest("updatePluginSwaToUserEditPassword.json",
				UpdatePluginAppCredentialsRequest.class);
		ApplicationResponse appResponse = applicationService.updatePluginSWAToUserEditPassword("0oapa27vaekofYvUq357",
				request);
		assertNotNull(appResponse);
		System.out.println("App Response: " + appResponse);
	}

	@Test
	public void testUpdatePluginSWAToOktaPassword() {
		UpdatePluginAppCredentialsRequest request = createRequest("updatePluginSwaToOktaPassword.json",
				UpdatePluginAppCredentialsRequest.class);
		ApplicationResponse appResponse = applicationService.updatePluginSWAToOktaPassword("0oapa27vaekofYvUq357",
				request);
		assertNotNull(appResponse);
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testUpdatePluginSWAToUserEditUsernameAndPassword() {
		UpdatePluginAppCredentialsRequest request = createRequest("updatePluginSwaToUserEditUserNameAndPassword.json",
				UpdatePluginAppCredentialsRequest.class);
		ApplicationResponse appResponse = applicationService.updatePluginSWAToUserEditUsernameAndPassword("0oapa27vaekofYvUq357",
				request);
		assertNotNull(appResponse);
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testUpdatePluginSWAToAdminSetsUsernameAndPassword() {
		UpdatePluginAppCredentialsRequest request = createRequest("updatePluginSwaToAdminSetsUserNameAndPassword.json",
				UpdatePluginAppCredentialsRequest.class);
		ApplicationResponse appResponse = applicationService.updatePluginSWAToAdminSetsUsernameAndPassword("0oapa27vaekofYvUq357",
				request);
		assertNotNull(appResponse);
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testDeactivateApp() {
		String appResponse = applicationService.deactivateApp("0oap7h19agEJqnZFB357");
		assertNotNull(appResponse);
		System.out.println("App Response: " + appResponse);
	}
	
	@Test
	public void testActivateApp() {
		String appResponse = applicationService.activateApp("0oap7h19agEJqnZFB357");
		assertNotNull(appResponse);
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
