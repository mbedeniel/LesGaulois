package personnages;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import objets.Potion;

public class Druide extends Gaulois {

	private Potion potion = null; 
	private static String gauloisNonAutorisé = new String("Obelix");
	private static SecureRandom random;
	
	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random  = SecureRandom.getInstanceStrong();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	public void fabriquerPotionMagique(int dose, int forceMini, int forceMax) {
		int forcePotion = random.nextInt(forceMini, forceMax);
		potion  = new Potion(dose, forcePotion);
		parler("J'ai concocté "+dose+" doses de potion magique. Elle a une force de "+forcePotion);
	}
	
	public boolean boosterGaulois(Gaulois gaulois) {
		String nomGaulois = new String(gaulois.getNom());
		boolean etreObelix = nomGaulois.equals(gauloisNonAutorisé);
		boolean avoirBooste = false;
		if(! etreObelix) {
			boolean avoirPotion = potion != null;
			int dosePotion = potion.getDose() - 1;
			avoirBooste = avoirPotion && dosePotion >= 0;
			if(avoirBooste) {
				gaulois.setEffetPotion(potion.getForce());
				potion.setDose(dosePotion);
				parler("Tiens "+nomGaulois+" un peu de potion magique ");
			}else {
				parler("Désolé "+nomGaulois+" il n'y a plus une seule goutte de potion.");
			}
		}else{
			parler("Non, "+gauloisNonAutorisé+"  Non !... Et tu le sais tres bien !");
		}
		return avoirBooste;
	}

}
