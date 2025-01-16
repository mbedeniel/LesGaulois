package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] lesGaulois = new Gaulois[50];
	private int nbGaulois = 0;


	public Village(Gaulois chef) {
		this.chef = chef;
	}
	
	
	public Gaulois getChef() {
		return chef;
	}


	public void ajouterVillageois(Gaulois gaulois) {
		lesGaulois[nbGaulois] = gaulois;
		nbGaulois++;
	}
	
	 public void afficherCamp() {
		 System.out.println("Le village de "+getChef().getNom()+" est habité par : ");
		 for(int i=0;i<nbGaulois;i++) {
			 System.out.println("- "+lesGaulois[i].getNom());
		 }
	 }
}
