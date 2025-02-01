package personnages;

import objets.Equipement;

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
		String status;
		if (this instanceof Soldat) {
			Soldat soldat = (Soldat) this;
			status = new String((soldat.getGrade()).toString());
		} else {
			status = donnerAuteur();
		}
		System.out.println("Le " + status + " " + nom + " : << " + texte + " >>.");
	}

	public void frapper(Personnage personnage) {
		System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup de force " + force + " au "+ personnage.donnerAuteur() + " " + personnage.getNom() + ".");
		personnage.recevoirCoup(force);
	}

	public void recevoirCoup(int coup) {

		if (this instanceof Soldat) {
			Soldat soldat = (Soldat) this;
			Equipement equipement;
			int quantiteAbsorde;
			for (int i = 0; i < soldat.getNbEquipement() && coup >= 0; i++) {
				equipement = soldat.getEquipements()[i];
				quantiteAbsorde = equipement.getDiminueCoup();
				System.out.println("Le " + equipement.getNomEquipement().toString() + " absorbe " + quantiteAbsorde + " du coup");
				coup -= quantiteAbsorde;
			}
			if (coup < 0) {
				coup = 0;
			}
		}

		force -= coup;

		if (force > 0) {
			System.out.println("Le " + donnerAuteur() + " " + getNom() + " : << Aie >>. ");
		} else {
			force = 0;
			System.out.println("Le " + donnerAuteur() + " " + getNom() + " : << J abandonne ... >>.");
		}
	}

	public boolean continuerCombat(Personnage personnage) {
		return force > 0 && personnage.force > 0;
	}

	protected abstract String donnerAuteur();

}
