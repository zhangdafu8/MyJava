package model;

public class Bear extends Animal implements IACT {


	public Bear() {
		this.setName("Bill");
		this.setAge(1);
	}

	@Override
	public String skill(){
		//
		String str = "挽着花篮，打着雨伞，自立走秀";
		return str;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n技能：" + this.skill() + "\n爱好：" + this.love());

	}

	@Override
	public String love(){
		//
		String str = "喜欢卖萌";
		return str;

	}

}
