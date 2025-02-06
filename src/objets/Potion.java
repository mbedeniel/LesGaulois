package objets;


public class Potion {
	private int dose;
	private int force;
	
	public Potion(int dose,int force) {
		this.dose = dose;
		this.force = force;
	}

	public int donnerDose() {
		int forceDose = 1;
		boolean resteDose = resteDose();
		if (resteDose) {
			dose--;
			forceDose = force;
		}
		return forceDose;
	}
	
	public boolean resteDose() {
		return dose > 0;
	}

	public int getForce() {
		return force;
	}

}
