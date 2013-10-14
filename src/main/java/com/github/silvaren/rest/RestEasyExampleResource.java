package com.github.silvaren.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Path("/")
@Component
public class RestEasyExampleResource {

	@Path("/annotated-bean")
	@GET
	public Response getAnnotatedBeanClass() throws InterruptedException {

		Object myConfig = Injector.getApplicationContext().getBean(SpringBean.class);

		return Response.ok().entity(myConfig.getClass().toString()).build();
	}
}
