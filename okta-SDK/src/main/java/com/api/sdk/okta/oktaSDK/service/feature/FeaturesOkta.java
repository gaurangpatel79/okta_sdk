package com.api.sdk.okta.oktaSDK.service.feature;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.feature.FeaturesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FeaturesOkta {

	@GET("/api/v1/features")
	public Call<List<FeaturesResponse>> getAllFeatures();

	@POST("/api/v1/features/{featureId}/enable")
	public Call<FeaturesResponse> enableFeatureById(@Path("featureId") String featureId);

	@POST("/api/v1/features/{featureId}/enable")
	public Call<FeaturesResponse> forceEnableFeatureById(@Path("featureId") String featureId,
			@Query("mode") String mode);

	@POST("/api/v1/features/{featureId}/disable")
	public Call<FeaturesResponse> disableFeatureById(@Path("featureId") String featureId);

	@POST("/api/v1/features/{featureId}/disable")
	public Call<FeaturesResponse> forceDisableFeatureById(@Path("featureId") String featureId,
			@Query("mode") String mode);

	@GET("/api/v1/features/{featureId}/dependencies")
	public Call<List<FeaturesResponse>> getDepedenciesByFeatureId(@Path("featureId") String featureId);

	@GET("/api/v1/features/{featureId}/dependents")
	public Call<List<FeaturesResponse>> getDepedentsByFeatureId(@Path("featureId") String featureId);

}
