package com.api.sdk.okta.oktaSDK.service;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.group.CreateGroupRequest;
import com.api.sdk.okta.oktaSDK.dto.group.GroupResponse;
import com.api.sdk.okta.oktaSDK.dto.group.RulesRequest;
import com.api.sdk.okta.oktaSDK.dto.user.User;

public interface GroupService {

	public GroupResponse createGroup(CreateGroupRequest createGroupRequest);
	
	public GroupResponse getGroupById(String groupId);
	
	public List<GroupResponse> getAllGroups();
	
	public List<GroupResponse> searchGroups(String query);
	
	public List<GroupResponse> filterGroups(String filter);
	
	public GroupResponse updateGroup(String groupId,CreateGroupRequest createGroupRequest);
	
	public String deleteGroupById(String groupId);
	
	public List<User> getAllUserFromGroupById(String groupId);
	
	public String assignUserToGroup(String groupId,String userId);
	
	public String removeUserToGroup(String groupId,String userId);
	
	public List<ApplicationResponse> listAssignedApplicationToGroup(String groupId);
	
	public RulesRequest addRuleWithGroup(RulesRequest rulesRequest);
	
	public RulesRequest updateRuleWithGroup(String ruleId,RulesRequest rulesRequest);
}
