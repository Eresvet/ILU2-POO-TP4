package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	private Gaulois chasseur;
	private String nom = "sanglier";

	public String getNom() {
		return "sanglier";
	}
	
	public String description() {
		return nom + " de " + poids + " kg chasse par " + chasseur;
	}

}
