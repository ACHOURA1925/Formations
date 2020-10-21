package com.niji.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chaines {
	
	public static String toCamelCase(String s){
		
		
		String camel = Stream.of(s.split("[^a-zA-Z0-9]"))
				.map(v -> v.substring(0, 1).toUpperCase() + v.substring(1).toLowerCase())
				.collect(Collectors.joining());
		
		System.out.println(camel);

	    return camel;
	  }

}
