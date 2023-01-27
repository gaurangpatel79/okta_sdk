package com.api.sdk.okta.oktaSDK.service.customTemplate;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.customTemplate.CustomTemplateResponse;

public interface CustomTemplateService {

	public List<CustomTemplateResponse> getAllSMSTemplate();

	public List<CustomTemplateResponse> getSMSTemplateByType(String templateType);

	public CustomTemplateResponse createSMSTemplate(CustomTemplateResponse customTemplate);

	public CustomTemplateResponse updateSMSTemplate(String templateId, CustomTemplateResponse customTemplate);

	public CustomTemplateResponse partialUpdateSMSTemplate(String templateId, CustomTemplateResponse customTemplate);

	public CustomTemplateResponse getSMSTemplateById(String templateId);

	public String deleteSMSTemplateById(String templateId);

}
