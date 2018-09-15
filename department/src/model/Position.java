package model;

public class Position {
	private int positionNum;
	private String positionName;
	
	public Position() {
		
	}
	
	public Position(int postionNum, String positionName) {
		this.setPositionNum(postionNum);
		this.setPositionName(positionName);
	}


	public int getPositionNum() {
		return positionNum;
	}
	public void setPositionNum(int postionNum) {
		this.positionNum = postionNum;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	public String info2() {
		String s2 = "职务名称:"+ positionName;
		return s2;
	}
	
	
}
