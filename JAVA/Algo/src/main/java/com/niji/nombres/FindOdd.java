package com.niji.nombres;

public class FindOdd {

	public static int findIt(int[] a) {
		
		int somme=0;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				if(a[j]==a[i]) {
					somme++;
				}

			}
			if (somme%2!=0) {
				return a[i];
			}
		}
		
		
	  	return -1;
	  }
}
