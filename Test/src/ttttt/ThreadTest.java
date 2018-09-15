package ttttt;

class MyTread extends Thread{
	public MyTread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"正在打印"+(i+1));
		}
	}
}

public class ThreadTest{
	public static void main(String[] args) {
		MyTread th = new MyTread("打印机");
		th.start();

	}

}
