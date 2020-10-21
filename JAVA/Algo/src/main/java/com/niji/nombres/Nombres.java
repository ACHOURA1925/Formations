package com.niji.nombres;

public class Nombres {
	
	  public static boolean isSquare(int n) {  
	      
	      if(n>=0 && Math.pow(Math.sqrt(n), 2)==n)
	        return true; 
	      else 
	    	  return false;// fix me!
	    }
	  
	  
	  public static  int GetSum(int a, int b) {
	      int sum = 0;      
	      
	      if(a < b)
	        while(a <= b) { 
	        	sum += a; 
	        	a++; }
	      else if(a > b)
	        while(b <= a) { 
	        	sum += b; 
	        	b++; }
	      else
	        return a;
	        
	      return sum;
	    }
}
