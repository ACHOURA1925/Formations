package com.niji.arbre;

public class Noeud {
	
	int valeur;
	Noeud gauche;
	Noeud droite;
	

	
	public Noeud() {
		super();
		
	}



	public Noeud(int valeur) {
		super();
		this.valeur = valeur;
	}



	public int getValeur() {
		return valeur;
	}



	public void setValeur(int valeur) {
		this.valeur = valeur;
	}



	public Noeud getGauche() {
		return gauche;
	}



	public void setGauche(Noeud gauche) {
		this.gauche = gauche;
	}



	public Noeud getDroite() {
		return droite;
	}



	public void setDroite(Noeud droite) {
		this.droite = droite;
	}
	


}
