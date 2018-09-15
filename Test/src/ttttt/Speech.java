package ttttt;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Speech {

	public static void main(String[] args) {
		//
//		File f1 = new File("speech.txt");
//		if(!f1.exists()) {
//			try {
//				f1.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		try {
			FileInputStream f = new FileInputStream("speech.txt");			
			int n = f.read();
			int count =0;
			System.out.print("文本内容：");
			while(n!=-1) {
				System.out.print((char)n);
				n = f.read();
				count++;
			}
			System.out.println();
			System.out.println("统计结果："+count);
			f.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
