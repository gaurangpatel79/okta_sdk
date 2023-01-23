package com.api.sdk.okta.oktaSDK.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.api.sdk.okta.oktaSDK.configuration.OktaConfig;
import com.api.sdk.okta.oktaSDK.dto.error.RetrofitError;
import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeRequest;
import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeResponse;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import retrofit2.Call;
import retrofit2.Response;

@Service
public class UserTypeServiceImpl implements UserTypeService {
	final Okta oktaService;

	@Autowired
	public UserTypeServiceImpl() {
		oktaService = ServiceFactory.createService(Okta.class);
	}

	@Autowired
	private OktaConfig oktaConfig;

	public static String readString(InputStream inputStream) throws IOException {

		ByteArrayOutputStream into = new ByteArrayOutputStream();
		byte[] buf = new byte[4096];
		for (int n; 0 < (n = inputStream.read(buf));) {
			into.write(buf, 0, n);
		}
		into.close();
		return new String(into.toByteArray(), "UTF-8");
	}

	@Override
	public UserTypeResponse createUsertype(UserTypeRequest userTypeRequest) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<UserTypeResponse> call = oktaService.createUserType(authorization, userTypeRequest);
			Response<UserTypeResponse> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0).getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
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
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<UserTypeResponse>> call = oktaService.getAllUserType(authorization);
			Response<List<UserTypeResponse>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0).getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
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
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<UserTypeResponse> call = oktaService.getDefaultUserType(authorization);
			Response<UserTypeResponse> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0).getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
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
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<UserTypeResponse> call = oktaService.getUserTypeById(authorization, typeId);
			Response<UserTypeResponse> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0).getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
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
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<UserTypeResponse> call = oktaService.updateUserTypeById(authorization, typeId, userTypeRequest);
			Response<UserTypeResponse> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0).getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());

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
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Void> call = oktaService.deleteUserTypeById(authorization, typeId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0).getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return "UserType Successfully Deleted.";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
