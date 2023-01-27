package com.api.sdk.okta.oktaSDK.service.feature;

import java.io.IOException;
import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.feature.FeaturesResponse;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class FeaturesServiceImpl implements FeaturesService {

	final FeaturesOkta oktaService;

	public FeaturesServiceImpl() {
		oktaService = ServiceFactory.createService(FeaturesOkta.class);
	}

	@Override
	public List<FeaturesResponse> getAllFeatures() {
		try {
			Call<List<FeaturesResponse>> call = oktaService.getAllFeatures();
			Response<List<FeaturesResponse>> response = call.execute();

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
	public FeaturesResponse enableFeatureById(String featureId) {
		try {
			Call<FeaturesResponse> call = oktaService.enableFeatureById(featureId);
			Response<FeaturesResponse> response = call.execute();

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

	/**
	 * set Mode as force
	 */
	@Override
	public FeaturesResponse forceEnableFeatureById(String featureId) {
		try {
			Call<FeaturesResponse> call = oktaService.forceEnableFeatureById(featureId, "force");
			Response<FeaturesResponse> response = call.execute();

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
	public FeaturesResponse disableFeatureById(String featureId) {
		try {
			Call<FeaturesResponse> call = oktaService.disableFeatureById(featureId);
			Response<FeaturesResponse> response = call.execute();

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
	public FeaturesResponse forceDisableFeatureById(String featureId) {
		try {
			Call<FeaturesResponse> call = oktaService.forceDisableFeatureById(featureId, "force");
			Response<FeaturesResponse> response = call.execute();

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
	public List<FeaturesResponse> getDepedenciesByFeatureId(String featureId) {
		try {
			Call<List<FeaturesResponse>> call = oktaService.getDepedenciesByFeatureId(featureId);
			Response<List<FeaturesResponse>> response = call.execute();

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
	public List<FeaturesResponse> getDepedentsByFeatureId(String featureId) {
		try {
			Call<List<FeaturesResponse>> call = oktaService.getDepedentsByFeatureId(featureId);
			Response<List<FeaturesResponse>> response = call.execute();

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
