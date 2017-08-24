package draw;

public enum Nation {
	ENGLAND ("England"),
	FRANCE ("France"),
	SPAIN ("Spain"),
	GERMANY ("Germany"),
	ITALY ("Italy"),
	PORTUGAL ("Portugal"),
	SCOTLAND ("Scotland"),
	RUSSIA ("Russia"),
	UKRAINE ("Ukraine"),
	SWITZERLAND ("Switzerland"),
	GREECE ("Greece"),
	BELGIUM ("Belgium"),
	TURKEY ("Turkey"),
	CYPRUS ("Cyprus"),
	NETHERLANDS ("Netherlands"),
	SLOVENIA ("Slovenia"),
	AZERBAIJAN ("Azerbaijan");
	
	private String nationName;
	
	private Nation(String name){
		this.nationName=name;
	}
	
	public String toString(){
		return nationName;
		
	}
	public String getNation(){
		return toString();
	}
	
}
