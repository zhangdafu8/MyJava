package ttttt;

class Letter implements Runnable{
	char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public Letter() {
		
	}

	@Override
	public void run() {
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class SleepTest {

	public static void main(String[] args) {
		Letter l = new Letter();
		Thread t = new Thread(l);
		t.start();

	}

}
