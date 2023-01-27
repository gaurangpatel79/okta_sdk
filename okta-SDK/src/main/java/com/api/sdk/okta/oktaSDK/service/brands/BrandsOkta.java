package com.api.sdk.okta.oktaSDK.service.brands;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.brands.BrandThemes;
import com.api.sdk.okta.oktaSDK.dto.brands.BrandsLogoResponse;
import com.api.sdk.okta.oktaSDK.dto.brands.BrandsRequest;
import com.api.sdk.okta.oktaSDK.dto.brands.BrandsResponse;
import com.api.sdk.okta.oktaSDK.dto.brands.EmailCustomizations;
import com.api.sdk.okta.oktaSDK.dto.brands.EmailDefaultContent;
import com.api.sdk.okta.oktaSDK.dto.brands.EmailTemplates;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BrandsOkta {

	@GET("/api/v1/brands")
	public Call<List<BrandsResponse>> getAllBrands();

	@GET("/api/v1/brands/{brandId}")
	public Call<BrandsResponse> getBrands(@Path("brandId") String brandId);

	@PUT("/api/v1/brands/{brandId}")
	public Call<BrandsResponse> updateBrands(@Path("brandId") String brandId, @Body BrandsRequest brandsRequest);

	@GET("/api/v1/brands/{brandId}/themes")
	public Call<List<BrandThemes>> getAllTheames(@Path("brandId") String brandId);

	@GET("/api/v1/brands/{brandId}/themes/{themeId}")
	public Call<BrandThemes> getTheames(@Path("brandId") String brandId, @Path("themeId") String themeId);

	@PUT("/api/v1/brands/{brandId}/themes/{themeId}")
	public Call<BrandThemes> updateTheames(@Path("brandId") String brandId, @Path("themeId") String themeId,
			@Body BrandThemes brandThemes);

	@Multipart
	@POST("/api/v1/brands/{brandId}/themes/{themeId}/logo")
	public Call<BrandsLogoResponse> updateTheamesLogo(@Path("brandId") String brandId, @Path("themeId") String themeId,
			@Part MultipartBody.Part logo);

	@DELETE("/api/v1/brands/{brandId}/themes/{themeId}/logo")
	public Call<Void> deleteTheamesLogo(@Path("brandId") String brandId, @Path("themeId") String themeId);

	@Multipart
	@POST("/api/v1/brands/{brandId}/themes/{themeId}/background-image")
	public Call<BrandsLogoResponse> updateTheamesBackgroundImage(@Path("brandId") String brandId,
			@Path("themeId") String themeId, @Part MultipartBody.Part logo);

	@DELETE("/api/v1/brands/{brandId}/themes/{themeId}/background-image")
	public Call<Void> deleteTheamesBackgroundImage(@Path("brandId") String brandId, @Path("themeId") String themeId);

	@Multipart
	@POST("/api/v1/brands/{brandId}/themes/{themeId}/favicon")
	public Call<BrandsLogoResponse> updateTheamesFavicon(@Path("brandId") String brandId,
			@Path("themeId") String themeId, @Part MultipartBody.Part logo);

	@DELETE("/api/v1/brands/{brandId}/themes/{themeId}/favicon")
	public Call<Void> deleteTheamesFavicon(@Path("brandId") String brandId, @Path("themeId") String themeId);

	@GET("/api/v1/brands/{brandId}/templates/email")
	public Call<List<EmailTemplates>> getEmailTemplates(@Path("brandId") String brandId);

	@GET("/api/v1/brands/{brandId}/templates/email/{templateName}")
	public Call<EmailTemplates> getEmailTemplatesByBrandIdAndTemplateName(@Path("brandId") String brandId,
			@Path("templateName") String templateName);

	@GET("/api/v1/brands/{brandId}/templates/email/{templateName}/default-content")
	public Call<EmailDefaultContent> getEmailTemplatesDefaultContent(@Path("brandId") String brandId,
			@Path("templateName") String templateName);

	@GET("/api/v1/brands/{brandId}/templates/email/{templateName}/default-content/preview")
	public Call<EmailDefaultContent> getEmailTemplatesDefaultContentPreview(@Path("brandId") String brandId,
			@Path("templateName") String templateName);

	@POST("/api/v1/brands/{brandId}/templates/email/{templateName}/test")
	public Call<Void> sendTestEmail(@Path("brandId") String brandId, @Path("templateName") String templateName,
			@Query("language") String language);

	@GET("/api/v1/brands/{brandId}/templates/email/{templateName}/customizations")
	public Call<List<EmailCustomizations>> getAllEmailTemplatesCustomization(@Path("brandId") String brandId,
			@Path("templateName") String templateName);

	@POST("/api/v1/brands/{brandId}/templates/email/{templateName}/customizations")
	public Call<EmailCustomizations> creatEmailTemplatesCustomization(@Path("brandId") String brandId,
			@Path("templateName") String templateName, @Body EmailCustomizations customizations);

	@DELETE("/api/v1/brands/{brandId}/templates/email/{templateName}/customizations")
	public Call<Void> deleteAllEmailTemplatesCustomization(@Path("brandId") String brandId,
			@Path("templateName") String templateName);

	@GET("/api/v1/brands/{brandId}/templates/email/{templateName}/customizations/{customizationId}")
	public Call<EmailCustomizations> getEmailTemplatesCustomization(@Path("brandId") String brandId,
			@Path("templateName") String templateName, @Path("customizationId") String customizationId);

	@PUT("/api/v1/brands/{brandId}/templates/email/{templateName}/customizations/{customizationId}")
	public Call<EmailCustomizations> updateEmailTemplatesCustomization(@Path("brandId") String brandId,
			@Path("templateName") String templateName, @Path("customizationId") String customizationId,
			@Body EmailCustomizations emailCustomizations);

	@DELETE("/api/v1/brands/{brandId}/templates/email/{templateName}/customizations/{customizationId}")
	public Call<EmailCustomizations> deleteEmailTemplatesCustomization(@Path("brandId") String brandId,
			@Path("templateName") String templateName, @Path("customizationId") String customizationId);

	@GET("/api/v1/brands/{brandId}/templates/email/{templateName}/customizations/{customizationId}/preview")
	public Call<EmailCustomizations> getPreviewOfEmailTemplatesCustomization(@Path("brandId") String brandId,
			@Path("templateName") String templateName, @Path("customizationId") String customizationId);

}
