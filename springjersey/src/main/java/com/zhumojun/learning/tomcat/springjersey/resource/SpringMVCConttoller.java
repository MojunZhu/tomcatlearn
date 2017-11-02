package com.zhumojun.learning.tomcat.springjersey.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhumojun.learning.tomcat.classez.TestUser;
import com.zhumojun.learning.tomcat.spring.exceptions.JAXCustmizedException;
import com.zhumojun.learning.tomcat.spring.exceptions.SpringCustmizedExceptionWithAnnotation;

@Controller
@RequestMapping("/hello")
public class SpringMVCConttoller {
	
	@RequestMapping(value="/test/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody TestUser printHello() {
		TestUser testUser = new TestUser();
		testUser.setAge(1);
		testUser.setName("wer");
		
		return testUser;
	}
	
	/**
	 * Show case for implement Exceptions and handle yourself. By this way
	 * Tomcat will show message and error code on the response but tomcat itself will
	 * also throw exceptions internally. If going this way, better do log.
	 */
	@RequestMapping(value="/exceptionTomcat/", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public void throwExceptionOne() {
		throw new JAXCustmizedException(500);
	}
	
	/**
	 * Show case for spring exception handling. You can define exception status in the exception you defined with status and status
	 */
	@RequestMapping(value="/exceptionTomcatTwo/", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public void throwExceptionTwo() {
		throw new SpringCustmizedExceptionWithAnnotation();
	}
}
