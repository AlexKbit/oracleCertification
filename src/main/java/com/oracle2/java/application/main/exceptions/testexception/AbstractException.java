package com.oracle2.java.application.main.exceptions.testexception;

public abstract class AbstractException extends Exception {

	private static final long serialVersionUID = -8513734936470043013L;
	
	public String message;
	
	public AbstractException(String msg) {
		this.message = msg;
	}
	
	public String getMessage() {
		return message;
	}
}
