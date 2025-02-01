package objets;

public enum NomEquipement {
	CASQUE("casque"), 
	PLASTRON("plastron"), 
	BOUCLIER("bouclier");
	
	private String nomEquipement;
	
	private NomEquipement (String nomEquipement) {
		this.nomEquipement = nomEquipement;
	}
	
	@Override
	public String toString() {
		return nomEquipement;
	}
}
