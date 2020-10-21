package com.niji.nombres;

import java.util.Arrays;

public class MinMax {
	
	 public static int[] minMax(int[] arr) {
	        int []  retour = new int[2]; ;
	        
	        retour[0] = Arrays.stream(arr).min().getAsInt();
	        retour[1] =Arrays.stream(arr).max().getAsInt();

	        return retour;
	    }

}
