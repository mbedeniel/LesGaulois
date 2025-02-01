package personnages;

import objets.Equipement;

public class Soldat extends Romain {
	private Grade grade;
	private static final int nbEquipementMax = 3;
	private Equipement[] equipements = new Equipement[nbEquipementMax];
	private int nbEquipement = 0;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}

	public Grade getGrade() {
		return grade;
	}
	
	
	public Equipement[] getEquipements() {
		return equipements;
	}

	public int getNbEquipement() {
		return nbEquipement;
	}

	public boolean sequiper(Equipement equipement) {
		boolean equipementReussi = false;
		if (nbEquipement < nbEquipementMax) {
			for (int i = 0; i < nbEquipement; i++) {
				if (equipements[i].getNomEquipement() == equipement.getNomEquipement()) {
					return equipementReussi;
				}
			}
		}
		System.out.println("Le " + grade.toString() + " " + nom + " s'équipe avec un "+equipement.getNomEquipement().toString()+".");
		equipements[nbEquipement] = equipement;
		nbEquipement++; 
		return !equipementReussi;
	}
}
