package com.api.sdk.okta.oktaSDK.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.sdk.okta.oktaSDK.dto.ResponseBody;
import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeRequest;
import com.api.sdk.okta.oktaSDK.dto.userType.UserTypeResponse;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.UserTypeService;

@RestController
public class UserTypeController {
	private UserTypeService userTypeService;
	protected final String SUCCESS = "Success";
	protected final int SUCCESS_CODE = 0;
	protected final String FAIL = "Fail";
	protected final int FAIL_CODE = 1;

	@Autowired
	public UserTypeController(UserTypeService userTypeService) {
		this.userTypeService = userTypeService;
	}

	@PostMapping("/userType/create")
	public ResponseBody<UserTypeResponse> createUserType(@RequestBody UserTypeRequest userTypeRequest) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userTypeService.createUsertype(userTypeRequest));
	}
	
	@GetMapping("/userType/list")
	public ResponseBody<List<UserTypeResponse>> getAllUserType() throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userTypeService.getAllUserType());
	}
	
	@GetMapping("/userType/default")
	public ResponseBody<UserTypeResponse> getDefaultUserType() throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userTypeService.getDefaultUserType());
	}

	@GetMapping("/userType/{typeId}")
	public ResponseBody<UserTypeResponse> getUserTypeById(@PathVariable("typeId") String typeId) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userTypeService.getUserTypeById(typeId));
	}
	
	@PutMapping("/userType/{typeId}")
	public ResponseBody<UserTypeResponse> updateUserTypeById(@PathVariable("typeId") String typeId,@RequestBody UserTypeRequest userTypeRequest) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userTypeService.updateUserTypeById(typeId,userTypeRequest));
	}

	@DeleteMapping("/userType/{typeId}")
	public ResponseBody<String> deleteUserTypeById(@PathVariable("typeId") String typeId) throws CustomValidationException {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, userTypeService.deleteUserTypeById(typeId));
	}

}
