package com.api.sdk.okta.oktaSDK.service.authorizationServer;

import java.io.IOException;
import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.authorizationServer.AuthorizationServerResponse;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class AuthorizationServerServiceImpl implements AuthorizationServerService {

	final AuthorizationServerOkta oktaService;

	public AuthorizationServerServiceImpl() {
		oktaService = ServiceFactory.createService(AuthorizationServerOkta.class);
	}

	@Override
	public List<AuthorizationServerResponse> getAllAuthorizationServers() {
		try {
			Call<List<AuthorizationServerResponse>> call = oktaService.getAllAuthorizationServers();
			Response<List<AuthorizationServerResponse>> response = call.execute();

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
	public AuthorizationServerResponse createAuthorizationServer(
			AuthorizationServerResponse authorizationServerResponse) {
		try {
			Call<AuthorizationServerResponse> call = oktaService.createAuthorizationServer(authorizationServerResponse);
			Response<AuthorizationServerResponse> response = call.execute();

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
	public AuthorizationServerResponse getAuthorizationServerById(String authorizationServerId) {
		try {
			Call<AuthorizationServerResponse> call = oktaService.getAuthorizationServerById(authorizationServerId);
			Response<AuthorizationServerResponse> response = call.execute();

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
	public AuthorizationServerResponse updateAuthorizationServer(String authorizationServerId,
			AuthorizationServerResponse authorizationServerResponse) {
		try {
			Call<AuthorizationServerResponse> call = oktaService.updateAuthorizationServer(authorizationServerId,
					authorizationServerResponse);
			Response<AuthorizationServerResponse> response = call.execute();

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
	public String deleteAuthorizationServerById(String authorizationServerId) {
		try {
			Call<Void> call = oktaService.deleteAuthorizationServerById(authorizationServerId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Authorization Server Deleted.";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String activateAuthorizationServer(String authorizationServerId) {
		try {
			Call<Void> call = oktaService.activateAuthorizationServer(authorizationServerId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Authorization Server Activated Successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deactivateAuthorizationServer(String authorizationServerId) {
		try {
			Call<Void> call = oktaService.deactivateAuthorizationServer(authorizationServerId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Authorization Server Deactivated Successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
