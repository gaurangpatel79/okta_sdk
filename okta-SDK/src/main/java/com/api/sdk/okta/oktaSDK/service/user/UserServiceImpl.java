package com.api.sdk.okta.oktaSDK.service.user;

import java.io.IOException;
import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.user.ActivateResponse;
import com.api.sdk.okta.oktaSDK.dto.user.ChangePasswordRequest;
import com.api.sdk.okta.oktaSDK.dto.user.User;
import com.api.sdk.okta.oktaSDK.dto.user.UserCredentials;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class UserServiceImpl implements UserService {

	final UserOkta oktaService;
	String apiKey;
	
	public UserServiceImpl() {
		apiKey = System.getProperty("apiKey");
		oktaService = ServiceFactory.createService(UserOkta.class);
	}

 	@Override
	public User createUser(User user) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<User> call = oktaService.createUser(authorization, user);
			Response<User> response = call.execute();

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
	public User getUserById(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<User> call = oktaService.getUserById(authorization, userId);
			Response<User> response = call.execute();

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
	public List<User> getAssignedAppLinks(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<User>> call = oktaService.getAssignedAppLinks(authorization, userId);
			Response<List<User>> response = call.execute();

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
	public List<User> findUser(String query, int limit) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<User>> call = oktaService.findUser(authorization, query, limit);
			Response<List<User>> response = call.execute();

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
	public List<User> listUsers(int limit) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<User>> call = oktaService.listUser(authorization, limit);
			Response<List<User>> response = call.execute();

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
	public List<User> searchUser(String query) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<User>> call = oktaService.searchUser(authorization, query);
			Response<List<User>> response = call.execute();

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
	public List<User> filterUser(String query, int limit) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<User>> call = oktaService.filterUser(authorization, query, limit);
			Response<List<User>> response = call.execute();

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
	public ActivateResponse activateUser(String userId, boolean isSendEmail) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<ActivateResponse> call = oktaService.activateUser(authorization, userId, isSendEmail);
			Response<ActivateResponse> response = call.execute();

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
	public String deactivateUser(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.deactivateUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
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
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.unlockUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
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
			String authorization = "SSWS " + apiKey;
			Call<User> call = oktaService.expirePassword(authorization, userId);
			Response<User> response = call.execute();

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
	public Object resetPasswordUser(String userId, boolean isSendEmail) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Object> call = oktaService.resetPasswordUser(authorization, userId, isSendEmail);
			Response<Object> response = call.execute();

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
	public Object setTemporaryPasswordForUser(String userId, boolean isTempPassword) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Object> call = oktaService.setTemporaryPassword(authorization, userId, isTempPassword);
			Response<Object> response = call.execute();

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
	public String suspendUser(String userId) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.suspendUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
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
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.unsuspendUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
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
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.unsuspendUser(authorization, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "User Deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public User updateUser(String userId, User user) throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<User> call = oktaService.updateUser(authorization, userId, user);
			Response<User> response = call.execute();

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
	public UserCredentials changePassword(String userId, ChangePasswordRequest changePasswordRequest)
			throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<UserCredentials> call = oktaService.changePasswordOfUserById(authorization, userId,
					changePasswordRequest);
			Response<UserCredentials> response = call.execute();

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
	public UserCredentials changeRecoveryQuestionOfUserById(String userId, UserCredentials userCredentials)
			throws CustomValidationException {
		try {
			String authorization = "SSWS " + apiKey;
			Call<UserCredentials> call = oktaService.changeRecoveryQuestionOfUserById(authorization, userId,
					userCredentials);
			Response<UserCredentials> response = call.execute();

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
	public UserCredentials forgotPasswordWithSecurityAnswerByUserId(String userId, boolean isSendEmail,
			UserCredentials userCredentials) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<UserCredentials> call = oktaService.forgotPasswordWithSecurityAnswerByUserId(authorization, userId,
					isSendEmail, userCredentials);
			Response<UserCredentials> response = call.execute();

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
	public Object forgotPasswordWithOTPByUserId(String userId, boolean isSendEmail) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Object> call = oktaService.forgotPasswordWithOTPByUserId(authorization, userId, isSendEmail);
			Response<Object> response = call.execute();

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

}
