package objets;

public enum Equipement {
	CASQUE("casque",3), 
	PLASTRON("plastron",2), 
	BOUCLIER("bouclier",3);
	
	private String nom;
	private int diminueCoup ;
	
	private Equipement (String nomEquipement,int diminueCoup) {
		this.nom = nomEquipement;
		this.setDiminueCoup(diminueCoup);
	}
	
	
	public String getNom() {
		return nom;
	}
	

	public int getDiminueCoup() {
		return diminueCoup;
	}

	@Override
	public String toString() {
		return nom;
	}


	public void setDiminueCoup(int diminueCoup) {
		this.diminueCoup = diminueCoup;
	}
}
