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
import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.group.CreateGroupRequest;
import com.api.sdk.okta.oktaSDK.dto.group.GroupResponse;
import com.api.sdk.okta.oktaSDK.dto.user.User;
import com.api.sdk.okta.oktaSDK.service.GroupService;

import retrofit2.http.Query;

@RestController
public class GroupController {

	GroupService groupService;
	protected final String SUCCESS = "Success";
	protected final int SUCCESS_CODE = 0;
	protected final String FAIL = "Fail";
	protected final int FAIL_CODE = 1;

	@Autowired
	public GroupController(GroupService groupService) {
		this.groupService = groupService;
	}

	@PostMapping("/group/create")
	public ResponseBody<GroupResponse> createGroup(@RequestBody CreateGroupRequest createGroupRequest) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.createGroup(createGroupRequest));
	}

	@GetMapping("/group/{groupId}")
	public ResponseBody<GroupResponse> getGroupById(@PathVariable("groupId") String groupId) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.getGroupById(groupId));
	}

	@GetMapping("/group/list")
	public ResponseBody<List<GroupResponse>> getAllGroups() {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.getAllGroups());
	}

	@GetMapping("/group/search")
	public ResponseBody<List<GroupResponse>> searchGroups(@Query("q") String query) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.searchGroups(query));
	}

	@GetMapping("/group/filter")
	public ResponseBody<List<GroupResponse>> filterGroups(@Query("q") String filter) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.filterGroups(filter));
	}

	@PutMapping("/group/{groupId}")
	public ResponseBody<GroupResponse> updateGroup(@PathVariable("groupId") String groupId,
			@RequestBody CreateGroupRequest createGroupRequest) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.updateGroup(groupId, createGroupRequest));
	}

	@DeleteMapping("/group/{groupId}")
	public ResponseBody<String> deleteGroup(@PathVariable("groupId") String groupId) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.deleteGroupById(groupId));
	}

	@GetMapping("/group/{groupId}/members")
	public ResponseBody<List<User>> getMembersOfGroup(@PathVariable("groupId") String groupId) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.getAllUserFromGroupById(groupId));
	}

	@PutMapping("/group/{groupId}/members/{userId}")
	public ResponseBody<String> assignUsertoGroupById(@PathVariable("groupId") String groupId,
			@PathVariable("userId") String userId) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.assignUserToGroup(groupId, userId));
	}

	@DeleteMapping("/group/{groupId}/members/{userId}")
	public ResponseBody<String> removeUsertoGroupById(@PathVariable("groupId") String groupId,
			@PathVariable("userId") String userId) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.removeUserToGroup(groupId, userId));
	}
	
	@DeleteMapping("/group/{groupId}/apps")
	public ResponseBody<List<ApplicationResponse>> listAssignedApplicationToGroup(@PathVariable("groupId") String groupId) {
		return new ResponseBody<>(SUCCESS_CODE, SUCCESS, groupService.listAssignedApplicationToGroup(groupId));
	}

}
