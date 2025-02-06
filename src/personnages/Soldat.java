package personnages;

import objets.Equipement;

public class Soldat extends Romain {
	private Grade grade;
	private static final int NB_EQUIPEMRNT_MAX = 3;
	private Equipement[] equipements = new Equipement[NB_EQUIPEMRNT_MAX];
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
	
	@Override
	public void recevoirCoup(int coup) {
		Equipement equipement;
		int quantiteAbsorde;
		for (int i = 0; i < getNbEquipement() && coup >= 0; i++) {
			equipement = getEquipements()[i];
			quantiteAbsorde = equipement.getDiminueCoup();
			System.out.println("Le " + equipement.toString() + " absorbe " + quantiteAbsorde + " du coup");
			coup -= quantiteAbsorde;
		}
		if (coup < 0) {
			coup = 0;
		}

		force -= coup;

		if (force > 0) {
			System.out.println("Le " + donnerAuteur() + " " + getNom() + " : << Aie >>. ");
		} else {
			force = 0;
			System.out.println("Le " + donnerAuteur() + " " + getNom() + " : << J abandonne ... >>.");
		}
	}
	
	@Override
	public void parler(String texte) {
		String status;
		status = getGrade().toString();
		System.out.println("Le " + status + " " + nom + " : << " + texte + " >>.");
	}

	public boolean sequiper(Equipement equipement) {
		boolean equipementReussi = false;
		if (nbEquipement < NB_EQUIPEMRNT_MAX) {
			for (int i = 0; i < nbEquipement; i++) {
				if (equipements[i] == equipement) {
					return equipementReussi;
				}
			}
		}
		System.out.println("Le " + grade.toString() + " " + nom + " s'equipe avec un "+equipement.toString()+".");
		equipements[nbEquipement] = equipement;
		nbEquipement++; 
		return !equipementReussi;
	}
}
