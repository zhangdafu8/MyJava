package model;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String returName(String name) {
		return "nihao";
	}
	
	public abstract String love();
}
