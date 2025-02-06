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

	@Override
	public int recupererForceCoup() {
		boolean frapperPotion = effetPotion > 1;
		int forceBosste = force * effetPotion;
		if (frapperPotion) {
			effetPotion -= 0.5;
		}
		return forceBosste;
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println("main C :" + asterix.getNom());
		asterix.parler("BONJOUR");
	}

}
