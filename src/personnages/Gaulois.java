package personnages;

public class Gaulois {
	private String nom;
	private int force;
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println("Le gaulois "+nom+" : <<"+texte+">>");
	}
	public static void main(String[] args) {
		Gaulois asterix  = new Gaulois("Astérix",8); 
		System.out.println("main C :"+asterix.getNom());
		asterix.parler("BONJOUR");
	}
	public void frapper(Romain romain) {
		System.out.println(nom+" envoie un grand coup dans la mâchoire de "+romain.getNom());
		romain.recevoirCoup(force/3);
	}
	
}
