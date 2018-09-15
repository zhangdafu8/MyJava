package model;

public class Department {
	private String departName;
	private Staff[] staff;
	private int count;
	private int departNum;
		
	public Department() {
		
	}

	public Department(String departName,int departnum) {
		this.setDepartName(departName);
		this.setDepartNum(departnum);
	}
	
	public String getDepartName() {
		return departName;
	}
	
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	public Staff[] getStaff() {
		if(this.staff == null) {
			this.staff = new Staff[200];
		}
		return staff;
	}

	public void setStaff(Staff[] staff) {
		this.staff = staff;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	public int getDepartNum() {
		return departNum;
	}

	public void setDepartNum(int departNum) {
		this.departNum = departNum;
	}

	public void add(Staff s) {
		for(int i = 0; i < this.getStaff().length;i++) {
			if(this.getStaff()[i]==null) {
				this.getStaff()[i]=s;
				this.count = i+1;
				return;
				}
			}
		
	}
	
	public String info1() {
		String s1 = "职务:"+ departName;
		return s1;
	}
}
