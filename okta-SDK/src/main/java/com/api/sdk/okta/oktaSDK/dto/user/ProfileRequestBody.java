package com.api.sdk.okta.oktaSDK.dto.user;

import lombok.Data;

@Data
public class ProfileRequestBody {

	private String login;
	private String firstName;
	private String lastName;
	private String nickName;
	private String displayName;
	private String email;
	private String secondEmail;
	private String profileUrl;
	private String preferredLanguage= "en-US";
	private String userType;
	private String organization= "Okta";
	private String title;
	private String division;
	private String department;
	private String costCenter;
	private String employeeNumber;
	private String mobilePhone;
	private String primaryPhone;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String countryCode;
}
