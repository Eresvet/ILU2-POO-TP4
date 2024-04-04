package produit;

import personnages.Gaulois;

public class Poisson extends Produit {
	private String datePeche;
	private String nom = "poisson";

	public String getNom() {
		return "poisson";
	}
	
	public String description() {
		return nom + " peche " + datePeche;
	}

}
