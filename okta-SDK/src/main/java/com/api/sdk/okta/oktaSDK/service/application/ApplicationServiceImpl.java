package com.api.sdk.okta.oktaSDK.service.application;

import java.io.File;
import java.io.IOException;
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
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
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

	@Override
	public ApplicationResponse addBookmarkApp(BookmarkAppRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.addBookmarkApp(request);
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
	public ApplicationResponse addOktaOrg2OrgApp(OktaOrg2OrgAppRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.addOktaOrg2OrgApp(request);
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
	public CertificateResponse generateCertificate(String appId, int validityYears) {
		try {
			Call<CertificateResponse> call = oktaService.generateCertificate(appId, validityYears);
			Response<CertificateResponse> response = call.execute();
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
	public CertificateResponse shareCloneCertificate(String appId, String keyId, String targetAid) {
		try {
			Call<CertificateResponse> call = oktaService.shareCloneCertificate(appId, keyId, targetAid);
			Response<CertificateResponse> response = call.execute();
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
	public CertificateResponse getCertificate(String appId, String keyId) {

		try {
			Call<CertificateResponse> call = oktaService.getCertificate(appId, keyId);
			Response<CertificateResponse> response = call.execute();
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
	public List<CertificateResponse> listCertificates(String appId) {
		try {
			Call<List<CertificateResponse>> call = oktaService.listCertificates(appId);
			Response<List<CertificateResponse>> response = call.execute();
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
	public CsrResponse generateCsrInJson(String appId, CsrRequest request) {
		try {
			Call<CsrResponse> call = oktaService.generateCsrInJson(appId, request);
			Response<CsrResponse> response = call.execute();
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
	public List<CsrResponse> listCsrs(String appId) {
		try {
			Call<List<CsrResponse>> call = oktaService.listCsrs(appId);
			Response<List<CsrResponse>> response = call.execute();
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
	public CsrResponse getCsr(String appId, String csrId) {
		try {
			Call<CsrResponse> call = oktaService.getCsr(appId, csrId);
			Response<CsrResponse> response = call.execute();
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
	public String revokeCsr(String appId, String csrId) {
		try {
			Call<Void> call = oktaService.revokeCsr(appId, csrId);
			Response<Void> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Csr successfully revoked";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public SamlMetadata previewSamlMetadata(String appId, String keyId) {
		try {
			Call<SamlMetadata> call = oktaService.previewSamlMetadata(appId, keyId);
			Response<SamlMetadata> response = call.execute();
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
	public String generateCsrInPkcs10(String appId, CsrRequest request) {
		try {
			Call<String> call = oktaService.generateCsrInPkcs10(appId, request);
			Response<String> response = call.execute();
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
	public ApplicationResponse updateApplicationCertificate(String appId, UpdateApplicationCertificate request) {
		try {
			Call<ApplicationResponse> call = oktaService.updateApplicationCertificate(appId, request);
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
	public ApplicationResponse updatePluginSWAToSharedCreds(String appId, UpdatePluginAppCredentialsRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.updatePluginSWAToSharedCreds(appId, request);
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
	public ApplicationResponse updatePluginSWAToUserEditPassword(String appId,
			UpdatePluginAppCredentialsRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.updatePluginSWAToUserEditPassword(appId, request);
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
	public ApplicationResponse updatePluginSWAToOktaPassword(String appId, UpdatePluginAppCredentialsRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.updatePluginSWAToOktaPassword(appId, request);
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
	public ApplicationResponse updatePluginSWAToUserEditUsernameAndPassword(String appId,
			UpdatePluginAppCredentialsRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.updatePluginSWAToUserEditUsernameAndPassword(appId, request);
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
	public ApplicationResponse updatePluginSWAToAdminSetsUsernameAndPassword(String appId,
			UpdatePluginAppCredentialsRequest request) {
		try {
			Call<ApplicationResponse> call = oktaService.updatePluginSWAToAdminSetsUsernameAndPassword(appId, request);
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
	public String deactivateApp(String appId) {
		try {
			Call<Object> call = oktaService.deactivateApp(appId);
			Response<Object> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "App Deactivated Successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String activateApp(String appId) {
		try {
			Call<Object> call = oktaService.activateApp(appId);
			Response<Object> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "App Activated Successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<ScopeConsentGrant> listScopeConsentGrants(String appId) {
		try {
			Call<List<ScopeConsentGrant>> call = oktaService.listScopeConsentGrants(appId);
			Response<List<ScopeConsentGrant>> response = call.execute();
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
	public ScopeConsentGrant getScopeConsentGrant(String appId, String grantId) {
		try {
			Call<ScopeConsentGrant> call = oktaService.getScopeConsentGrant(appId, grantId);
			Response<ScopeConsentGrant> response = call.execute();
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
	public ScopeConsentGrant addScopeConsentGrant(String appId, ScopeConsentGrantRequest request) {
		try {
			Call<ScopeConsentGrant> call = oktaService.addScopeConsentGrant(appId, request);
			Response<ScopeConsentGrant> response = call.execute();
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
	public String revokeScopeConsentGrant(String appId, String grantId) {
		try {
			Call<Void> call = oktaService.revokeScopeConsentGrant(appId, grantId);
			Response<Void> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Scope Consent Grant Successfully revoked";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ProvisioningResponse getDefaultProvisioningConnection(String appId) {
		try {
			Call<ProvisioningResponse> call = oktaService.getDefaultProvisioningConnection(appId);
			Response<ProvisioningResponse> response = call.execute();
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
	public ProvisioningResponse createDefaultProvisioningConnection(String appId, ProvisioningRequest request) {
		try {
			Call<ProvisioningResponse> call = oktaService.createDefaultProvisioningConnection(appId, request);
			Response<ProvisioningResponse> response = call.execute();
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
	public String activateDefaultProvisioningConnection(String appId) {
		try {
			Call<Void> call = oktaService.activateDefaultProvisioningConnection(appId);
			Response<Void> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Default Provisioning Connection activated successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deactivateDefaultProvisioningConnection(String appId) {
		try {
			Call<Void> call = oktaService.deactivateDefaultProvisioningConnection(appId);
			Response<Void> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Default Provisioning Connection deactivated successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<ApplicationResponse> listApps() {
		try {
			Call<List<ApplicationResponse>> call = oktaService.listApps();
			Response<List<ApplicationResponse>> response = call.execute();
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
	public List<ApplicationResponse> filterApps(String filter) {
		try {
			Call<List<ApplicationResponse>> call = oktaService.filterApps(filter);
			Response<List<ApplicationResponse>> response = call.execute();
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
	public ApplicationResponse getApp(String appId) {
		try {
			Call<ApplicationResponse> call = oktaService.getApp(appId);
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
	public List<AppUser> listUsersAssignedToApp(String appId) {
		try {
			Call<List<AppUser>> call = oktaService.listUsersAssignedToApp(appId);
			Response<List<AppUser>> response = call.execute();
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
	public List<ApplicationResponse> filterAndExpandApps(String filter, String expand) {
		try {
			Call<List<ApplicationResponse>> call = oktaService.filterAndExpandApps(filter, expand);
			Response<List<ApplicationResponse>> response = call.execute();
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
	public AppUser assignUserToAppForSso(String appId, AssignUserToAppForSsoRequest assignUserRequest) {
		try {
			Call<AppUser> call = oktaService.assignUserToAppForSso(appId, assignUserRequest);
			Response<AppUser> response = call.execute();
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
	public AppUser getAssignedUserForApp(String appId, String userId) {
		try {
			Call<AppUser> call = oktaService.getAssignedUserForApp(appId, userId);
			Response<AppUser> response = call.execute();
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
	public AppUser updateAppCredentialsForAssignedUser(String appId, String userId,
			UpdateAppCredentialsForAssignedUserRequest request) {
		try {
			Call<AppUser> call = oktaService.updateAppCredentialsForAssignedUser(appId, userId, request);
			Response<AppUser> response = call.execute();
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
	public String deleteUserFromApp(String appId, String userId) {
		try {
			Call<Void> call = oktaService.deleteUserFromApp(appId, userId);
			Response<Void> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "User Removed from app successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public AppGroup assignGroupToApp(String appId, String groupId) {
		try {
			Call<AppGroup> call = oktaService.assignGroupToApp(appId, groupId);
			Response<AppGroup> response = call.execute();
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
	public List<AppGroup> listAssignedGroups(String appId) {
		try {
			Call<List<AppGroup>> call = oktaService.listAssignedGroups(appId);
			Response<List<AppGroup>> response = call.execute();
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
	public String removeGroupFromApp(String appId, String groupId) {
		try {
			Call<Void> call = oktaService.removeGroupFromApp(appId, groupId);
			Response<Void> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Group Removed from app successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deleteApp(String appId) {
		try {
			Call<Void> call = oktaService.deleteApp(appId);
			Response<Void> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "App Removed successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String uploadLogo(String appId, File file) {
		try {
			RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
			MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestBody);
			Call<Void> call = oktaService.uploadLogo(appId, body);
			Response<Void> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Logo uploaded successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
