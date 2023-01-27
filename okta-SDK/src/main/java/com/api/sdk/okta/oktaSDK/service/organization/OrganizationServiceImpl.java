package com.api.sdk.okta.oktaSDK.service.organization;

import java.io.File;
import java.io.IOException;

import com.api.sdk.okta.oktaSDK.dto.organization.ContactTypes;
import com.api.sdk.okta.oktaSDK.dto.organization.EmailAddresses;
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

	public OrganizationServiceImpl() {
		orgOktaService = ServiceFactory.createService(OrganizationOkta.class);
	}

	@Override
	public OrganizationBody getOrgSetting() {

		try {

			Call<OrganizationBody> call = orgOktaService.getOrganizationSetting();
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

			Call<OrganizationBody> call = orgOktaService.updateOrganizationSetting(organizationBody);
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

			Call<ContactTypes> call = orgOktaService.getContactsType();
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

			Call<UserContact> call = orgOktaService.getUserOfContactsType(contactType);
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

			Call<UserContact> call = orgOktaService.updateUserOfContactsType(contactType, userContact);
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
			File file = new File(logoPath);
			RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), file);
			MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestBody);

			Call<Void> call = orgOktaService.uploadLogoForOrganization(body);
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

			Call<OktaSupportSetting> call = orgOktaService.getOktaSupportSetting();
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

			Call<OktaSupportSetting> call = orgOktaService.grantOktaSupportSetting();
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

			Call<OktaSupportSetting> call = orgOktaService.extendOktaSupportSetting();
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
			Call<OktaSupportSetting> call = orgOktaService.revokeOktaSupportSetting();
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
			Call<OktaCommunication> call = orgOktaService.getOktaCommunication();
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
			Call<OktaCommunication> call = orgOktaService.setOptOutofOktaCommunications();
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
			Call<OktaCommunication> call = orgOktaService.setOptInofOktaCommunications();
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
	public String createEmailAddressBounceRemovalList(EmailAddresses emailAddresses) {
		try {
			Call<OktaCommunication> call = orgOktaService.createEmailAddressBounceRemovalList(emailAddresses);
			Response<OktaCommunication> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Successful";
			}

		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
