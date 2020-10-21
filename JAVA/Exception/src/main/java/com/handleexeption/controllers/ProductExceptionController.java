package com.handleexeption.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.handleexeption.domaine.ExceptionResponse;
import com.handleexeption.exceptions.ProductNotfoundException;




@ControllerAdvice
public class ProductExceptionController {

	
	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
	
	
	
	@ExceptionHandler(value = ProductNotfoundException.class)
	public ResponseEntity<Object> productNotfound(ProductNotfoundException exception) {
		LocalDateTime now = LocalDateTime.now();
		ExceptionResponse response = new ExceptionResponse();
		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setErrorMessage(exception.getMessage());
		response.setTimeStamp(now.format(dateTimeFormatter));
		
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
	
	 

}
