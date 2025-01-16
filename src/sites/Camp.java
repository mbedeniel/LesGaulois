package sites;

import personnages.Romain;
import personnages.Soldat;

public class Camp {
	private Romain commandant;
	private Soldat[] lesSoldats = new Soldat[80];
	private int nbSoldats = 0;


	public Camp(Romain commandant) {
		this.commandant = commandant;
	}
 

	public Romain getCommandant() {
		return commandant;
	}


	protected void ajouterSoldat(Soldat soldat) {
		lesSoldats[nbSoldats] = soldat;
		nbSoldats++;
	}
	
	public void afficherCamp() {
		 System.out.println("Le camp dirigé par "+getCommandant().getNom()+" contient les soldats : ");
		 for(int i=0;i<nbSoldats;i++) {
			 System.out.println("- "+lesSoldats[i].getNom());
		 }
	 }
}
