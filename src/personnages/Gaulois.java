package personnages;

public class Gaulois extends Personnage {
	
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}
	

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}

	@Override
	public String donnerAuteur() {
		return "Gaulois";
	}
	
	
	public boolean frapperPotion(Romain romain) {
		boolean frapperPotion = effetPotion > 1;
		frapper(romain);
		romain.recevoirCoup(force*effetPotion);
		System.out.println(effetPotion);
		if(frapperPotion) {
			effetPotion -= 0.5;
		}
		return frapperPotion;
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println("main C :" + asterix.getNom());
		asterix.parler("BONJOUR");
	}

}
