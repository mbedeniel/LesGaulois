package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestGaulois {
	public static void main(String[] args) {

		/*******************/
		/******** TP1 ********/
		/*******************/

		/*
		 * TP1 Gaulois asterix = new Gaulois("Ast�rix", 8);
		 * asterix.parler(" Bonjour � tous "); Romain minus = new Romain("Minus", 6);
		 * minus.parler(" UN GAU... UN GAUGAU... ");
		 */
		/*
		 * for(int i=0;i<2;i++) { minus.recevoirCoup(3); }
		 */
		/*
		 * for (int i = 0; i < 2; i++) { asterix.frapper(minus); minus.frapper(asterix);
		 * } asterix.frapper(minus);
		 */

		/*******************/
		/******** TP2 ********/
		/*******************/

		/*Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Village village = new Village(vercingetorix);
		Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
		Camp camp = new Camp(minus);

		Gaulois gauloisTab[] = { new Gaulois("Agecanonix", 1), new Gaulois("Assurancetourix", 2),
				new Gaulois("Astérix", 5), new Gaulois("Obelix", 15), new Gaulois("Prolix", 2) };
		Soldat soldats[] = { new Soldat("Brutus", 2, Grade.CENTURION), new Soldat("Milexcus", 2, Grade.SOLDAT),
				new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS), new Soldat("Ballondebaudrus", 2, Grade.OPTIO) };

		for (int i = 0; i < soldats.length; i++) {
			camp.ajouterSoldat(soldats[i]);
		}

		for (int i = 0; i < gauloisTab.length; i++) {
			village.ajouterVillageois(gauloisTab[i]);
		}

		village.afficherVillageois();
		camp.afficherCamp();

		Gaulois abraracourcix = new Gaulois("abraracourcix", 5);
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);

		village.changerChef(abraracourcix);
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);*/

		/*
		 * Lorsque l'on redefini une classe, la redefinition doit etre private ou public
		 * ?
		 * 
		 * Question e ,page 5 : Ballondebaudrus n'avais pas été ajouté au tableau
		 * 
		 * Dans mes tableau j'ai utulisé un private static final int pour la taille de
		 * mes tableaux es ce que cela est correct ?
		 */
		
		/*******************/
		/******** TP3 ******/
		/*******************/
		
		Druide panoramix = new Druide("panoramix", 0); 
		panoramix.fabriquerPotionMagique(3, 2, 6);
		
		Soldat minus = new Soldat("Minus", 6, Grade.SOLDAT);

		Gaulois asterix = new Gaulois("Asterix", 5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois abraracourcix = new Gaulois("abraracourcix", 5);
		Gaulois agecanonix =  new Gaulois("Agecanonix", 1);
		
		panoramix.boosterGaulois(asterix);
		panoramix.boosterGaulois(obelix);
		panoramix.boosterGaulois(assurancetourix);
		panoramix.boosterGaulois(abraracourcix);
		panoramix.boosterGaulois(agecanonix);
		
		asterix.parler(" Bonjour a tous ");
		System.out.println("");
		
		minus.parler("UN GAU... UN GAUGAU...");
		for(int i=0;i<3;i++) {
			if(asterix.continuerCombat(minus)) {
				asterix.frapperPotion(minus);
			}
			if(minus.continuerCombat(asterix)) {
				minus.frapper(asterix);
			}
		}
		
		
	}
}
