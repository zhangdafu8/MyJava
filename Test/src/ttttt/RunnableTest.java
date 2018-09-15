package ttttt;

class Cat implements Runnable{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"A cat");
		}
	}
}

class Dog implements Runnable{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"A dog");
		}
	}
}

public class RunnableTest {

	public static void main(String[] args) {
		Cat c = new Cat();
		Thread c1 = new Thread(c);
		c1.start();
		Dog d = new Dog();
		Thread d1 = new Thread(d);
		d1.start();
		for(int i= 0;i<3;i++) {
			System.out.println("main thread");
		}

	}

}
