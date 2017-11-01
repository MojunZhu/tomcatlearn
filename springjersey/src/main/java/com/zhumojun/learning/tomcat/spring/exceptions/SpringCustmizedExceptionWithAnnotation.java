package com.zhumojun.learning.tomcat.spring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "COnflict with spring YO")
public class SpringCustmizedExceptionWithAnnotation extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
