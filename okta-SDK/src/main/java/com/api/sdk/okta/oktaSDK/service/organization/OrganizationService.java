package com.api.sdk.okta.oktaSDK.service.organization;

import com.api.sdk.okta.oktaSDK.dto.organization.ContactTypes;
import com.api.sdk.okta.oktaSDK.dto.organization.EmailAddresses;
import com.api.sdk.okta.oktaSDK.dto.organization.OktaCommunication;
import com.api.sdk.okta.oktaSDK.dto.organization.OktaSupportSetting;
import com.api.sdk.okta.oktaSDK.dto.organization.OrganizationBody;
import com.api.sdk.okta.oktaSDK.dto.organization.UserContact;

public interface OrganizationService {

	
	public OrganizationBody getOrgSetting();
	
	public OrganizationBody updateOrgSetting(OrganizationBody organizationBody);
	
	public ContactTypes getContactTypes();
	
	public UserContact getUsersOfContactTypes(String contactType);
	
	public UserContact updateUsersOfContactTypes(String contactType,UserContact contactRequest);
	
	public String uploadLogoForOrganization(String logoPath);
	
	public OktaSupportSetting getOktaSupportSetting();
	
	public OktaSupportSetting grantOktaSupportSetting();
	
	public OktaSupportSetting extendOktaSupportSetting();
	
	public OktaSupportSetting revokeOktaSupportSetting();
	
	public OktaCommunication getOktaCommunication();

	public OktaCommunication setOptOutofOktaCommunications();

	public OktaCommunication setOptInofOktaCommunications();
	
	public String createEmailAddressBounceRemovalList(EmailAddresses emailAddresses);

	
}
