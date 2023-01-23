package com.api.sdk.okta.oktaSDK.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.api.sdk.okta.oktaSDK.configuration.OktaConfig;
import com.api.sdk.okta.oktaSDK.dto.error.RetrofitError;
import com.api.sdk.okta.oktaSDK.dto.user.ActivateResponse;
import com.api.sdk.okta.oktaSDK.dto.user.ChangePasswordRequest;
import com.api.sdk.okta.oktaSDK.dto.user.User;
import com.api.sdk.okta.oktaSDK.dto.user.UserCredentials;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import retrofit2.Call;
import retrofit2.Response;

@Service
public class UserServiceImpl implements UserService {

	final Okta oktaService;

	@Autowired
	public UserServiceImpl() {
		oktaService = ServiceFactory.createService(Okta.class);
	}

	@Autowired
	private OktaConfig oktaConfig;

	@Override
	public User createUser(User user) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<User> call = oktaService.createUser(authorization, user);
			Response<User> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	public static String readString(InputStream inputStream) throws IOException {

		ByteArrayOutputStream into = new ByteArrayOutputStream();
		byte[] buf = new byte[4096];
		for (int n; 0 < (n = inputStream.read(buf));) {
			into.write(buf, 0, n);
		}
		into.close();
		return new String(into.toByteArray(), "UTF-8"); // Or whatever encoding
	}

	@Override
	public User getUserById(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<User> call = oktaService.getUserById(authorization, userId);
			Response<User> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<User> getAssignedAppLinks(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<User>> call = oktaService.getAssignedAppLinks(authorization, userId);
			Response<List<User>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<User> findUser(String query, int limit) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<User>> call = oktaService.findUser(authorization, query, limit);
			Response<List<User>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<User> listUsers(int limit) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<User>> call = oktaService.listUser(authorization, limit);
			Response<List<User>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<User> searchUser(String query) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<User>> call = oktaService.searchUser(authorization, query);
			Response<List<User>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<User> filterUser(String query, int limit) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<List<User>> call = oktaService.filterUser(authorization, query, limit);
			Response<List<User>> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ActivateResponse activateUser(String userId, boolean isSendEmail) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<ActivateResponse> call = oktaService.activateUser(authorization, userId, isSendEmail);
			Response<ActivateResponse> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());

			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deactivateUser(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Void> call = oktaService.deactivateUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return "User Deactivated";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String unlockUser(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Void> call = oktaService.unlockUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return "User Unlocked";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public User expirePasswordUser(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<User> call = oktaService.expirePassword(authorization, userId);
			Response<User> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public Object resetPasswordUser(String userId, boolean isSendEmail) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Object> call = oktaService.resetPasswordUser(authorization, userId, isSendEmail);
			Response<Object> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public Object setTemporaryPasswordForUser(String userId, boolean isTempPassword) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Object> call = oktaService.setTemporaryPassword(authorization, userId, isTempPassword);
			Response<Object> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
//				new ObjectMapper().readValue(response.body().toString(), TempPasswordResponse.class);

				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String suspendUser(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Void> call = oktaService.suspendUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return "User Suspended";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String unsuspendUser(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Void> call = oktaService.unsuspendUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return "User UnSuspended";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deleteUser(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Void> call = oktaService.unsuspendUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return "User Deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public User updateUser(String userId,User user) throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<User> call = oktaService.updateUser(authorization,userId, user);
			Response<User> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public UserCredentials changePassword(String userId, ChangePasswordRequest changePasswordRequest)
			throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<UserCredentials> call = oktaService.changePasswordOfUserById(authorization, userId,
					changePasswordRequest);
			Response<UserCredentials> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public UserCredentials changeRecoveryQuestionOfUserById(String userId, UserCredentials userCredentials)
			throws CustomValidationException {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<UserCredentials> call = oktaService.changeRecoveryQuestionOfUserById(authorization, userId,
					userCredentials);
			Response<UserCredentials> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public UserCredentials forgotPasswordWithSecurityAnswerByUserId(String userId, boolean isSendEmail,
			UserCredentials userCredentials) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<UserCredentials> call = oktaService.forgotPasswordWithSecurityAnswerByUserId(authorization, userId,
					isSendEmail, userCredentials);
			Response<UserCredentials> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public Object forgotPasswordWithOTPByUserId(String userId, boolean isSendEmail) {
		try {
			String authorization = "SSWS " + oktaConfig.getApiKey();
			Call<Object> call = oktaService.forgotPasswordWithOTPByUserId(authorization, userId, isSendEmail);
			Response<Object> response = call.execute();

			if (!response.isSuccessful()) {
				String errorMessage = readString(response.errorBody().byteStream());
				ObjectMapper mapper = new ObjectMapper();
				RetrofitError retrofitError = mapper.readValue(errorMessage, RetrofitError.class);
				if (!ObjectUtils.isEmpty(retrofitError.getErrorSummary()))
					throw new CustomValidationException(retrofitError.getErrorSummary());
				else
					throw new CustomValidationException(retrofitError.getErrorCauses().get(0).getErrorSummary());
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
