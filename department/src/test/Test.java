package test;
import model.*;
public class Test {

	public static void main(String[] args) {
		Department d1 = new Department("人事部",01);
		Department d2 = new Department("市场部",02);
		//System.out.println(d1.info1());
		Position p1 = new Position(01,"经理");
		//System.out.println(p1.info2());
		Staff s1 = new Staff("张铭","S001",29,"男",d1,p1);
		System.out.println(s1.info3());
		System.out.println("=============");
		
		Position p2 = new Position(02,"助理");
		Staff s2 = new Staff("李艾爱","S002",21,"女",d1,p2);
		System.out.println(s2.info3());
		System.out.println("=============");
		
		Position p3 = new Position(03,"职员");
		Staff s3 = new Staff("孙超","S004",29,"男",d1,p3);
		System.out.println(s3.info3());
		System.out.println("=============");
		
		Staff s4 = new Staff("张美美","S005",26,"女",d2,p3);
		System.out.println(s4.info3());
		System.out.println("=============");
		
		Staff s5 = new Staff("蓝迪","S006",37,"男",d2,p1);
		System.out.println(s5.info3());
		System.out.println("=============");
		
		Staff s6 = new Staff("米莉","S007",24,"女",d2,p3);
		System.out.println(s6.info3());
		System.out.println("=============");
		
		d1.add(s1);
		d1.add(s2);
		d1.add(s3);
		d2.add(s4);
		d2.add(s5);
		d2.add(s6);
		System.out.println(d1.getDepartName()+"总共有"+d1.getCount()+"名员工");
		System.out.println(d2.getDepartName()+"总共有"+d2.getCount()+"名员工");

	}

}
