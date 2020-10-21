package com.niji.string;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pangram {

	public static boolean check(String sentence){
	   
		 final Set set = new HashSet();
		
		if(sentence.isEmpty())
			return false;
		else {
		String chaine = Stream.of(sentence.toLowerCase().split("[^a-zA-Z]"))
				.collect(Collectors.joining());
		
		char[] chars = chaine.toCharArray();
		
	for(char c : chars)  {
		set.add(c);
	}
	
	System.out.println(set.size());
    if(set.size() == 26)
       return true;
    else
        return false;		
		}
		
	
		
	  }
}
