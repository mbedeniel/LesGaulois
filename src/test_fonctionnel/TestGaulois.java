package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Romain;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestGaulois {
	public static void main(String[] args) {
		/*Gaulois asterix = new Gaulois("Ast�rix", 8);
		asterix.parler(" Bonjour � tous ");
		Romain minus = new Romain("Minus", 6);
		minus.parler(" UN GAU... UN GAUGAU... ");*/
		/*
		 * for(int i=0;i<2;i++) { minus.recevoirCoup(3); }
		 */
		/*for (int i = 0; i < 2; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
		asterix.frapper(minus);*/
		
		Gaulois Vercing�torix = new Gaulois("Vercing�torix", 5);
		Village village = new Village(Vercing�torix);
		Romain Minus = new Romain("Minus", 2);
		Camp camp = new Camp(Minus);
		
		Gaulois vercing�torix = new Gaulois(" Agecanonix", 1);
		Gaulois Assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois Ast�rix = new Gaulois("Ast�rix", 5);
		Gaulois Obelix = new Gaulois("Obelix", 15);
		Gaulois Prolix = new Gaulois("Prolix", 2);
		
		Soldat  Brutus = new Soldat("Brutus",2,Grade.CENTURION);
		Soldat  Milexcus = new Soldat("Milexcus",2,Grade.SOLDAT);
		Soldat  Tullius = new Soldat("Tullius Octopus",2,Grade.TESSERARIUS);
		Soldat  Ballondebaudrus = new Soldat("Ballondebaudrus",2,Grade.OPTIO);
		
	}
}
