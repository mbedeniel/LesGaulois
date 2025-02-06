package personnages;

public enum Grade {
	SOLDAT("soldat"), TESSERARIUS("tesserarius"), OPTIO("optio"), CENTURION("centurion");

	private String nomGrade;

	private Grade(String grade) {
		this.nomGrade = grade;
	}

	@Override
	public String toString() {
		return nomGrade;
	}
}