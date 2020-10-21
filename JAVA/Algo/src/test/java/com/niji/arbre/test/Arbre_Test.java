package com.niji.arbre.test;



import org.junit.jupiter.api.Test;
import com.niji.arbre.Arbre;
import com.niji.arbre.Arbre_Operations;
import com.niji.arbre.Noeud;





public class Arbre_Test {
	
	Arbre arbre = new Arbre();
	Noeud racine = new Noeud(0);
	
	@Test
	public void testCreation() {

		arbre.setRacine(racine);	
		racine=Arbre_Operations.ajoutRecursif(racine, 1);
		assertEquals(racine.getValeur(), 0);
		assertEquals(racine.getDroite().getValeur(), 1);
		
	}
	
	@Test
	public void testHauteur() {
		arbre.setRacine(racine);
		racine=Arbre_Operations.ajoutRecursif(racine, 1);
		assertEquals(Arbre_Operations.calculHauteur(racine), 2);
		
	}

}
