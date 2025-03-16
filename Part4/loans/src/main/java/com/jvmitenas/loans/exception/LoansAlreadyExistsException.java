package com.jvmitenas.loans.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class LoansAlreadyExistsException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public LoansAlreadyExistsException(String message){
        super(message);
    }
}
