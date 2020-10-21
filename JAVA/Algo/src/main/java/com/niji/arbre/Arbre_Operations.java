package com.niji.arbre;

public class Arbre_Operations {

	public static Noeud ajoutRecursif(Noeud actuel, int valeur) {
		if (actuel == null) {
			actuel = new Noeud(valeur);
		}

		if (valeur < actuel.getValeur()) {
			actuel.gauche = ajoutRecursif(actuel.gauche, valeur);
		} else if (valeur > actuel.getValeur()) {
			actuel.droite = ajoutRecursif(actuel.droite, valeur);
		}
		return actuel;
	}

	public static boolean verifierExistence(Noeud actuel, int valeur) {

		boolean existe = false;

		if (actuel == null) {
			return existe;
		}
		if (valeur == actuel.getValeur()) {
			existe = true;
		}
		if (valeur < actuel.getValeur())
			verifierExistence(actuel.getGauche(), valeur);

		if (valeur > actuel.getValeur())
			verifierExistence(actuel.getDroite(), valeur);

		return existe;
	}

	public static int calculHauteur(Noeud racine) {
		int hauteur = 0;
		if (racine == null) {
			return hauteur;
		} else
			hauteur = (1 + Math.max(calculHauteur(racine.getGauche()), calculHauteur(racine.getDroite())));
		return hauteur;
	}

	public static int calculerNoeuds(Noeud noeud) {
		int nombre = 0;

		if (noeud == null) {
			return nombre;
		}

		else if (noeud.getDroite() == null || noeud.getGauche() == null) {
			return nombre;
		}

		else {
			nombre = 1 + calculerNoeuds(noeud.getDroite()) + calculerNoeuds(noeud.getGauche());
		}
		return nombre;
	}

	public static int calculerFeuille(Noeud noeud) {

		int nombre = 0;

		if (noeud == null) {
			return nombre;
		} else if (noeud.getDroite() == null && noeud.getGauche() == null) {
			nombre = 1;
		} else {
			nombre = calculerFeuille(noeud.getDroite()) + calculerFeuille(noeud.getGauche());
		}

		return nombre;
	}
	
	
}
