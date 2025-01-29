package objets;


public class Potion {
	private int dose;
	private int force;
	
	public Potion(int dose,int force) {
		this.dose = dose;
		this.force = force;
	}

	public int getDose() {
		return dose;
	}

	public int getForce() {
		return force;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}

}
