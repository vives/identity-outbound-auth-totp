/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authenticator.totp;

/**
 * TOTP Authenticator Constants.
 *
 * @since 2.0.3
 */
public abstract class TOTPAuthenticatorConstants {

	/*
	 * Private Constructor will prevent the instantiation of this class directly.
	 */
	private TOTPAuthenticatorConstants() {
	}

	public static final String AUTHENTICATOR_FRIENDLY_NAME = "totp";
	public static final String AUTHENTICATOR_NAME = "totp";
	public static final String QR_CODE_CLAIM_URL = "http://wso2.org/claims/identity/qrcodeurl";
	public static final String SECRET_KEY_CLAIM_URL = "http://wso2.org/claims/identity/secretkey";
	public static final String ENCODING_CLAIM_URL = "http://wso2.org/claims/identity/encoding";
	public static final String FIRST_NAME_CLAIM_URL = "http://wso2.org/claims/givenname";
	public static final String BASE32 = "Base32";
	public static final String BASE64 = "Base64";
	public static final String APPLICATION_AUTHENTICATION_XML = "application-authentication.xml";
	public static final String NAME = "name";
	public static final String HMAC_ALGORITHM = "HmacSHA1";
	public static final String EMAIL_TEMPLATE_NAME = "totp";
	public static final String TRANSPORT_MAILTO = "mailto";
	public static final String EMAIL_CLAIM_URL = "http://wso2.org/claims/emailaddress";
	public static final String LOGIN_PAGE = "totpauthenticationendpoint/totp.jsp";
	public static final String ERROR_PAGE = "totpauthenticationendpoint/totpError.jsp";
	public static final String TOKEN = "token";
	public static final String SEND_TOKEN = "sendToken";
	public static final String AUTHENTICATION = "authentication";
	public static final String BASIC = "basic";
	public static final String FEDERETOR = "federator";
	public static final String SUPER_TENANT_DOMAIN = "carbon.super";
	public static final String GET_PROPERTY_FROM_IDENTITY_CONFIG = "getPropertiesFromLocal";
	public static final String WINDOW_SIZE = "windowSize";
	public static final String ENABLE_TOTP_IN_AUTHENTICATIONFLOW = "enableTOTPInAuthenticationFlow";
	public static final String TIME_STEP_SIZE = "timeStepSize";
	public static final String ENCODING_METHOD = "encodingMethod";
	public static final String ENABLE_TOTP_REQUEST_PAGE =
			"totpauthenticationendpoint/enableTOTP.jsp";
	public static final String ENABLE_TOTP = "ENABLE_TOTP";
}