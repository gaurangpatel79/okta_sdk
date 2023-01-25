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

	public UserServiceImpl() {
		oktaService = ServiceFactory.createService(UserOkta.class);
	}

	@Override
	public User createUser(User user) throws CustomValidationException {
		try {

			Call<User> call = oktaService.createUser(user);
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

			Call<User> call = oktaService.getUserById(userId);
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

			Call<List<User>> call = oktaService.getAssignedAppLinks(userId);
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

			Call<List<User>> call = oktaService.findUser(query, limit);
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

			Call<List<User>> call = oktaService.listUser(limit);
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

			Call<List<User>> call = oktaService.searchUser(query);
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

			Call<List<User>> call = oktaService.filterUser(query, limit);
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

			Call<ActivateResponse> call = oktaService.activateUser(userId, isSendEmail);
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

			Call<Void> call = oktaService.deactivateUser(userId);
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

			Call<Void> call = oktaService.unlockUser(userId);
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

			Call<User> call = oktaService.expirePassword(userId);
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

			Call<Object> call = oktaService.resetPasswordUser(userId, isSendEmail);
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

			Call<Object> call = oktaService.setTemporaryPassword(userId, isTempPassword);
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

			Call<Void> call = oktaService.suspendUser(userId);
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

			Call<Void> call = oktaService.unsuspendUser(userId);
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

			Call<Void> call = oktaService.unsuspendUser(userId);
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

			Call<User> call = oktaService.updateUser(userId, user);
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

			Call<UserCredentials> call = oktaService.changePasswordOfUserById(userId, changePasswordRequest);
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

			Call<UserCredentials> call = oktaService.changeRecoveryQuestionOfUserById(userId, userCredentials);
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

			Call<UserCredentials> call = oktaService.forgotPasswordWithSecurityAnswerByUserId(userId, isSendEmail,
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
	public Object forgotPasswordWithOTPByUserId(String userId, boolean isSendEmail) {
		try {

			Call<Object> call = oktaService.forgotPasswordWithOTPByUserId(userId, isSendEmail);
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
