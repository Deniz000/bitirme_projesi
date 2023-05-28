package com.freeSite.core.results;

public class Result {
	private boolean success;
	private String message;
	
	
	public Result(boolean success) {
		this.success = success;
	}


	public Result(boolean success, String message) {
		this(success); //aynı sınıftaki success içeren yapıcıyı çağırır.
		this.message = message;
	}


	public boolean isSuccess() {
		return success;
	}


	public String getMessage() {
		return message;
	}

	
}
