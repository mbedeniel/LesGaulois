package personnages;

public enum Grade {
	SOLDAT("soldat"), 
	TESSERARIUS("tesserarius"), 
	OPTIO("optio"), 
	CENTURION("centurion");
	
	private String grade;
	
	private Grade(String grade) {
		this.grade =grade;
	}
	
	@Override
	public String toString() {
		return grade;
	}
}