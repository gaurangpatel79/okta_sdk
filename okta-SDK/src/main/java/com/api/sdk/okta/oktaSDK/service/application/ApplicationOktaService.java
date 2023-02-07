package com.api.sdk.okta.oktaSDK.service.application;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.application.AppGroup;
import com.api.sdk.okta.oktaSDK.dto.application.AppUser;
import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.application.AssignUserToAppForSsoRequest;
import com.api.sdk.okta.oktaSDK.dto.application.BasicAuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.BookmarkAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSaml2AppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.CustomSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.OAuth2ClientAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.OktaOrg2OrgAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.PluginSwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.Saml2AuthAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.SwaAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.UpdateAppCredentialsForAssignedUserRequest;
import com.api.sdk.okta.oktaSDK.dto.application.WsFedAppRequest;
import com.api.sdk.okta.oktaSDK.dto.application.certificates.CertificateResponse;
import com.api.sdk.okta.oktaSDK.dto.application.certificates.CsrRequest;
import com.api.sdk.okta.oktaSDK.dto.application.certificates.CsrResponse;
import com.api.sdk.okta.oktaSDK.dto.application.certificates.SamlMetadata;
import com.api.sdk.okta.oktaSDK.dto.application.certificates.UpdateApplicationCertificate;
import com.api.sdk.okta.oktaSDK.dto.application.credentials.UpdatePluginAppCredentialsRequest;
import com.api.sdk.okta.oktaSDK.dto.application.oauth2.ScopeConsentGrant;
import com.api.sdk.okta.oktaSDK.dto.application.oauth2.ScopeConsentGrantRequest;
import com.api.sdk.okta.oktaSDK.dto.application.provisioning.ProvisioningRequest;
import com.api.sdk.okta.oktaSDK.dto.application.provisioning.ProvisioningResponse;
import com.api.sdk.okta.oktaSDK.service.Xml;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
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

	@Xml
	@GET("/api/v1/apps/{appId}/sso/saml/metadata")
	public Call<SamlMetadata> previewSamlMetadata(@Path("appId") String appId, @Query("kid") String keyId);

	@POST("/api/v1/apps/{appId}/credentials/keys/{keyId}/clone")
	public Call<CertificateResponse> shareCloneCertificate(@Path("appId") String appId, @Path("keyId") String keyId,
			@Query("targetAid") String targetAid);

	@PUT("/api/v1/apps/{appId}")
	public Call<ApplicationResponse> updateApplicationCertificate(@Path("appId") String appId,
			@Body UpdateApplicationCertificate updateAppCertificateRequest);

	@GET("/api/v1/apps/{appId}/credentials/keys/{keyId}")
	public Call<CertificateResponse> getCertificate(@Path("appId") String appId, @Path("keyId") String keyId);

	@GET("/api/v1/apps/{appId}/credentials/keys")
	public Call<List<CertificateResponse>> listCertificates(@Path("appId") String appId);

	@Headers({ "Accept: application/pkcs10" })
	@POST("api/v1/apps/{appId}/credentials/csrs")
	public Call<String> generateCsrInPkcs10(@Path("appId") String appId, @Body CsrRequest csrRequest);

	@POST("api/v1/apps/{appId}/credentials/csrs")
	public Call<CsrResponse> generateCsrInJson(@Path("appId") String appId, @Body CsrRequest csrRequest);

	@GET("api/v1/apps/{appId}/credentials/csrs")
	public Call<List<CsrResponse>> listCsrs(@Path("appId") String appId);

	@GET("api/v1/apps/{appId}/credentials/csrs/{csrId}")
	public Call<CsrResponse> getCsr(@Path("appId") String appId, @Path("csrId") String csrId);

	@DELETE("api/v1/apps/{appId}/credentials/csrs/{csrId}")
	public Call<Void> revokeCsr(@Path("appId") String appId, @Path("csrId") String csrId);

	@PUT("/api/v1/apps/{appId}")
	public Call<ApplicationResponse> updatePluginSWAToSharedCreds(@Path("appId") String appId,
			@Body UpdatePluginAppCredentialsRequest updateAppRequest);

	@PUT("/api/v1/apps/{appId}")
	public Call<ApplicationResponse> updatePluginSWAToUserEditPassword(@Path("appId") String appId,
			@Body UpdatePluginAppCredentialsRequest updateAppRequest);

	@PUT("/api/v1/apps/{appId}")
	public Call<ApplicationResponse> updatePluginSWAToOktaPassword(@Path("appId") String appId,
			@Body UpdatePluginAppCredentialsRequest updateAppRequest);

	@PUT("/api/v1/apps/{appId}")
	public Call<ApplicationResponse> updatePluginSWAToUserEditUsernameAndPassword(@Path("appId") String appId,
			@Body UpdatePluginAppCredentialsRequest updateAppRequest);

	@PUT("/api/v1/apps/{appId}")
	public Call<ApplicationResponse> updatePluginSWAToAdminSetsUsernameAndPassword(@Path("appId") String appId,
			@Body UpdatePluginAppCredentialsRequest updateAppRequest);

	@POST("/api/v1/apps/{appId}/lifecycle/deactivate")
	public Call<Object> deactivateApp(@Path("appId") String appId);

	@POST("/api/v1/apps/{appId}/lifecycle/activate")
	public Call<Object> activateApp(@Path("appId") String appId);

	@GET("/api/v1/apps/{appId}/grants")
	public Call<List<ScopeConsentGrant>> listScopeConsentGrants(@Path("appId") String appId);

	@GET("/api/v1/apps/{appId}/grants/{grantId}")
	public Call<ScopeConsentGrant> getScopeConsentGrant(@Path("appId") String appId, @Path("grantId") String grantId);

	@POST("/api/v1/apps/{appId}/grants")
	public Call<ScopeConsentGrant> addScopeConsentGrant(@Path("appId") String appId,
			@Body ScopeConsentGrantRequest scopeContentGrantRequest);

	@DELETE("/api/v1/apps/{appId}/grants/{grantId}")
	public Call<Void> revokeScopeConsentGrant(@Path("appId") String appId, @Path("grantId") String grantId);
	
	@Multipart
	@POST("/api/v1/apps/{appId}/logo")
	public Call<Void> uploadLogo(@Path("appId") String appId, @Part MultipartBody.Part file);

	@GET("/api/v1/apps/{appId}/connections/default")
	public Call<ProvisioningResponse> getDefaultProvisioningConnection(@Path("appId") String appId);

	@POST("/api/v1/apps/{appId}/connections/default?activate=true")
	public Call<ProvisioningResponse> createDefaultProvisioningConnection(@Path("appId") String appId,
			@Body ProvisioningRequest provisioningRequest);

	@POST("/api/v1/apps/{appId}/connections/default/lifecycle/activate")
	public Call<Void> activateDefaultProvisioningConnection(@Path("appId") String appId);

	@POST("/api/v1/apps/{appId}/connections/default/lifecycle/deactivate")
	public Call<Void> deactivateDefaultProvisioningConnection(@Path("appId") String appId);

	@GET("/api/v1/apps")
	public Call<List<ApplicationResponse>> listApps();

	@GET("/api/v1/apps")
	public Call<List<ApplicationResponse>> filterApps(@Query(value = "filter", encoded = true) String filter);

	@GET("/api/v1/apps/{appId}")
	public Call<ApplicationResponse> getApp(@Path("appId") String appId);

	@GET("/api/v1/apps/{appId}/users")
	public Call<List<AppUser>> listUsersAssignedToApp(@Path("appId") String appId);

	@GET("/api/v1/apps")
	public Call<List<ApplicationResponse>> filterAndExpandApps(@Query(value = "filter", encoded = true) String filter,
			@Query(value = "expand", encoded = true) String expand);

	@POST("/api/v1/apps/{appId}/users")
	public Call<AppUser> assignUserToAppForSso(@Path("appId") String appId,
			@Body AssignUserToAppForSsoRequest assignUserRequest);

	@GET("/api/v1/apps/{appId}/users/{userId}")
	public Call<AppUser> getAssignedUserForApp(@Path("appId") String appId, @Path("userId") String userId);

	@POST("/api/v1/apps/{appId}/users/{userId}")
	public Call<AppUser> updateAppCredentialsForAssignedUser(@Path("appId") String appId, @Path("userId") String userId,
			@Body UpdateAppCredentialsForAssignedUserRequest updateAppRequest);
	
	@DELETE("/api/v1/apps/{appId}/users/{userId}")
	public Call<Void> deleteUserFromApp(@Path("appId") String appId, @Path("userId") String userId);
	
	@PUT("/api/v1/apps/{appId}/groups/{groupId}")
	public Call<AppGroup> assignGroupToApp(@Path("appId") String appId, @Path("groupId") String groupId);
	
	@GET("/api/v1/apps/{appId}/groups")
	public Call<List<AppGroup>> listAssignedGroups(@Path("appId") String appId);
	
	@DELETE("/api/v1/apps/{appId}/groups/{groupId}")
	public Call<Void> removeGroupFromApp(@Path("appId") String appId, @Path("groupId") String groupId);
	
	@DELETE("/api/v1/apps/{appId}")
	public Call<Void> deleteApp(@Path("appId") String appId);
}
