package com.madan.jersey.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * @author Madan
 *
 */
public class MyJerseyException extends WebApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8298554528918855347L;

	public MyJerseyException(Exception ex) {
		super(Response.status(Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).type(MediaType.APPLICATION_JSON)
				.build());
	}

	public MyJerseyException(String message) {
		super(Response.status(Status.INTERNAL_SERVER_ERROR).entity(message).type(MediaType.APPLICATION_JSON).build());
	}

	public MyJerseyException(ErrorMessage errorMessage, Status status) {
		super(Response.status(status).entity(errorMessage).type(MediaType.APPLICATION_JSON).build());
	}

}
