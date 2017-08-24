package draw;

public class Team {
	private double coef;
	private String name;
	private Nation nation;

	public Team(String name, Nation nation, double coef){
		this.name=name;
		this.coef=coef;
		this.nation=nation;
	}
	
	public double getCoef() {
		return coef;
	}
	public void setCoef(int coef) {
		this.coef = coef;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Nation getNation() {
		return nation;
	}
	public void setNation(Nation nation) {
		this.nation = nation;
	}
	
}
