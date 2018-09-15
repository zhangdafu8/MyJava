package actmenu;

import java.util.Scanner;

import model.Bear;
import model.Clown;
import model.IACT;
import model.Lion;
import model.Monkey;
import model.Parrot;

public class Act {
	
	public static void watchOrNot() {
		boolean flag = false;
		while (!flag) {
			System.out.println("******   是否继续观看(1/0)   ******");
			Scanner sc1 = new Scanner(System.in);
			int n1 = sc1.nextInt();
			if (n1 == 0) {
				System.out.println("********    欢迎下次光临    ********");
				flag = true;
				System.exit(-1);
			} else if (n1 == 1) {
				flag =true;
			} else {
				System.out.println("** 输入信息不正确，请重新输入 **");
			}
		}
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("********欢迎来到太阳马戏团********");
			System.out.println("**********  请选择表演者  **********");
			System.out.println("**********    1.棕熊    **********");
			System.out.println("**********    2.狮子    **********");
			System.out.println("**********    3.猴子    **********");
			System.out.println("**********    4.鹦鹉    **********");
			System.out.println("**********    5.小丑    **********");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
//			label: 
			switch (n) {
			case 1:
				IACT b1 = new Bear();
				b1.act();
				watchOrNot();
				break;
			case 2:
				IACT l1 = new Lion();
				l1.act();
				watchOrNot();
				break;

			case 3:
				Monkey m1 = new Monkey();
				System.out.println("表演者：" + m1.getName() + "\n年龄：" + m1.getAge() + "岁\n品种：" + m1.getType() + "\n技能："
						+ m1.skill() + "\n爱好：" + m1.love());
				while (true) {
					System.out.println("******   是否继续观看(1/0)   ******");
					Scanner sc3 = new Scanner(System.in);
					int n3 = sc3.nextInt();
					switch (n3) {
					case 0:
						System.out.println("********    欢迎下次光临    ********");
						return;
					case 1:
						break;
					default:
						System.out.println("** 输入信息不正确，请重新输入 **");
					}
				}
			case 5:
				Clown c1 = new Clown();
				System.out.println("表演者：" + c1.getName() + "\n艺龄：" + c1.getYears() + "年\n着装：" + c1.getDress() + "\n技能："
						+ c1.skill());
				while (true) {
					System.out.println("******   是否继续观看(1/0)   ******");
					Scanner sc4 = new Scanner(System.in);
					int n4 = sc4.nextInt();
					switch (n4) {
					case 0:
						System.out.println("********    欢迎下次光临    ********");
						return;
					case 1:
						break;
					default:
						System.out.println("** 输入信息不正确，请重新输入 **");
					}
				}
			case 4:
				Parrot p1 = new Parrot();
				System.out.println("表演者：" + p1.getName() + "\n年龄：" + p1.getAge() + "岁\n品种：" + p1.getType() + "\n技能："
						+ p1.skill() + "\n爱好：" + p1.love());
				while (true) {
					System.out.println("******   是否继续观看(1/0)   ******");
					Scanner sc5 = new Scanner(System.in);
					int n5 = sc5.nextInt();
					switch (n5) {
					case 0:
						System.out.println("********    欢迎下次光临    ********");
						return;
					case 1:
						break;
					default:
						System.out.println("** 输入信息不正确，请重新输入 **");
					}
				}

			}
		}
	}
}