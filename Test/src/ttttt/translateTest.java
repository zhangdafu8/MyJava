package ttttt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class translateTest {
	
	public static void transWriteByBuf(BufferedWriter bw, String s1) {
		try {
			bw.write(s1);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void transReadByBuf(BufferedReader br) {

		try {
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		//
		try {
//			File f1 = new File("hello.txt");
//			if(!f1.exists()) {
//				try {
//					f1.createNewFile();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			FileInputStream fis = new FileInputStream("hello.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			FileOutputStream fos = new FileOutputStream("hello.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			String s1 = "你好吗?\n我很好";
			transWriteByBuf(bw,s1);
			transReadByBuf(br);

			fis.close();
			isr.close();
			fos.close();
			osw.close();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
