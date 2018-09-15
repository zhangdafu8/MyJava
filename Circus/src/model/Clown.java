package model;

public class Clown implements IACT {
	private String name;
	private int years;
	private String dress;
	
	public Clown() {
		this.setName("Kahle");
		this.setYears(5);
		this.setDress("身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getDress() {
		return dress;
	}

	public void setDress(String dress) {
		this.dress = dress;
	}

	@Override
	public String skill() {
		// TODO Auto-generated method stub
		String str= "脚踩高跷，进行杂技魔术表演";
		return str;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub

	}

}
