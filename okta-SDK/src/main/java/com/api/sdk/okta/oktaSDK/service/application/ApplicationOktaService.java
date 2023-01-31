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

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApplicationOktaService {

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addSaml2AuthAppInstance(@Body Saml2AuthAppRequest appRequest);

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addCustomSaml2App(@Body CustomSaml2AppRequest appRequest);

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addCustomSwaApp(@Body CustomSwaAppRequest appRequest);

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addBasicAuthApp(@Body BasicAuthAppRequest appRequest);

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addPluginSwaApp(@Body PluginSwaAppRequest appRequest);

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addWsFedApp(@Body WsFedAppRequest appRequest);

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addSwaApp(@Body SwaAppRequest appRequest);

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addOAuth2ClientApp(@Body OAuth2ClientAppRequest appRequest);

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addBookmarkApp(@Body BookmarkAppRequest appRequest);

	@POST("/api/v1/apps")
	public Call<ApplicationResponse> addOktaOrg2OrgApp(@Body OktaOrg2OrgAppRequest appRequest);

	@POST("/api/v1/apps/{appId}/credentials/keys/generate")
	public Call<CertificateResponse> generateCertificate(@Path("appId") String appId,
			@Query("validityYears") int validityYears);
	
	@GET("/api/v1/apps/{appId}/sso/saml/metadata")
	public Call<SamlMetadata> previewSamlMetadata(@Path("appId") String appId,
			@Query("kid") String keyId);

	@POST("/api/v1/apps/{appId}/credentials/keys/{keyId}/clone")
	public Call<CertificateResponse> shareCloneCertificate(@Path("appId") String appId, @Path("keyId") String keyId,
			@Query("targetAid") String targetAid);

	@GET("/api/v1/apps/{appId}/credentials/keys/{keyId}")
	public Call<CertificateResponse> getCertificate(@Path("appId") String appId, @Path("keyId") String keyId);

	@GET("/api/v1/apps/{appId}/credentials/keys")
	public Call<List<CertificateResponse>> listCertificates(@Path("appId") String appId);

	@POST("api/v1/apps/{appId}/credentials/csrs")
	public Call<CsrResponse> generateCsrInJson(@Path("appId") String appId, @Body CsrRequest csrRequest);

	@GET("api/v1/apps/{appId}/credentials/csrs")
	public Call<List<CsrResponse>> listCsrs(@Path("appId") String appId);

	@GET("api/v1/apps/{appId}/credentials/csrs/{csrId}")
	public Call<CsrResponse> getCsr(@Path("appId") String appId, @Path("csrId") String csrId);
	
	@DELETE("api/v1/apps/{appId}/credentials/csrs/{csrId}")
	public Call<Void> revokeCsr(@Path("appId") String appId, @Path("csrId") String csrId);

}
