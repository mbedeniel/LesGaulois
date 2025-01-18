package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] lesGaulois = new Gaulois[TAILLE_VILLAGE];
	private int nbGaulois = 0;
	private static final int TAILLE_VILLAGE = 4;

	public Village(Gaulois chef) {
		chef.parler("Je suis un grand guerrier et je vais créer mon village");
		this.chef = chef;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void changerChef(Gaulois chef) {
		this.chef.parler("Je laisse mon grand bouclier au grand " + chef.getNom());
		this.chef = chef;
		chef.parler("Merci !");
	}

	public boolean ajouterVillageois(Gaulois gaulois) {
		if (nbGaulois < TAILLE_VILLAGE) {
			lesGaulois[nbGaulois] = gaulois;
			chef.parler("Bienvenue " + gaulois.getNom() + " !");
			nbGaulois++;
			return true;
		}
		chef.parler("Désolé " + gaulois.getNom() + " mon village est déjà bien rempli.");
		return false;
	}

	public void afficherVillageois() {
		System.out.println("Le village de " + getChef().getNom() + " est habité par : ");
		for (int i = 0; i < nbGaulois; i++) {
			System.out.println("- " + lesGaulois[i].getNom());
		}
	}
}
