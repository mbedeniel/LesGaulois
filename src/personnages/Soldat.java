package personnages;

public class Soldat extends Romain {
	private Grade grade;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}
}
