package com.api.sdk.okta.oktaSDK.service;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeRequest;
import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeResponse;

public interface UserTypeService {
	
	public UserTypeResponse createUsertype(UserTypeRequest userTypeRequest);
	
	public List<UserTypeResponse> getAllUserType();
	
	public UserTypeResponse getDefaultUserType();

	public UserTypeResponse getUserTypeById(String typeId);
	
	public UserTypeResponse updateUserTypeById(String typeId,UserTypeRequest userTypeRequest);
	
	public String deleteUserTypeById(String typeId);
}

