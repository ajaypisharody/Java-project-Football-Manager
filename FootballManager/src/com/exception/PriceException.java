package com.exception;

public class PriceException extends Exception{
//exception handler 
	private String msg;

	public PriceException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PriceException [msg=" + msg + "]";
	}
	
}
