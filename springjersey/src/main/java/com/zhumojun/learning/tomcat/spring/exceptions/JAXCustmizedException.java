package com.zhumojun.learning.tomcat.spring.exceptions;

import javax.ws.rs.WebApplicationException;

public class JAXCustmizedException extends WebApplicationException {

	/**
	 * default serialversionUID
	 */
	private static final long serialVersionUID = 1L;
	
	public JAXCustmizedException(final int status) {
		super(status);
	}
	
}
