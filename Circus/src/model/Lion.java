package model;

public class Lion extends Animal implements IACT {
	
	private String color;
	private String sex;
	
	public Lion() {
		this.setName("Lain");
		this.setAge(2);
		this.setSex("公狮");	
		this.setColor("灰色");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String skill() {
		//
		String str = "擅长钻火圈";
		return str;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n性别：" + this.getSex() + "\n毛色："
				+ this.getColor() + "\n技能：" + this.skill() + "\n爱好：" + this.love());

	}

	@Override
	public String love() {
		String str = "喜欢吃各种肉类";
		return str;
	}

}
