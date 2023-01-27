package com.api.sdk.okta.oktaSDK.service.customTemplate;

import java.io.IOException;
import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.customTemplate.CustomTemplateResponse;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class CustomTemplateServiceImpl implements CustomTemplateService {

	final CustomTemplateOkta oktaService;

	public CustomTemplateServiceImpl() {
		oktaService = ServiceFactory.createService(CustomTemplateOkta.class);
	}

	@Override
	public List<CustomTemplateResponse> getAllSMSTemplate() {
		try {
			Call<List<CustomTemplateResponse>> call = oktaService.getAllSMSTemplate();
			Response<List<CustomTemplateResponse>> response = call.execute();

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
	public List<CustomTemplateResponse> getSMSTemplateByType(String templateType) {
		try {
			Call<List<CustomTemplateResponse>> call = oktaService.getSMSTemplateByType(templateType);
			Response<List<CustomTemplateResponse>> response = call.execute();

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
	public CustomTemplateResponse createSMSTemplate(CustomTemplateResponse customTemplate) {
		try {
			Call<CustomTemplateResponse> call = oktaService.createSMSTemplate(customTemplate);
			Response<CustomTemplateResponse> response = call.execute();

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
	public CustomTemplateResponse updateSMSTemplate(String templateId, CustomTemplateResponse customTemplate) {
		try {
			Call<CustomTemplateResponse> call = oktaService.updateSMSTemplate(templateId,customTemplate);
			Response<CustomTemplateResponse> response = call.execute();

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
	public CustomTemplateResponse partialUpdateSMSTemplate(String templateId, CustomTemplateResponse customTemplate) {
		try {
			Call<CustomTemplateResponse> call = oktaService.partialUpdateSMSTemplate(templateId,customTemplate);
			Response<CustomTemplateResponse> response = call.execute();

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
	public CustomTemplateResponse getSMSTemplateById(String templateId) {
		try {
			Call<CustomTemplateResponse> call = oktaService.getSMSTemplateById(templateId);
			Response<CustomTemplateResponse> response = call.execute();

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
	public String deleteSMSTemplateById(String templateId) {
		try {
			Call<Void> call = oktaService.deleteSMSTemplateById(templateId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "SMS Template Deleted.";
			}

		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
