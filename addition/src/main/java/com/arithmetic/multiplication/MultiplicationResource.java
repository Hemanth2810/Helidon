package com.arithmetic.multiplication;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/multiply")
public class MultiplicationResource {
	@Inject
	private MultiplicationBLogic blogic;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Multiplication processAddition(Multiplication request) {
		Multiplication response = new Multiplication();
		response.setNum1(request.getNum1());
		response.setNum2(request.getNum2());
		response.setResult(blogic.execute(request.getNum1(), request.getNum2()));
		return response;
	}
}
