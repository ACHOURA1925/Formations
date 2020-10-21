package com.niji.nombres;

import java.util.Arrays;

public class EXERCICE_2 {

	
	 public  void solution(int n) {  
	     
		 int[] array = new int[100];
		 Arrays.setAll(array, i -> i + 1);
		 
		 Arrays.stream(array).forEach(v->multiple(v));
		 
		 
		 
		 
		 
	    }
	 
	 
	 private void multiple(int number) {
		 
		 if((number)%3==0) {
			 System.out.println("Chausettes"); 
			 
		 }
		 else	
		 if((number)%5==0) {
			 System.out.println("Sales"); 	 
			 
		 }
		 
		 else	
			 if((number)%3==0 && (number)%5==0 ) {
				 System.out.println("ChausettesSales"); 
				 
			 }
		 
			 else {
				 System.out.println(number); 
				 
			 }
				
	 }
}
