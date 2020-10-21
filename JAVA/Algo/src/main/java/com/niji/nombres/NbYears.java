package com.niji.nombres;

public class NbYears {

	
	 public static int nbYear(int p0, double percent, int aug, int p) {
	        
	        int retour=0;
	        
	        while(p0<p)
	        {
	        	p0=(int) (p0+(percent*0.01*p0)+aug);
	        	retour ++;
	        }
	        
	        return retour;
	    }
}
