package com.madan.jersey.exceptions;

/**
 * @author Madan
 *
 */
public class ErrorMessage {
	private int statusCode;
	private String statusDescription;
	private String errorMessage;

	public ErrorMessage() {
	}

	public ErrorMessage(int statusCode, String statusDescription, String errorMessage) {
		super();
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
		this.errorMessage = errorMessage;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
