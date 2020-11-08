package repository.entity;

public enum IndustryType {
	BANK("Bank"), 
	BUILDING("Building"), 
	DATACOMMUNICATION("Data Communication"), 
	EDUCATION("Education"), 
	FARM("Farm"),
	HEALTH("Health"), 
	MINING("Mining"), 
	PUBLISHING("Publishing"),
	UNKNOWN("Unknown");
	
	private final String industryType;
	
	IndustryType(final String industryType) {
		this.industryType = industryType;
	}
	
	@Override
	public String toString() {
		return industryType;
	}
}
