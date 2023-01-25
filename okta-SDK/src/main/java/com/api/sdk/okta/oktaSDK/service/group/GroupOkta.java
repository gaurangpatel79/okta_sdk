package com.api.sdk.okta.oktaSDK.service.group;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.group.CreateGroupRequest;
import com.api.sdk.okta.oktaSDK.dto.group.GroupResponse;
import com.api.sdk.okta.oktaSDK.dto.group.RulesRequest;
import com.api.sdk.okta.oktaSDK.dto.user.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GroupOkta {

 	
	// Group Apis
	@POST("/api/v1/groups")
	public Call<GroupResponse> createGroup(@Header("Authorization") String authorization, @Body CreateGroupRequest createGroupRequest);

	@GET("/api/v1/groups/{groupId}")
	public Call<GroupResponse> getGroupById(@Header("Authorization") String authorization,@Path("groupId") String groupId);

	@GET("/api/v1/groups")
	public Call<List<GroupResponse>> getAllGroups(@Header("Authorization") String authorization);

	@GET("/api/v1/groups")
	public Call<List<GroupResponse>> searchGroups(@Header("Authorization") String authorization,@Query("q") String query);
	
	@GET("/api/v1/groups")
	public Call<List<GroupResponse>> filterGroups(@Header("Authorization") String authorization,@Query("filter") String filter);
	
	@PUT("/api/v1/groups/{groupId}")
	public Call<GroupResponse> updateGroupById(@Header("Authorization") String authorization,@Path("groupId") String groupId, @Body CreateGroupRequest createGroupRequest);

	@DELETE("/api/v1/groups/{groupId}")
	public Call<Void> deleteGroupById(@Header("Authorization") String authorization,@Path("groupId") String groupId);
	
	@GET("/api/v1/groups/{groupId}/users")
	public Call<List<User>> listGroupMembers(@Header("Authorization") String authorization,@Path("groupId") String groupId);

	@PUT("/api/v1/groups/{groupId}/users/{userId}")
	public Call<Void> addUserToGroupById(@Header("Authorization") String authorization,@Path("groupId") String groupId,@Path("userId") String userId);

	@DELETE("/api/v1/groups/{groupId}/users/{userId}")
	public Call<Void> removeUserToGroupById(@Header("Authorization") String authorization,@Path("groupId") String groupId,@Path("userId") String userId);
	
	@GET("/api/v1/groups/{groupId}/apps")
	public Call<List<ApplicationResponse>> listAssignedApplicationToGroup(@Header("Authorization") String authorization,@Path("groupId") String groupId);

	@POST("/api/v1/groups/rules")
	public Call<RulesRequest> addRuleToGroup(@Header("Authorization") String authorization,@Body RulesRequest rulesRequest);

	@PUT("/api/v1/groups/rules/{ruleId}")
	public Call<RulesRequest> updateRuleToGroup(@Header("Authorization") String authorization,@Path("ruleId") String ruleId,@Body RulesRequest rulesRequest);

	@GET("/api/v1/groups/rules/{id}?expand=groupIdToGroupNameMap")
	public Call<RulesRequest> getRulebyId(@Header("Authorization") String authorization,@Path("ruleId") String ruleId);

	@GET("/api/v1/groups/rules")
	public Call<List<RulesRequest>> getAllRule(@Header("Authorization") String authorization,@Query("limit") int limit,@Query("expand") String expand);

	@GET("/api/v1/groups/rules")
	public Call<List<RulesRequest>> searchRule(@Header("Authorization") String authorization,@Query("search") String search);

	@GET("/api/v1/groups/rules")
	public Call<List<RulesRequest>> getRuleWithAfter(@Header("Authorization") String authorization,@Query("after") String after);

	@DELETE("/api/v1/groups/rules/{id}")
	public Call<Void> deleteRulebyId(@Header("Authorization") String authorization,@Path("ruleId") String ruleId);

	@DELETE("/api/v1/groups/rules/{id}")
	public Call<Void> deleteRuleAndRemoveUsersbyId(@Header("Authorization") String authorization,@Path("ruleId") String ruleId,@Query("removeUsers") boolean removeUsers);
	
	@POST("/api/v1/groups/rules/{id}/lifecycle/deactivate")
	public Call<Void> deactivateRulebyId(@Header("Authorization") String authorization,@Path("ruleId") String ruleId);

	@POST("/api/v1/groups/rules/{id}/lifecycle/activate")
	public Call<Void> activateRulebyId(@Header("Authorization") String authorization,@Path("ruleId") String ruleId);
	 
}

