package model;

public class Parrot extends Animal implements IACT {
	
	private String type;
	
	public Parrot() {
		this.setName("Rose");
		this.setAge(1);
		this.setType("牡丹鹦鹉");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String skill() {
		String str = "擅长模仿";
		return str;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub

	}

	@Override
	public String love() {
		String str = "喜欢吃坚果和松子";
		return str;
	}

}
