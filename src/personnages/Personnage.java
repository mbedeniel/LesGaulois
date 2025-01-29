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

	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : << " + texte + " >>.");
	}

	public void frapper(Personnage personnage) {
		System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup au "
				+ personnage.donnerAuteur() + " " + personnage.getNom() + ".");
		personnage.recevoirCoup(force / 3);
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
