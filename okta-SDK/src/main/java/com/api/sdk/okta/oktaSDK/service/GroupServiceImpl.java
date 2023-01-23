package com.api.sdk.okta.oktaSDK.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.api.sdk.okta.oktaSDK.configuration.OktaConfig;
import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.error.RetrofitError;
import com.api.sdk.okta.oktaSDK.dto.group.CreateGroupRequest;
import com.api.sdk.okta.oktaSDK.dto.group.GroupResponse;
import com.api.sdk.okta.oktaSDK.dto.user.User;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import retrofit2.Call;
import retrofit2.Response;

@Service
public class GroupServiceImpl implements GroupService {

	final Okta oktaService;

	@Autowired
	public GroupServiceImpl() {
		oktaService = ServiceFactory.createService(Okta.class);
	}

	@Autowired
	private OktaConfig oktaConfig;

	public static String readString(InputStream inputStream) throws IOException {

		ByteArrayOutputStream into = new ByteArrayOutputStream();
		byte[] buf = new byte[4096];
		for (int n; 0 < (n = inputStream.read(buf));) {
			into.write(buf, 0, n);
		}
		into.close();
		return new String(into.toByteArray(), "UTF-8");
	}

	@Override
	public GroupResponse createGroup(CreateGroupRequest createGroupRequest) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<GroupResponse> call = oktaService.createGroup(authorization, createGroupRequest);
			Response<GroupResponse> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public GroupResponse getGroupById(String groupId) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<GroupResponse> call = oktaService.getGroupById(authorization, groupId);
			Response<GroupResponse> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<GroupResponse> getAllGroups() {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<GroupResponse>> call = oktaService.getAllGroups(authorization);
			Response<List<GroupResponse>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<GroupResponse> searchGroups(String query) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<GroupResponse>> call = oktaService.searchGroups(authorization, query);
			Response<List<GroupResponse>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<GroupResponse> filterGroups(String filter) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<GroupResponse>> call = oktaService.filterGroups(authorization, filter);
			Response<List<GroupResponse>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public GroupResponse updateGroup(String groupId, CreateGroupRequest createGroupRequest) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<GroupResponse> call = oktaService.updateGroupById(authorization, groupId, createGroupRequest);
			Response<GroupResponse> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deleteGroupById(String groupId) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Void> call = oktaService.deleteGroupById(authorization, groupId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return "Group Successfully Deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<User> getAllUserFromGroupById(String groupId) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<User>> call = oktaService.listGroupMembers(authorization, groupId);
			Response<List<User>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String assignUserToGroup(String groupId, String userId) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Void> call = oktaService.addUserToGroupById(authorization, groupId, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return "User Successfully Added to Group";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String removeUserToGroup(String groupId, String userId) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Void> call = oktaService.removeUserToGroupById(authorization, groupId, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return "User Successfully Removed from Group";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<ApplicationResponse> listAssignedApplicationToGroup(String groupId) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<ApplicationResponse>> call = oktaService.listAssignedApplicationToGroup(authorization, groupId);
			Response<List<ApplicationResponse>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorCauses())
						&& !ObjectUtils.isEmpty(retrofitError.getErrorCauses().get(0)))
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
