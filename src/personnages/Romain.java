package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println("Le romain "+nom+" : <<"+texte+">>");
	}
	public void recevoirCoup(int coup) {
		force-=coup;
		if(force>0) {
			System.out.println("Aïe ! ");
		}else{
			force=0;
			System.out.println("J’abandonne… ");
		}
	}
}
