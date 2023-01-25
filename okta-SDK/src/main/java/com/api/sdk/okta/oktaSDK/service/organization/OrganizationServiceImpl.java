package com.api.sdk.okta.oktaSDK.service.organization;

import java.io.File;
import java.io.IOException;

import com.api.sdk.okta.oktaSDK.dto.organization.ContactTypes;
import com.api.sdk.okta.oktaSDK.dto.organization.OktaCommunication;
import com.api.sdk.okta.oktaSDK.dto.organization.OktaSupportSetting;
import com.api.sdk.okta.oktaSDK.dto.organization.OrganizationBody;
import com.api.sdk.okta.oktaSDK.dto.organization.UserContact;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

public class OrganizationServiceImpl implements OrganizationService {

	final OrganizationOkta orgOktaService;

	String apiKey;

	public OrganizationServiceImpl() {
		apiKey = System.getProperty("apiKey");
		orgOktaService = ServiceFactory.createService(OrganizationOkta.class);
	}

	@Override
	public OrganizationBody getOrgSetting() {

		try {
			String authorization = "SSWS " + apiKey;
			Call<OrganizationBody> call = orgOktaService.getOrganizationSetting(authorization);
			Response<OrganizationBody> response = call.execute();

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
	public OrganizationBody updateOrgSetting(OrganizationBody organizationBody) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<OrganizationBody> call = orgOktaService.updateOrganizationSetting(authorization, organizationBody);
			Response<OrganizationBody> response = call.execute();

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
	public ContactTypes getContactTypes() {
		try {
			String authorization = "SSWS " + apiKey;
			Call<ContactTypes> call = orgOktaService.getContactsType(authorization);
			Response<ContactTypes> response = call.execute();

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
	public UserContact getUsersOfContactTypes(String contactType) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<UserContact> call = orgOktaService.getUserOfContactsType(authorization, contactType);
			Response<UserContact> response = call.execute();

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
	public UserContact updateUsersOfContactTypes(String contactType, UserContact userContact) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<UserContact> call = orgOktaService.updateUserOfContactsType(authorization, contactType, userContact);
			Response<UserContact> response = call.execute();

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
	public String uploadLogoForOrganization(String logoPath) {
		try {
			String authorization = "SSWS " + apiKey;
			File file = new File(logoPath);
//			InputStream in = new FileInputStream(file);
//			byte[] buf;
//			buf = new byte[in.available()];
//			if (in.available() != 0)
//				while (in.read(buf) != -1 && in.read(buf) != 0)
//					;

			RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
//			in.close();
			
			MultipartBody.Part body = MultipartBody.Part.createFormData("image", file.getName(), requestBody);

			Call<Void> call = orgOktaService.uploadLogoForOrganization(authorization, body);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Logo Uploaded";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public OktaSupportSetting getOktaSupportSetting() {
		try {
			String authorization = "SSWS " + apiKey;
			Call<OktaSupportSetting> call = orgOktaService.getOktaSupportSetting(authorization);
			Response<OktaSupportSetting> response = call.execute();

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
	public OktaSupportSetting grantOktaSupportSetting() {
		try {
			String authorization = "SSWS " + apiKey;
			Call<OktaSupportSetting> call = orgOktaService.grantOktaSupportSetting(authorization);
			Response<OktaSupportSetting> response = call.execute();

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
	public OktaSupportSetting extendOktaSupportSetting() {
		try {
			String authorization = "SSWS " + apiKey;
			Call<OktaSupportSetting> call = orgOktaService.extendOktaSupportSetting(authorization);
			Response<OktaSupportSetting> response = call.execute();

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
	public OktaSupportSetting revokeOktaSupportSetting() {
		try {
			String authorization = "SSWS " + apiKey;
			Call<OktaSupportSetting> call = orgOktaService.revokeOktaSupportSetting(authorization);
			Response<OktaSupportSetting> response = call.execute();

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
	public OktaCommunication getOktaCommunication() {
		try {
			String authorization = "SSWS " + apiKey;
			Call<OktaCommunication> call = orgOktaService.getOktaCommunication(authorization);
			Response<OktaCommunication> response = call.execute();

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
	public OktaCommunication setOptOutofOktaCommunications() {
		try {
			String authorization = "SSWS " + apiKey;
			Call<OktaCommunication> call = orgOktaService.setOptOutofOktaCommunications(authorization);
			Response<OktaCommunication> response = call.execute();

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
	public OktaCommunication setOptInofOktaCommunications() {
		try {
			String authorization = "SSWS " + apiKey;
			Call<OktaCommunication> call = orgOktaService.setOptInofOktaCommunications(authorization);
			Response<OktaCommunication> response = call.execute();

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
}
