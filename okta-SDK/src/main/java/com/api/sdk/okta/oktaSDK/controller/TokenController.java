package com.api.sdk.okta.oktaSDK.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.sdk.okta.oktaSDK.dto.AccessToken;
import com.api.sdk.okta.oktaSDK.dto.ResponseBody;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.OktaTokenService;

@RestController
public class TokenController {

	private final OktaTokenService oktaTokenService;
	protected final String SUCCESS = "Success";
	protected final int SUCCESS_CODE = 0;
	protected final String FAIL = "Fail";
	protected final int FAIL_CODE = 1;

	@Autowired
	public TokenController(OktaTokenService oktaTokenService) {
		this.oktaTokenService = oktaTokenService;

	}

//	@GetMapping("/login")
//	public ResponseEntity<Void> welcome2User(Principal principal) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setLocation(URI.create(
//				"https://dev-838474.okta.com/oauth2/default/v1/authorize?client_id=0oaoqawgwyvNyRP3c357&response_type=code&scope=openid&redirect_uri=http://localhost:8080/authorization-code/callback&state=state-296bc9a0-a2a2-4a57-be1a-d0e2fd9bb601&nonce=g5ly497e8ps"));
//		return new ResponseEntity<>(headers, HttpStatus.MOVED_PERMANENTLY);
//	}

	@GetMapping("/token/generate")
	public ResponseBody<AccessToken> generateAccessToken(@RequestParam("code") String code) throws IOException, CustomValidationException {
		ResponseBody<AccessToken> responseBody = new ResponseBody<AccessToken>();

		System.out.println(code);
		AccessToken accessToken = oktaTokenService.generateAccessToken(code);

		if (accessToken == null) {
			responseBody.setRes_code(FAIL_CODE);
			responseBody.setRes_message("Access token is not generated");
			responseBody.setRes_object(null);
		}else {
			responseBody.setRes_code(SUCCESS_CODE);
            responseBody.setRes_message(SUCCESS);
            responseBody.setRes_object(accessToken);
		}

		return responseBody;

	}
	
	@GetMapping("/token/refreshToken")
	public ResponseBody<AccessToken> generateAccessTokeFromRefreshToken(@RequestParam("refreshToken") String refreshToken) throws IOException, CustomValidationException {
		ResponseBody<AccessToken> responseBody = new ResponseBody<AccessToken>();

		System.out.println(refreshToken);
		AccessToken accessToken = oktaTokenService.generateAccessToken(refreshToken);

		if (accessToken == null) {
			responseBody.setRes_code(FAIL_CODE);
			responseBody.setRes_message("Access token is not generated");
			responseBody.setRes_object(null);
		}else {
			responseBody.setRes_code(SUCCESS_CODE);
            responseBody.setRes_message(SUCCESS);
            responseBody.setRes_object(accessToken);
		}

		return responseBody;
	}
}
