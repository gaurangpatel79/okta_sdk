package com.api.sdk.okta.oktaSDK.service.brands;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.brands.BrandThemes;
import com.api.sdk.okta.oktaSDK.dto.brands.BrandsLogoResponse;
import com.api.sdk.okta.oktaSDK.dto.brands.BrandsRequest;
import com.api.sdk.okta.oktaSDK.dto.brands.BrandsResponse;
import com.api.sdk.okta.oktaSDK.dto.brands.EmailCustomizations;
import com.api.sdk.okta.oktaSDK.dto.brands.EmailDefaultContent;
import com.api.sdk.okta.oktaSDK.dto.brands.EmailTemplates;

public interface BrandsService {

	public List<BrandsResponse> getAllBrands();

	public BrandsResponse getBrandsById(String brandId);

	public BrandsResponse updateBrandsById(String brandId, BrandsRequest brandsRequest);

	public List<BrandThemes> getAllTheamesByBrandId(String brandId);

	public BrandThemes getTheamesByBrandId(String brandId, String themeId);

	public BrandThemes updateTheamesByBrandId(String brandId, String themeId, BrandThemes brandThemes);

	public BrandsLogoResponse uploadTheamesLogoByBrandId(String brandId, String themeId, String filePath);

	public String deleteTheamesLogoByBrandId(String brandId, String themeId);

	public BrandsLogoResponse uploadTheamesBackgroundImageByBrandId(String brandId, String themeId, String filePath);

	public String deleteTheamesBackgroundImageByBrandId(String brandId, String themeId);

	public BrandsLogoResponse uploadTheamesFaviconByBrandId(String brandId, String themeId, String filePath);

	public String deleteTheamesFaviconByBrandId(String brandId, String themeId);

	public List<EmailTemplates> getEmailTemplatesByBrandId(String brandId);

	public EmailTemplates getEmailTemplatesByBrandIdAndTemplateName(String brandId, String templateName);

	public EmailDefaultContent getEmailTemplatesDefaultContentByBrandId(String brandId, String templateName);

	public EmailDefaultContent getEmailTemplatesDefaultContentPreviewByBrandId(String brandId, String templateName);

	public String sendTestEmail(String brandId, String templateName, String language);

	public List<EmailCustomizations> getAllEmailTemplatesCustomization(String brandId, String templateName);

	public EmailCustomizations creatEmailTemplatesCustomization(String brandId, String templateName,
			EmailCustomizations customizations);

	public String deleteAllEmailTemplatesCustomization(String brandId, String templateName);

	public EmailCustomizations getEmailTemplatesCustomization(String brandId, String templateName,
			String customizationId);

	public EmailCustomizations updateEmailTemplatesCustomization(String brandId, String templateName,
			String customizationId, EmailCustomizations emailCustomizations);

	public EmailCustomizations deleteEmailTemplatesCustomization(String brandId, String templateName,
			String customizationId);

	public EmailCustomizations getPreviewOfEmailTemplatesCustomization(String brandId, String templateName,
			String customizationId);

}
