package ttttt;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		Product p1 = new Product(123,"iphone","telephone",4888.0);
		Product p2 = new Product(234,"ipad","cpmputer",5088.0);
		Product p3 = new Product(345,"macbook","computer",10688.0);
		Product p4 = new Product(256,"iwatch","watch",4799.0);
		
		try {
//			File f1 = new File("apple.txt");
//			if(!f1.exists()) {
//				try {
//					f1.createNewFile();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			FileOutputStream fos = new FileOutputStream("apple.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("apple.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.writeObject(p4);
			oos.flush();
//			Product p11 = (Product)ois.readObject();
			System.out.println("apple系列产品信息：\n");
			
			try {
				System.out.println(ois.readObject()+"\n");
				System.out.println(ois.readObject()+"\n");
				System.out.println(ois.readObject()+"\n");
				System.out.println(ois.readObject()+"\n");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fos.close();
			oos.close();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
