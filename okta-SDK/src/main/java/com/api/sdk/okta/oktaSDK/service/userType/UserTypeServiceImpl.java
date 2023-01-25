package com.api.sdk.okta.oktaSDK.service.userType;

import java.io.IOException;
import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeRequest;
import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeResponse;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class UserTypeServiceImpl implements UserTypeService {
	final UserTypeOkta oktaService;

	public UserTypeServiceImpl() {
		oktaService = ServiceFactory.createService(UserTypeOkta.class);
	}

	@Override
	public UserTypeResponse createUsertype(UserTypeRequest userTypeRequest) {
		try {

			Call<UserTypeResponse> call = oktaService.createUserType(userTypeRequest);
			Response<UserTypeResponse> response = call.execute();

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
	public List<UserTypeResponse> getAllUserType() {
		try {

			Call<List<UserTypeResponse>> call = oktaService.getAllUserType();
			Response<List<UserTypeResponse>> response = call.execute();

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
	public UserTypeResponse getDefaultUserType() {
		try {

			Call<UserTypeResponse> call = oktaService.getDefaultUserType();
			Response<UserTypeResponse> response = call.execute();

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
	public UserTypeResponse getUserTypeById(String typeId) {
		try {

			Call<UserTypeResponse> call = oktaService.getUserTypeById(typeId);
			Response<UserTypeResponse> response = call.execute();

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
	public UserTypeResponse updateUserTypeById(String typeId, UserTypeRequest userTypeRequest) {
		try {

			Call<UserTypeResponse> call = oktaService.updateUserTypeById(typeId, userTypeRequest);
			Response<UserTypeResponse> response = call.execute();

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
	public String deleteUserTypeById(String typeId) {
		try {

			Call<Void> call = oktaService.deleteUserTypeById(typeId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "UserType Successfully Deleted.";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
