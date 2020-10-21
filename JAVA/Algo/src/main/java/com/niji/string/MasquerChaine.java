package com.niji.string;

public class MasquerChaine {
	
	 public static String maskify(String str) {

	        int i = 0;
	        char replace='#';
	        char[] table=str.toCharArray();
	        
	        while(i<table.length-4) {
	        	table[i]=replace;
	        	i++;
	        }
	        
	        str=new String(table);
	        System.out.println(str);
	     
	        return str;
	      
	      
	    }

}
