package com.niji.string;

import java.util.stream.Stream;

public class SplitString {
	
	public static String[] solution(String s) {
 
		if(s.length()%2!=0) {
			s+="_";
		}
		String[] retour = Stream.of(s.split("(?<=\\G.{2})")).toArray(String[]::new);

		for (String l : retour) {
            System.out.println(l +"\n");
        }
		return retour;
    }

}
