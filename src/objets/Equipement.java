package objets;

public enum Equipement {
	CASQUE("casque",3), 
	PLASTRON("plastron",2), 
	BOUCLIER("bouclier",3);
	
	private String nom;
	private int resitanceChoc ;
	
	private Equipement (String nomEquipement,int diminueCoup) {
		this.nom = nomEquipement;
		this.resitanceChoc = diminueCoup;
	}
	

	public int getResitanceChoc() {
		return resitanceChoc;
	}

	@Override
	public String toString() {
		return nom;
	}
}
