package com.niji.nombres;

public class SommeDesMultiples {

	public int solution(int number) {
		
		return multiples(number, 3)+multiples(number, 5) ;
	}

	private int multiples(int number, int quaution) {
		int somme = 0;
		
		int i=1;
		while((quaution*i) <number) {
			if((quaution*i)%quaution==0)
			somme+=quaution*i;
			i++;
		}
		return somme;
	}
}
