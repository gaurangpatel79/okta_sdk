package com.api.sdk.okta.oktaSDK.service.application;

import java.io.IOException;
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
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

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

}
