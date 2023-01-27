package com.api.sdk.okta.oktaSDK.service.userSchemas;

import com.api.sdk.okta.oktaSDK.dto.userSchemas.Definitions;
import com.api.sdk.okta.oktaSDK.dto.userSchemas.UserSchemasResponse;

public interface UserSchemasService {

	public UserSchemasResponse getUserSchemas();
	
	public UserSchemasResponse updateUserSchemasAttribute(Definitions definitions);	
}
