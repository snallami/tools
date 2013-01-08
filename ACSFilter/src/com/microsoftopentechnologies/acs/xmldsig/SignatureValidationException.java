/*
 Copyright 2012 Microsoft Open Technologies, Inc.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.microsoftopentechnologies.acs.xmldsig; 

/**
 * To represent any unexpected problem encountered during signature validation.
 */
public class SignatureValidationException extends Exception {
	private static final long serialVersionUID = 2217009100988339540L;

	public SignatureValidationException() {
		super();
	}

	public SignatureValidationException(String message) {
		super(message);
	}

	public SignatureValidationException(String message, Throwable cause) {
		super(message, cause);
	}
}
