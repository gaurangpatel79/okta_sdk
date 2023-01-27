package com.api.sdk.okta.oktaSDK.service.administratorRoles;

import com.api.sdk.okta.oktaSDK.dto.administratorRoles.AddMoreResource;
import com.api.sdk.okta.oktaSDK.dto.administratorRoles.AdministratorRoleBody;
import com.api.sdk.okta.oktaSDK.dto.administratorRoles.AdministratorRoles;
import com.api.sdk.okta.oktaSDK.dto.administratorRoles.Permissions;
import com.api.sdk.okta.oktaSDK.dto.administratorRoles.ResourceResponse;
import com.api.sdk.okta.oktaSDK.dto.administratorRoles.ResourceSetBody;
import com.api.sdk.okta.oktaSDK.dto.administratorRoles.ResourceSetResponse;
import com.api.sdk.okta.oktaSDK.dto.administratorRoles.ResourceSetsResponse;
import com.api.sdk.okta.oktaSDK.dto.administratorRoles.RolePermission;
import com.api.sdk.okta.oktaSDK.dto.administratorRoles.Roles;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AdministratorRolesOkta {
	
	@GET("/api/v1/iam/roles")
	public Call<AdministratorRoles> getAllAdministratorRoles();

	@POST("/api/v1/iam/roles")
	public Call<Roles> createAdministratorRole(@Body AdministratorRoleBody administratorRoleBody);

	@GET("/api/v1/iam/roles/{roleId}")
	public Call<Roles> getAdministratorRoleById(@Path("roleId") String roleId);

	@PUT("/api/v1/iam/roles/{roleId}")
	public Call<Roles> updateAdministratorRole(@Path("roleId") String roleId,@Body AdministratorRoleBody administratorRoleBody);

	@GET("/api/v1/iam/roles/{roleId}/permissions")
	public Call<RolePermission> getAllAdministratorRolePermission(@Path("roleId") String roleId);

	@POST("/api/v1/iam/roles/{roleId}/permissions/{permissionType}")
	public Call<Void> addAdministratorRolePermission(@Path("roleId") String roleId,@Path("permissionType") String permissionType);
	
	@GET("/api/v1/iam/roles/{roleId}/permissions/{permissionType}")
	public Call<Permissions> getAdministratorRolePermission(@Path("roleId") String roleId,@Path("permissionType") String permissionType);

	@DELETE("/api/v1/iam/roles/{roleId}/permissions/{permissionType}")
	public Call<Void> deleteAdministratorRolePermission(@Path("roleId") String roleId,@Path("permissionType") String permissionType);

	@DELETE("/api/v1/iam/roles/{roleId}")
	public Call<Void> deleteAdministratorRole(@Path("roleId") String roleId);
	
	@POST("/api/v1/iam/resource-sets")
	public Call<ResourceSetResponse> createResourceSet(@Body ResourceSetBody resourceSetBody);

	@GET("/api/v1/iam/resource-sets/{resourceSetId}")
	public Call<ResourceSetResponse> getResourceSetById(@Path("resourceSetId") String resourceSetId);

	@GET("/api/v1/iam/resource-sets")
	public Call<ResourceSetsResponse> listResourceSets();
	
	@PUT("/api/v1/iam/resource-sets/{resourceSetId}")
	public Call<ResourceSetResponse> updateResourceSet(@Path("resourceSetId") String resourceSetId,@Body ResourceSetBody resourceSetBody);

	@DELETE("/api/v1/iam/resource-sets/{resourceSetId}")
	public Call<Void> deleteResourceSetById(@Path("resourceSetId") String resourceSetId);
	
	@PATCH("/api/v1/iam/resource-sets/{resourceSetId}/resources")
	public Call<ResourceSetResponse> addMoreResourceById(@Path("resourceSetId") String resourceSetId,@Body AddMoreResource addMoreResource);

	@GET("/api/v1/iam/resource-sets/{resourceSetId}/resources")
	public Call<ResourceResponse> getAllResource(@Path("resourceSetId") String resourceSetId);
	
	@DELETE("/api/v1/iam/resource-sets/{resourceSetId}/resources/{resourceId}")
	public Call<Void> deleteResourceById(@Path("resourceSetId") String resourceSetId,@Path("resourceId") String resourceId);

	
}
