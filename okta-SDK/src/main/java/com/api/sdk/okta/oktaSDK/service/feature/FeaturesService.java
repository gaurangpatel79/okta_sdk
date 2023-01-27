package com.api.sdk.okta.oktaSDK.service.feature;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.feature.FeaturesResponse;

public interface FeaturesService {

	public List<FeaturesResponse> getAllFeatures();

	public FeaturesResponse enableFeatureById(String featureId);

	public FeaturesResponse forceEnableFeatureById(String featureId);

	public FeaturesResponse disableFeatureById(String featureId);

	public FeaturesResponse forceDisableFeatureById(String featureId);

	public List<FeaturesResponse> getDepedenciesByFeatureId(String featureId);

	public List<FeaturesResponse> getDepedentsByFeatureId(String featureId);

}
