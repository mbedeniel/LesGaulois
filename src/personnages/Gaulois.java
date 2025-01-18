package personnages;

public class Gaulois extends Personnage {

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	public String donnerAuteur() {
		return "Gaulois";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println("main C :" + asterix.getNom());
		asterix.parler("BONJOUR");
	}
}
