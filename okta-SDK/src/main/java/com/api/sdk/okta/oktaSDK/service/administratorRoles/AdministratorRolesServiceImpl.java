package com.api.sdk.okta.oktaSDK.service.administratorRoles;

import java.io.IOException;

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
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class AdministratorRolesServiceImpl implements AdministratorRolesService {

	final AdministratorRolesOkta oktaService;

	public AdministratorRolesServiceImpl() {
		oktaService = ServiceFactory.createService(AdministratorRolesOkta.class);
	}

	@Override
	public AdministratorRoles getAllAdministratorRoles() {
		try {
			Call<AdministratorRoles> call = oktaService.getAllAdministratorRoles();
			Response<AdministratorRoles> response = call.execute();

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
	public Roles createAdministratorRole(AdministratorRoleBody administratorRoleBody) {
		try {
			Call<Roles> call = oktaService.createAdministratorRole(administratorRoleBody);
			Response<Roles> response = call.execute();

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
	public Roles getAdministratorRoleById(String roleId) {
		try {
			Call<Roles> call = oktaService.getAdministratorRoleById(roleId);
			Response<Roles> response = call.execute();

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
	public Roles updateAdministratorRole(String roleId, AdministratorRoleBody administratorRoleBody) {
		try {
			Call<Roles> call = oktaService.updateAdministratorRole(roleId, administratorRoleBody);
			Response<Roles> response = call.execute();

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
	public RolePermission getAllAdministratorRolePermission(String roleId) {
		try {
			Call<RolePermission> call = oktaService.getAllAdministratorRolePermission(roleId);
			Response<RolePermission> response = call.execute();

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
	public String addAdministratorRolePermission(String roleId, String permissionType) {
		try {
			Call<Void> call = oktaService.addAdministratorRolePermission(roleId, permissionType);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Permission is Set to Role";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public Permissions getAdministratorRolePermission(String roleId, String permissionType) {
		try {
			Call<Permissions> call = oktaService.getAdministratorRolePermission(roleId, permissionType);
			Response<Permissions> response = call.execute();

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
	public String deleteAdministratorRolePermission(String roleId, String permissionType) {
		try {
			Call<Void> call = oktaService.deleteAdministratorRolePermission(roleId, permissionType);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Permission Deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deleteAdministratorRole(String roleId) {
		try {
			Call<Void> call = oktaService.deleteAdministratorRole(roleId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Role Deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ResourceSetResponse createResourceSet(ResourceSetBody resourceSetBody) {
		try {
			Call<ResourceSetResponse> call = oktaService.createResourceSet(resourceSetBody);
			Response<ResourceSetResponse> response = call.execute();

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
	public ResourceSetResponse getResourceSetById(String resourceSetId) {
		try {
			Call<ResourceSetResponse> call = oktaService.getResourceSetById(resourceSetId);
			Response<ResourceSetResponse> response = call.execute();

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
	public ResourceSetsResponse listResourceSets() {
		try {
			Call<ResourceSetsResponse> call = oktaService.listResourceSets();
			Response<ResourceSetsResponse> response = call.execute();

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
	public ResourceSetResponse updateResourceSet(String resourceSetId, ResourceSetBody resourceSetBody) {
		try {
			Call<ResourceSetResponse> call = oktaService.updateResourceSet(resourceSetId, resourceSetBody);
			Response<ResourceSetResponse> response = call.execute();

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
	public String deleteResourceSetById(String resourceSetId) {
		try {
			Call<Void> call = oktaService.deleteResourceSetById(resourceSetId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Resource Set Deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public ResourceSetResponse addMoreResourceById(String resourceSetId, AddMoreResource addMoreResource) {
		try {
			Call<ResourceSetResponse> call = oktaService.addMoreResourceById(resourceSetId, addMoreResource);
			Response<ResourceSetResponse> response = call.execute();

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
	public ResourceResponse getAllResource(String resourceSetId) {
		try {
			Call<ResourceResponse> call = oktaService.getAllResource(resourceSetId);
			Response<ResourceResponse> response = call.execute();

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
	public String deleteResourceById(String resourceSetId, String resourceId) {
		try {
			Call<Void> call = oktaService.deleteResourceById(resourceSetId, resourceId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Resource Deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
