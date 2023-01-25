package com.api.sdk.okta.oktaSDK.service.user;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.user.ActivateResponse;
import com.api.sdk.okta.oktaSDK.dto.user.ChangePasswordRequest;
import com.api.sdk.okta.oktaSDK.dto.user.User;
import com.api.sdk.okta.oktaSDK.dto.user.UserCredentials;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;

public interface UserService {

	public User createUser(User user) throws CustomValidationException;

	public User updateUser(String userId,User user) throws CustomValidationException;

	public User getUserById(String userId) throws CustomValidationException;

	public List<User> getAssignedAppLinks(String userId) throws CustomValidationException;

	public List<User> findUser(String query, int limit) throws CustomValidationException;

	public List<User> listUsers(int limit) throws CustomValidationException;

	public List<User> searchUser(String query) throws CustomValidationException;

	public List<User> filterUser(String query, int limit) throws CustomValidationException;

	public ActivateResponse activateUser(String userId, boolean isSendEmail) throws CustomValidationException;

	public String deactivateUser(String userId) throws CustomValidationException;

	public String unlockUser(String userId) throws CustomValidationException;

	public User expirePasswordUser(String userId) throws CustomValidationException;

	public Object setTemporaryPasswordForUser(String userId, boolean isTempPassword) throws CustomValidationException;

	public Object resetPasswordUser(String userId, boolean isSendEmail) throws CustomValidationException;

	public String suspendUser(String userId) throws CustomValidationException;

	public String unsuspendUser(String userId) throws CustomValidationException;

	public String deleteUser(String userId) throws CustomValidationException;

	public UserCredentials changePassword(String userId,ChangePasswordRequest changePasswordRequest) throws CustomValidationException;
	
	public UserCredentials changeRecoveryQuestionOfUserById(String userId,UserCredentials userCredentials) throws CustomValidationException;
	
	public UserCredentials forgotPasswordWithSecurityAnswerByUserId(String userId,boolean isSendEmail,UserCredentials userCredentials);
	
	public Object forgotPasswordWithOTPByUserId(String userId,boolean isSendEmail);

}
