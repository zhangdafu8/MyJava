package model;

public class Staff {
	private String staffName;
	private String number;
	private int age;
	private String gender;
	private Department department;
	private Position position;
	
	public Staff() {
		
	}

	public Staff(String staffName, String number, int age, String gender, Department department, Position position) {
		this.staffName = staffName;
		this.number = number;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.position = position;
	}
    //试一下
	public Staff(String staffName, String number, int age, String gender) {
		this.staffName = staffName;
		this.number = number;
		this.age = age;
		this.gender = gender;
	}
	
	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if((age >18)&&(age <65)) {
			this.age = age;
		}else {
			this.age = 18;
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(gender.equals("男")) {
			this.gender = "男";
		}else {
			this.gender = "女";
		}
	}

	public Department getDepartment() {
		if(this.department == null) {
			this.department = new Department();
		}
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		if(this.position == null) {
			this.position = new Position();
		}
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public String info3() {
		String s3 ="姓名:"+this.getStaffName()+"\n工号:"+this.getNumber()+"\n性别:"+this.getGender()+"\n年龄:"+this.getAge()+"\n职务:"+this.getDepartment().getDepartName()+this.getPosition().getPositionName();
		return s3;
	}
	

}
