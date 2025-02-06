package personnages;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import objets.Potion;

public class Druide extends Gaulois {

	private Potion potion = null;
	private static final String GAULOIS_NON_AUTORISE = "Obelix";
	private static SecureRandom random;

	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	public void fabriquerPotionMagique(int dose, int forceMini, int forceMax) {
		int forcePotion = random.nextInt(forceMini, forceMax);
		potion = new Potion(dose, forcePotion);
		parler("J'ai concocte " + dose + " doses de potion magique. Elle a une force de " + forcePotion);
	}

	public boolean boosterGaulois(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		boolean etreObelix = nomGaulois.equals(GAULOIS_NON_AUTORISE);
		boolean avoirBooste = false;
		if (!etreObelix) {
			boolean avoirPotion = potion != null && !potion.resteDose();
			if (avoirPotion) {
				gaulois.setEffetPotion(potion.donnerDose());
				avoirBooste = true;
				parler("Tiens " + nomGaulois + " un peu de potion magique ");
			} else {
				parler("Desole " + nomGaulois + " il n'y a plus une seule goutte de potion.");
			}
		} else {
			parler("Non, " + GAULOIS_NON_AUTORISE + "  Non !... Et tu le sais tres bien !");
		}
		return avoirBooste;
	}

}
