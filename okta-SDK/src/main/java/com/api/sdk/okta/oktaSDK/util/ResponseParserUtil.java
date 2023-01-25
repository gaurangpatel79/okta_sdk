package com.api.sdk.okta.oktaSDK.util;

import java.io.IOException;

import com.api.sdk.okta.oktaSDK.dto.error.RetrofitError;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;

import retrofit2.Response;

public class ResponseParserUtil {
	
	public static void parseErrorResponse(Response<?> response) throws IOException {
		String errorMessage = response.errorBody().string();
		RetrofitError retrofitError = ObjectMapperHelper.readValueFromJSON(errorMessage, RetrofitError.class);
		if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
				&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
			throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
		else if(!ObjectUtils.isEmpty(retrofitError.getErrorLink()))
			throw new CustomValidationException(retrofitError.getErrorLink());
		else
			throw new CustomValidationException(retrofitError.getErrorSummary());
	}

}
