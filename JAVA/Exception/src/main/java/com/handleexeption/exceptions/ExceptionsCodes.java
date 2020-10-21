package com.handleexeption.exceptions;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:codes.properties")
public class ExceptionsCodes {
	
	public static final  String  PRODUITNOTFOUND="produit.error.404" ; 
	

}
