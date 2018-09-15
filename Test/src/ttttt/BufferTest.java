package ttttt;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferTest {

	public static void main(String[] args) {
		//
		try {
			FileOutputStream f1 = new FileOutputStream("one.txt");
			FileOutputStream f2 = new FileOutputStream("two.txt");
			BufferedOutputStream b2 = new BufferedOutputStream(f2);
			byte[] a = new byte[99999];
			System.out.println("one不使用缓冲流来写");
			long startTime1 = System.currentTimeMillis();
			for (int i = 0; i < a.length; i++) {
				a[i]=0;
				f1.write(a[i]);
				f1.flush();
			}
			long endTime1 = System.currentTimeMillis();
			long time1 = endTime1-startTime1;
			System.out.println(startTime1+"   "+endTime1);
			System.out.println("用时为："+time1);
			
			System.out.println("two使用缓冲流来写");
			long startTime2 = System.currentTimeMillis();
			for (int j = 0; j < a.length; j++) {
				a[j]=1;
				f2.write(a[j]);
				f2.flush();
			}
			long endTime2 = System.currentTimeMillis();
			long time2 = endTime2-startTime2;
			System.out.println("用时为："+time2);
			System.out.println("用缓冲流来写节省了"+(time1-time2));
			
			f1.close();
			f2.close();
			b2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			

		}
	}
}
