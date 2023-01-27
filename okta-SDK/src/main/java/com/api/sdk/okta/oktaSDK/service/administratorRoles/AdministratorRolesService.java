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

public interface AdministratorRolesService {

	public AdministratorRoles getAllAdministratorRoles();

	public Roles createAdministratorRole(AdministratorRoleBody administratorRoleBody);

	public Roles getAdministratorRoleById(String roleId);

	public Roles updateAdministratorRole(String roleId, AdministratorRoleBody administratorRoleBody);

	public RolePermission getAllAdministratorRolePermission(String roleId);

	public String addAdministratorRolePermission(String roleId, String permissionType);

	public Permissions getAdministratorRolePermission(String roleId, String permissionType);

	public String deleteAdministratorRolePermission(String roleId, String permissionType);

	public String deleteAdministratorRole(String roleId);

	public ResourceSetResponse createResourceSet(ResourceSetBody resourceSetBody);

	public ResourceSetResponse getResourceSetById(String resourceSetId);

	public ResourceSetsResponse listResourceSets();

	public ResourceSetResponse updateResourceSet(String resourceSetId, ResourceSetBody resourceSetBody);

	public String deleteResourceSetById(String resourceSetId);

	public ResourceSetResponse addMoreResourceById(String resourceSetId, AddMoreResource addMoreResource);

	public ResourceResponse getAllResource(String resourceSetId);

	public String deleteResourceById(String resourceSetId, String resourceId);

}
