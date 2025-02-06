package personnages;

public abstract class Personnage {
	protected String nom;
	protected int force;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : << " + texte + " >>.");
	}

	public void frapper(Personnage personnage) {
		int forceCoup = recupererForceCoup();
		System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup de force " + forceCoup
				+ " au " + personnage.donnerAuteur() + " " + personnage.getNom() + ".");
		personnage.recevoirCoup(forceCoup);
	}

	public int recupererForceCoup() {
		return force;
	}

	public void recevoirCoup(int coup) {

		force -= coup;

		if (force > 0) {
			System.out.println("Le " + donnerAuteur() + " " + getNom() + " : << Aie >>. ");
		} else {
			force = 0;
			System.out.println("Le " + donnerAuteur() + " " + getNom() + " : << J abandonne ... >>.");
		}
	}

	protected abstract String donnerAuteur();

}
