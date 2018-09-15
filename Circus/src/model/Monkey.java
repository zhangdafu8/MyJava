package model;

public class Monkey extends Animal implements IACT {
	private String type;
	
	public Monkey() {
		this.setName("Tom");
		this.setAge(1);
		this.setType("金丝猴");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String skill() {
		String str = "骑独轮车过独木桥";
		return str;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub

	}

	@Override
	public String love() {
		String str = "喜欢模仿人的动作表情";
		return str;
	}

}
