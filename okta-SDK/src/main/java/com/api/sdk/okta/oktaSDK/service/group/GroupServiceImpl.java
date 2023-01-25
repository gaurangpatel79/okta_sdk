package com.api.sdk.okta.oktaSDK.service.group;

import java.io.IOException;
import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.group.CreateGroupRequest;
import com.api.sdk.okta.oktaSDK.dto.group.GroupResponse;
import com.api.sdk.okta.oktaSDK.dto.group.RulesRequest;
import com.api.sdk.okta.oktaSDK.dto.user.User;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class GroupServiceImpl implements GroupService {

	final GroupOkta oktaService;

	public GroupServiceImpl() {
		oktaService = ServiceFactory.createService(GroupOkta.class);
	}

	@Override
	public GroupResponse createGroup(CreateGroupRequest createGroupRequest) {
		try {

			Call<GroupResponse> call = oktaService.createGroup(createGroupRequest);
			Response<GroupResponse> response = call.execute();

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
	public GroupResponse getGroupById(String groupId) {
		try {

			Call<GroupResponse> call = oktaService.getGroupById(groupId);
			Response<GroupResponse> response = call.execute();

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
	public List<GroupResponse> getAllGroups() {
		try {

			Call<List<GroupResponse>> call = oktaService.getAllGroups();
			Response<List<GroupResponse>> response = call.execute();

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
	public List<GroupResponse> searchGroups(String query) {
		try {

			Call<List<GroupResponse>> call = oktaService.searchGroups(query);
			Response<List<GroupResponse>> response = call.execute();

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
	public List<GroupResponse> filterGroups(String filter) {
		try {

			Call<List<GroupResponse>> call = oktaService.filterGroups(filter);
			Response<List<GroupResponse>> response = call.execute();

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
	public GroupResponse updateGroup(String groupId, CreateGroupRequest createGroupRequest) {
		try {

			Call<GroupResponse> call = oktaService.updateGroupById(groupId, createGroupRequest);
			Response<GroupResponse> response = call.execute();

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
	public String deleteGroupById(String groupId) {
		try {

			Call<Void> call = oktaService.deleteGroupById(groupId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
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

			Call<List<User>> call = oktaService.listGroupMembers(groupId);
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
	public String assignUserToGroup(String groupId, String userId) {
		try {

			Call<Void> call = oktaService.addUserToGroupById(groupId, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
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

			Call<Void> call = oktaService.removeUserToGroupById(groupId, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
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

			Call<List<ApplicationResponse>> call = oktaService.listAssignedApplicationToGroup(groupId);
			Response<List<ApplicationResponse>> response = call.execute();

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
	public RulesRequest addRuleWithGroup(RulesRequest rulesRequest) {
		try {

			Call<RulesRequest> call = oktaService.addRuleToGroup(rulesRequest);
			Response<RulesRequest> response = call.execute();

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
	public RulesRequest updateRuleWithGroup(String ruleId, RulesRequest rulesRequest) {
		try {

			Call<RulesRequest> call = oktaService.updateRuleToGroup(ruleId, rulesRequest);
			Response<RulesRequest> response = call.execute();

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
	public RulesRequest getRuleById(String ruleId) {
		try {

			Call<RulesRequest> call = oktaService.getRulebyId(ruleId);
			Response<RulesRequest> response = call.execute();

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
	public List<RulesRequest> getAllRule(int limit) {
		try {

			Call<List<RulesRequest>> call = oktaService.getAllRule(limit, "groupIdToGroupNameMap");
			Response<List<RulesRequest>> response = call.execute();

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
	public List<RulesRequest> searchRule(String query) {
		try {

			Call<List<RulesRequest>> call = oktaService.searchRule(query);
			Response<List<RulesRequest>> response = call.execute();

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
	public List<RulesRequest> getRuleWithAfter(String ruleId) {
		try {

			Call<List<RulesRequest>> call = oktaService.getRuleWithAfter(ruleId);
			Response<List<RulesRequest>> response = call.execute();

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
	public String deleteRulebyId(String ruleId) {
		try {

			Call<Void> call = oktaService.deleteRulebyId(ruleId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Rule Successfully Removed.";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deleteRuleAndRemoveUsersbyId(String ruleId, boolean isRemoveUsers) {
		try {

			Call<Void> call = oktaService.deleteRuleAndRemoveUsersbyId(ruleId, isRemoveUsers);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Rule Successfully Removed.";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deactivateRulebyId(String ruleId) {
		try {

			Call<Void> call = oktaService.deactivateRulebyId(ruleId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Rule Deactivated Successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String activateRulebyId(String ruleId) {
		try {

			Call<Void> call = oktaService.activateRulebyId(ruleId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Rule Activated Successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
