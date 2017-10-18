package com.zhumojun.learning.tomcat.springjersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/xmlbasedconfig")
public class SpringJerseyServiceResource {
	@GET
	@Produces("application/json")
	public String getWelcomString() {
		System.out.println("entering Jersey resource");
		return TestBeanHandler.getTestBean().getBeanName();
	}
}
