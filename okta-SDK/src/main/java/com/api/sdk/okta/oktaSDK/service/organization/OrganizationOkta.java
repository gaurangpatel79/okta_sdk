package com.api.sdk.okta.oktaSDK.service.organization;

import com.api.sdk.okta.oktaSDK.dto.organization.ContactTypes;
import com.api.sdk.okta.oktaSDK.dto.organization.EmailAddresses;
import com.api.sdk.okta.oktaSDK.dto.organization.OktaCommunication;
import com.api.sdk.okta.oktaSDK.dto.organization.OktaSupportSetting;
import com.api.sdk.okta.oktaSDK.dto.organization.OrganizationBody;
import com.api.sdk.okta.oktaSDK.dto.organization.UserContact;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface OrganizationOkta {

	// Organization API's
	@GET("/api/v1/org")
	public Call<OrganizationBody> getOrganizationSetting(@Header("Authorization") String authorization);

	@PUT("/api/v1/org")
	public Call<OrganizationBody> updateOrganizationSetting(@Header("Authorization") String authorization,@Body OrganizationBody organizationBody);

	@GET("/api/v1/org/contacts")
	public Call<ContactTypes> getContactsType(@Header("Authorization") String authorization);
	
	@GET("/api/v1/org/contacts/{contactType}")
	public Call<UserContact> getUserOfContactsType(@Header("Authorization") String authorization,@Path("contactType") String contactType);
	
	@PUT("/api/v1/org/contacts/{contactType}")
	public Call<UserContact> updateUserOfContactsType(@Header("Authorization") String authorization,@Path("contactType") String contactType,@Body UserContact userContact);

	@Multipart
	@POST("/api/v1/org/logo")
	public Call<Void> uploadLogoForOrganization(@Header("Authorization") String authorization,@Part MultipartBody.Part logo);

	@GET("/api/v1/org/privacy/oktaSupport")
	public Call<OktaSupportSetting> getOktaSupportSetting(@Header("Authorization") String authorization);

	@POST("/api/v1/org/privacy/oktaSupport/grant")
	public Call<OktaSupportSetting> grantOktaSupportSetting(@Header("Authorization") String authorization);

	@POST("/api/v1/org/privacy/oktaSupport/extend")
	public Call<OktaSupportSetting> extendOktaSupportSetting(@Header("Authorization") String authorization);

	@POST("/api/v1/org/privacy/oktaSupport/revoke")
	public Call<OktaSupportSetting> revokeOktaSupportSetting(@Header("Authorization") String authorization);
	
	@GET("/api/v1/org/privacy/oktaCommunication")
	public Call<OktaCommunication> getOktaCommunication(@Header("Authorization") String authorization);

	@POST("/api/v1/org/privacy/oktaCommunication/optOut")
	public Call<OktaCommunication> setOptOutofOktaCommunications(@Header("Authorization") String authorization);

	@POST("/api/v1/org/privacy/oktaCommunication/optIn")
	public Call<OktaCommunication> setOptInofOktaCommunications(@Header("Authorization") String authorization);

	@POST("/api/v1/org/email/bounces/remove-list")
	public Call<OktaCommunication> createEmailAddressBounceRemovalList(@Header("Authorization") String authorization,@Body EmailAddresses emailAddresses);

	
}

