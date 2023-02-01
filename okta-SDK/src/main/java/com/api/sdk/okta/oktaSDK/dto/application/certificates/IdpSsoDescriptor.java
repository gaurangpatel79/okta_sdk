package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import lombok.Data;

@Data
@Root(name = "md:IDPSSODescriptor", strict = false)
public class IdpSsoDescriptor {

	@Attribute(name = "WantAuthnRequestsSigned")
	private Boolean wantAuthnRequestsSigned;

	@Attribute(name = "protocolSupportEnumeration")
	private String protocolSupportEnumeration;

	@Element(name = "KeyDescriptor")
	private KeyDescriptor keyDescriptor;

	@ElementList(entry="NameIDFormat", name = "NameIDFormat", inline = true, required = false)
	private List<String> nameIdFormatList;

	@ElementList(entry="SingleSignOnService", name = "SingleSignOnService", inline = true, required = false)
	private List<SingleSignOnService> singleSignOnServiceList;

}
