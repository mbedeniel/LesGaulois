package objets;

public class Equipement {
	private NomEquipement nomEquipement;
	private int diminueCoup;
	private static final int BOUCLIER_DIMINUE_COUP = 3;
	private static final int CASQUE_DIMINUE_COUP = 2;
	private static final int PLASTRON_DIMINUE_COUP = 3;

	public NomEquipement getNomEquipement() {
		return nomEquipement;
	}

	public int getDiminueCoup() {
		return diminueCoup;
	}

	public Equipement(NomEquipement nomEquipement) {
		this.nomEquipement = nomEquipement;
		switch (nomEquipement) {
		case BOUCLIER:
			diminueCoup = BOUCLIER_DIMINUE_COUP;
			break;
		case CASQUE:
			diminueCoup = CASQUE_DIMINUE_COUP;
			break;
		case PLASTRON:
			diminueCoup = PLASTRON_DIMINUE_COUP;
			break;
		}
	}

}
