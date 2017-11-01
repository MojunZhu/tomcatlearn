package com.zhumojun.learning.tomcat.springjersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zhumojun.learning.tomcat.classez.TestUser;

@Path("/xmlbasedconfig")
public class SpringJerseyServiceResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public TestUser getWelcomString() {
		System.out.println("entering Jersey resource");
		TestUser users = new TestUser();
		users.setAge(0);
		users.setName("123");
		return users;
	}
}
