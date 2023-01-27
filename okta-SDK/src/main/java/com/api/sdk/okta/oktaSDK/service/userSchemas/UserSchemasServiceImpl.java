package com.api.sdk.okta.oktaSDK.service.userSchemas;

import java.io.IOException;

import com.api.sdk.okta.oktaSDK.dto.userSchemas.Definitions;
import com.api.sdk.okta.oktaSDK.dto.userSchemas.UserSchemasResponse;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class UserSchemasServiceImpl implements UserSchemasService {
	
	final UserSchemasOkta oktaService;

	public UserSchemasServiceImpl() {
		oktaService = ServiceFactory.createService(UserSchemasOkta.class);
	}

	@Override
	public UserSchemasResponse getUserSchemas() {
		try {
			Call<UserSchemasResponse> call = oktaService.getUserSchemas();
			Response<UserSchemasResponse> response = call.execute();

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
	public UserSchemasResponse updateUserSchemasAttribute(Definitions definitions) {
		try {
			Call<UserSchemasResponse> call = oktaService.updateUserSchemasAttribute(definitions);
			Response<UserSchemasResponse> response = call.execute();

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
