package com.api.sdk.okta.oktaSDK.service.application;

import java.util.List;

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

	public CertificateResponse generateCertificate(String appId, int validityYears);
	
	public SamlMetadata previewSamlMetadata(String appId, String keyId);

	public CertificateResponse shareCloneCertificate(String appId, String keyId, String targetAid);

	public CertificateResponse getCertificate(String appId, String keyId);

	public List<CertificateResponse> listCertificates(String appId);

	public CsrResponse generateCsrInJson(String appId, CsrRequest request);

	public List<CsrResponse> listCsrs(String appId);

	public CsrResponse getCsr(String appId, String csrId);

	public String revokeCsr(String appId, String csrId);

}
