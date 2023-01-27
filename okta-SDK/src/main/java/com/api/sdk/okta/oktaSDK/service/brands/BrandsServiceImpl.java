package com.api.sdk.okta.oktaSDK.service.brands;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.brands.BrandThemes;
import com.api.sdk.okta.oktaSDK.dto.brands.BrandsLogoResponse;
import com.api.sdk.okta.oktaSDK.dto.brands.BrandsRequest;
import com.api.sdk.okta.oktaSDK.dto.brands.BrandsResponse;
import com.api.sdk.okta.oktaSDK.dto.brands.EmailCustomizations;
import com.api.sdk.okta.oktaSDK.dto.brands.EmailDefaultContent;
import com.api.sdk.okta.oktaSDK.dto.brands.EmailTemplates;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;

public class BrandsServiceImpl implements BrandsService {

	final BrandsOkta oktaService;

	public BrandsServiceImpl() {
		oktaService = ServiceFactory.createService(BrandsOkta.class);
	}

	@Override
	public List<BrandsResponse> getAllBrands() {
		try {
			Call<List<BrandsResponse>> call = oktaService.getAllBrands();
			Response<List<BrandsResponse>> response = call.execute();

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
	public BrandsResponse getBrandsById(String brandId) {
		try {
			Call<BrandsResponse> call = oktaService.getBrands(brandId);
			Response<BrandsResponse> response = call.execute();

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
	public BrandsResponse updateBrandsById(String brandId, BrandsRequest brandsRequest) {
		try {
			Call<BrandsResponse> call = oktaService.updateBrands(brandId, brandsRequest);
			Response<BrandsResponse> response = call.execute();

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
	public List<BrandThemes> getAllTheamesByBrandId(String brandId) {
		try {
			Call<List<BrandThemes>> call = oktaService.getAllTheames(brandId);
			Response<List<BrandThemes>> response = call.execute();

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
	public BrandThemes getTheamesByBrandId(String brandId, String themeId) {
		try {
			Call<BrandThemes> call = oktaService.getTheames(brandId, themeId);
			Response<BrandThemes> response = call.execute();

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
	public BrandThemes updateTheamesByBrandId(String brandId, String themeId, BrandThemes brandThemes) {
		try {
			Call<BrandThemes> call = oktaService.updateTheames(brandId, themeId, brandThemes);
			Response<BrandThemes> response = call.execute();

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
	public BrandsLogoResponse uploadTheamesLogoByBrandId(String brandId, String themeId, String filePath) {
		try {
			File file = new File(filePath);
			RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), file);
			MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestBody);

			Call<BrandsLogoResponse> call = oktaService.updateTheamesLogo(brandId, themeId, body);
			Response<BrandsLogoResponse> response = call.execute();

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
	public String deleteTheamesLogoByBrandId(String brandId, String themeId) {
		try {
			Call<Void> call = oktaService.deleteTheamesLogo(brandId, themeId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Logo deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public BrandsLogoResponse uploadTheamesBackgroundImageByBrandId(String brandId, String themeId, String filePath) {
		try {
			File file = new File(filePath);
			RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), file);
			MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestBody);

			Call<BrandsLogoResponse> call = oktaService.updateTheamesBackgroundImage(brandId, themeId, body);
			Response<BrandsLogoResponse> response = call.execute();

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
	public String deleteTheamesBackgroundImageByBrandId(String brandId, String themeId) {
		try {
			Call<Void> call = oktaService.deleteTheamesBackgroundImage(brandId, themeId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Background Image deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public BrandsLogoResponse uploadTheamesFaviconByBrandId(String brandId, String themeId, String filePath) {
		try {
			File file = new File(filePath);
			RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), file);
			MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestBody);

			Call<BrandsLogoResponse> call = oktaService.updateTheamesFavicon(brandId, themeId, body);
			Response<BrandsLogoResponse> response = call.execute();

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
	public String deleteTheamesFaviconByBrandId(String brandId, String themeId) {
		try {
			Call<Void> call = oktaService.deleteTheamesFavicon(brandId, themeId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Favicon deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<EmailTemplates> getEmailTemplatesByBrandId(String brandId) {
		try {
			Call<List<EmailTemplates>> call = oktaService.getEmailTemplates(brandId);
			Response<List<EmailTemplates>> response = call.execute();

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
	public EmailTemplates getEmailTemplatesByBrandIdAndTemplateName(String brandId, String templateName) {
		try {
			Call<EmailTemplates> call = oktaService.getEmailTemplatesByBrandIdAndTemplateName(brandId, templateName);
			Response<EmailTemplates> response = call.execute();

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
	public EmailDefaultContent getEmailTemplatesDefaultContentByBrandId(String brandId, String templateName) {
		try {
			Call<EmailDefaultContent> call = oktaService.getEmailTemplatesDefaultContent(brandId, templateName);
			Response<EmailDefaultContent> response = call.execute();

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
	public EmailDefaultContent getEmailTemplatesDefaultContentPreviewByBrandId(String brandId, String templateName) {
		try {
			Call<EmailDefaultContent> call = oktaService.getEmailTemplatesDefaultContentPreview(brandId, templateName);
			Response<EmailDefaultContent> response = call.execute();

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
	public String sendTestEmail(String brandId, String templateName, String language) {
		try {
			Call<Void> call = oktaService.sendTestEmail(brandId, templateName, language);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Test Mail Send";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<EmailCustomizations> getAllEmailTemplatesCustomization(String brandId, String templateName) {
		try {
			Call<List<EmailCustomizations>> call = oktaService.getAllEmailTemplatesCustomization(brandId, templateName);
			Response<List<EmailCustomizations>> response = call.execute();

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
	public EmailCustomizations creatEmailTemplatesCustomization(String brandId, String templateName,
			EmailCustomizations customizations) {
		try {
			Call<EmailCustomizations> call = oktaService.creatEmailTemplatesCustomization(brandId, templateName,
					customizations);
			Response<EmailCustomizations> response = call.execute();

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
	public String deleteAllEmailTemplatesCustomization(String brandId, String templateName) {
		try {
			Call<Void> call = oktaService.deleteAllEmailTemplatesCustomization(brandId, templateName);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Delete All Email Templates Successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public EmailCustomizations getEmailTemplatesCustomization(String brandId, String templateName,
			String customizationId) {
		try {
			Call<EmailCustomizations> call = oktaService.getEmailTemplatesCustomization(brandId, templateName,
					customizationId);
			Response<EmailCustomizations> response = call.execute();

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
	public EmailCustomizations updateEmailTemplatesCustomization(String brandId, String templateName,
			String customizationId, EmailCustomizations emailCustomizations) {
		try {
			Call<EmailCustomizations> call = oktaService.updateEmailTemplatesCustomization(brandId, templateName,
					customizationId, emailCustomizations);
			Response<EmailCustomizations> response = call.execute();

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
	public EmailCustomizations deleteEmailTemplatesCustomization(String brandId, String templateName,
			String customizationId) {
		try {
			Call<EmailCustomizations> call = oktaService.deleteEmailTemplatesCustomization(brandId, templateName,
					customizationId);
			Response<EmailCustomizations> response = call.execute();

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
	public EmailCustomizations getPreviewOfEmailTemplatesCustomization(String brandId, String templateName,
			String customizationId) {
		try {
			Call<EmailCustomizations> call = oktaService.getPreviewOfEmailTemplatesCustomization(brandId, templateName,
					customizationId);
			Response<EmailCustomizations> response = call.execute();

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

}
