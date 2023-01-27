package com.api.sdk.okta.oktaSDK.service.customTemplate;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.customTemplate.CustomTemplateResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CustomTemplateOkta {

	@GET("/api/v1/templates/sms")
	public Call<List<CustomTemplateResponse>> getAllSMSTemplate();

	@GET("/api/v1/templates/sms")
	public Call<List<CustomTemplateResponse>> getSMSTemplateByType(@Query("templateType") String templateType);

	@POST("/api/v1/templates/sms")
	public Call<CustomTemplateResponse> createSMSTemplate(@Body CustomTemplateResponse customTemplate);

	@PUT("/api/v1/templates/sms/{templateId}")
	public Call<CustomTemplateResponse> updateSMSTemplate(@Path("templateId") String templateId,@Body CustomTemplateResponse customTemplate);

	@POST("/api/v1/templates/sms/{templateId}")
	public Call<CustomTemplateResponse> partialUpdateSMSTemplate(@Path("templateId") String templateId,@Body CustomTemplateResponse customTemplate);

	@GET("/api/v1/templates/sms/{templateId}")
	public Call<CustomTemplateResponse> getSMSTemplateById(@Path("templateId") String templateId);

	@DELETE("/api/v1/templates/sms/{templateId}")
	public Call<Void> deleteSMSTemplateById(@Path("templateId") String templateId);

}
