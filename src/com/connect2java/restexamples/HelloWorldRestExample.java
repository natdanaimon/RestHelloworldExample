package com.connect2java.restexamples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldRestExample {
	@GET
	@Produces(MediaType.TEXT_PLAIN)     
 	public Response sayHello() {
 		 
		String str = "Hi Welcome To Restful Webservices Tutorials ";
 
		return Response.status(200).entity(str).build();
 
	}
}