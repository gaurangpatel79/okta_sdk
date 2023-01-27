package com.api.sdk.okta.oktaSDK.dto.brands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandThemes {
	
	private String id;
	private String logo;
	private String favicon;
	private String backgroundImage;
	private String primaryColorHex;
	private String primaryColorContrastHex;
	private String secondaryColorHex;
	private String secondaryColorContrastHex;
	private String signInPageTouchPointVariant;
	private String endUserDashboardTouchPointVariant;
	private String errorPageTouchPointVariant;
	private String emailTemplateTouchPointVariant;
	private String loadingPageTouchPointVariant;
	
	@JsonProperty(value = "_links")
	private BrandsThemesLink links;
}
