package repository.staticValue;

public enum Title {
	MR("Mr"), 
	MISS("Miss"), 
	MRS("Mrs"), 
	MS("Ms"),
	UNKNOWN("Unknown");
		
	private final String title;
	
	Title(final String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return title;
	}
}
