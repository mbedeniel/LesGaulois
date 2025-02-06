package sites;

import personnages.Grade;
import personnages.Romain;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] lesSoldats = new Soldat[TAILLE_CAMP];
	private int nbSoldats = 0;
	private static final int TAILLE_CAMP = 3;

	public Camp(Soldat commandant) {

		commandant.parler("Je suis en charge de creer un nouveau camp romain.");
		this.commandant = commandant;
	}

	public Romain getCommandant() {
		return commandant;
	}

	public boolean changerCommandant(Soldat commandant) {
		boolean changementEffectue = commandant.getGrade().equals(Grade.CENTURION);
		if (changementEffectue) {
			this.commandant = commandant;
			commandant.parler("Moi " + commandant.getNom() + " je prends la direction du camp romain.");
		}
		commandant.parler("Je ne suis pas suffisamment grade pour prendre la direction du camp romain.");
		return changementEffectue;
	}

	public boolean ajouterSoldat(Soldat soldat) {
		boolean ajoutEffectue = nbSoldats < TAILLE_CAMP;
		if (ajoutEffectue) {
			lesSoldats[nbSoldats] = soldat;
			soldat.parler("Je mets mon epee au service de Rome dans le camp dirige par " + getCommandant().getNom());
			nbSoldats++;
		}
		commandant.parler("Desole Ballondebaudrus notre camp est complet !");
		return ajoutEffectue;
	}

	public void afficherCamp() {
		System.out.println("Le camp dirige par " + getCommandant().getNom() + " contient les soldats : ");
		for (int i = 0; i < nbSoldats; i++) {
			System.out.println("- " + lesSoldats[i].getNom());
		}
	}
}
