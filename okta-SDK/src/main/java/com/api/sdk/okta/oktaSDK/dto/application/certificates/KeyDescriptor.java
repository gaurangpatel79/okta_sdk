package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import lombok.Data;
@Data
public class KeyDescriptor {
	
	@Attribute(name = "use")
	private String use;
	
	@Element(name = "KeyInfo")
	private KeyInfo keyInfo;

}
