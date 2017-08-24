package draw;

public class Team {
	private double coef;
	private String name;
	private Nation nation;

	public Team(String name, int nation, double coef){
		this.name=name;
		this.coef=coef;
		this.nation =Nation.values()[nation];
	}
	public Team(String name, int nation){
		this.name=name;
		this.nation =Nation.values()[nation];
	}
	
	public double getCoef() {
		return coef;
	}
	public void setCoef(double coef) {
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
	public void setNation(int nation) {
		this.nation =Nation.values()[nation];
	}
	
}
