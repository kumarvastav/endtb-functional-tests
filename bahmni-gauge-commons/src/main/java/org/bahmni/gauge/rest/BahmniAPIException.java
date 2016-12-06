package org.bahmni.gauge.rest;

public class BahmniAPIException extends RuntimeException{

	public BahmniAPIException(String message) {
		super(message);
	}

	public BahmniAPIException(Throwable cause) {
		super(cause);
	}
}
