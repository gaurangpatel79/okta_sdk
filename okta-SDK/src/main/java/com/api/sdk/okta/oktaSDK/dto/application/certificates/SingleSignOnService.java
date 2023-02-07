package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import lombok.Data;

@Data
@Root(name = "md:SingleSignOnService", strict = false)
public class SingleSignOnService {

	@Attribute(name = "Binding")
	private String binding;

	@Attribute(name = "Location")
	private String location;

}
