package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import lombok.Data;

@Data
@Root(name = "md:EntityDescriptor")
public class SamlMetadata {
	
	@Attribute(name = "entityID")
	private String entityId;
	
	//@Attribute(name = "xmlns:md")
	private String xmlns;
	
	@Element(name = "IDPSSODescriptor")
	private IdpSsoDescriptor  idpSsoDescriptor;

}
