package homework1;

import java.util.Scanner;

public class Homework1 {
	public void notice() {
		System.out.println("*****************************");
		System.out.println("      1--插入数据");
		System.out.println("      2--显示所有数据");
		System.out.println("      3--在指定位置插入数据");
		System.out.println("      4--查询能被3整除的数据");
		System.out.println("      0--退出");
		System.out.println("*****************************");
	}
	
	public int[] insertData() {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0;i<9;i++) {
			System.out.println("请输入第"+(i+1)+"个数字");
			a[i] = sc.nextInt();
		}
		showData(a,9);
		System.out.println();
		return a;
	}
	
	public void showData(int[] a, int length) {
		System.out.println("数组元素为:");
		for(int i=0; i <length;i++) {
			if(a[i]!=0) {
				System.out.print(a[i]+"  ");
			}
		
		}
		System.out.println();
	}
	
	public int[] insertAtArray(int[] a, int n, int k) {
		System.out.println("请输入要插入的数据：");
		Scanner sc = new Scanner(System.in);
		int[] result = new int[a.length];
		n = sc.nextInt();
		System.out.println("请输入要插入数据的位置：");
		k = sc.nextInt();
		for(int j=0;j<k;j++) {
			result[j] = a[j];
		}
		result[k] = n;
		for(int l = k+1;l<a.length;l++) {
			result[l] = a[l-1];
		}

		for(int i=0; i <a.length;i++) {
			System.out.print(result[i]+"  ");
		}
		System.out.println();
		return result;
	}
	
	public void divThree(int[] a) {
		System.out.print("数组中能被3整除的元素为:");
		for (int i=0;i<10;i++) {
			if(a[i]%3==0 & a[i]!=0) {
				System.out.print("   "+ a[i]);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//界面
		int[] a = new int[10];
		int length = a.length;
		Homework1 hw = new Homework1();
		int n=0,k=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
		hw.notice();
		int j = sc.nextInt();
		if(j==0) {
			break;
		}
		else {
		switch(j){
		case 1: a=hw.insertData();break;
		case 2: hw.showData(a, length);break;
		case 3: a=hw.insertAtArray(a, n, k);break;
		case 4: hw.divThree(a);break;
		case 0: break;
		}
		}
		}
		System.out.print("退出程序！");
	}
}
