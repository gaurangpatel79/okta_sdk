package com.api.sdk.okta.oktaSDK.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.sdk.okta.oktaSDK.dto.ResponseBody;
import com.api.sdk.okta.oktaSDK.dto.user.ActivateResponse;
import com.api.sdk.okta.oktaSDK.dto.user.ChangePasswordRequest;
import com.api.sdk.okta.oktaSDK.dto.user.User;
import com.api.sdk.okta.oktaSDK.dto.user.UserCredentials;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.UserService;

import retrofit2.http.Query;

@RestController
public class UserController {

	private UserService userService;
	protected final String SUCCESS = "Success";
	protected final int SUCCESS_CODE = 0;
	protected final String FAIL = "Fail";
	protected final int FAIL_CODE = 1;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/user/create")
	public ResponseBody<User> createUser(@RequestBody User user) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.createUser(user));
	}

	@GetMapping("/user/{userId}")
	public ResponseBody<User> getUserById(@PathVariable("userId") String userId) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.getUserById(userId));
	}

	@GetMapping("/user/{userId}/appLinks")
	public ResponseBody<List<User>> getAssignedAppLinks(@PathVariable("userId") String userId)
			throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.getAssignedAppLinks(userId));
	}

	@GetMapping("/user/find")
	public ResponseBody<List<User>> findUser(@Query("query") String query, @Query("limit") int limit)
			throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.findUser(query, limit));
	}

	@GetMapping("/user/list")
	public ResponseBody<List<User>> listUsers(@Query("limit") int limit) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.listUsers(limit));
	}

	@GetMapping("/user/search")
	public ResponseBody<List<User>> searchUsers(@Query("search") String search) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.searchUser(search));
	}

	@GetMapping("/user/filter")
	public ResponseBody<List<User>> filterUsers(@Query("filter") String filter, @Query("limit") int limit)
			throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.filterUser(filter, limit));
	}

	@PostMapping("/user/activate")
	public ResponseBody<ActivateResponse> activateUsers(@Query("userId") String userId,
			@Query("sendEmail") boolean sendEmail) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.activateUser(userId, sendEmail));
	}

	@PostMapping("/user/deactivate")
	public ResponseBody<String> deactivateUsers(@Query("userId") String userId) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.deactivateUser(userId));
	}

	@PostMapping("/user/unlock")
	public ResponseBody<String> unlockUserById(@Query("userId") String userId) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.unlockUser(userId));
	}

	@PostMapping("/user/expirePassword")
	public ResponseBody<User> expirePasswordUserById(@Query("userId") String userId) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.expirePasswordUser(userId));
	}

	@PostMapping("/user/tempPassword")
	public ResponseBody<Object> setTempPasswordUserById(@Query("userId") String userId)
			throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.setTemporaryPasswordForUser(userId, true));
	}

	@PostMapping("/user/resetPassword")
	public ResponseBody<Object> resetPasswordUserById(@Query("userId") String userId,
			@Query("isSendEmail") boolean isSendEmail) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.resetPasswordUser(userId, isSendEmail));
	}

	@PostMapping("/user/suspend")
	public ResponseBody<String> suspendUsers(@Query("userId") String userId) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.suspendUser(userId));
	}

	@PostMapping("/user/unsuspend")
	public ResponseBody<String> unSuspendUsers(@Query("userId") String userId) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.unsuspendUser(userId));
	}

	@DeleteMapping("/user/delete")
	public ResponseBody<String> deleteUsers(@Query("userId") String userId) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.deleteUser(userId));
	}

	@PutMapping("/user/{userId}/update")
	public ResponseBody<User> updateUser(@PathVariable("userId") String userId, @RequestBody User user)
			throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.updateUser(userId, user));
	}

	@PostMapping("/user/{userId}/change-password")
	public ResponseBody<UserCredentials> changePasswordByUserId(@PathVariable("userId") String userId,
			@RequestBody ChangePasswordRequest changePasswordRequest) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userService.changePassword(userId, changePasswordRequest));
	}

	@PostMapping("/user/{userId}/change-recovery-question")
	public ResponseBody<UserCredentials> changeRecoveryQuestionByUserId(@PathVariable("userId") String userId,
			@RequestBody UserCredentials userCredentials) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS,
				userService.changeRecoveryQuestionOfUserById(userId, userCredentials));
	}

	@PostMapping("/user/{userId}/forgot-password")
	public ResponseBody<Object> forgotPasswordOfUser(@PathVariable("userId") String userId,
			@Query("isSendEmail") boolean isSendEmail, @RequestBody UserCredentials userCredentials)
			throws CustomValidationException {
		if (ObjectUtils.isEmpty(userCredentials)) {
			return new ResponseBody<>(SUCCESS_CODE, SUCCESS,
					userService.forgotPasswordWithOTPByUserId(userId, isSendEmail));
		} else {
			return new ResponseBody<>(SUCCESS_CODE, SUCCESS,
					userService.forgotPasswordWithSecurityAnswerByUserId(userId, isSendEmail, userCredentials));
		}

	}
}
