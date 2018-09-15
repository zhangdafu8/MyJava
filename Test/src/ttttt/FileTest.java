package ttttt;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File f1 = new File("/Users/qiaoxian/Documents/File");
		if(!f1.exists()) {
			f1.mkdir();
		}
		File f2 = new File("/Users/qiaoxian/Documents/File/Monday.docx");
		if(!f2.exists()) {
			try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("创建成功了吗？");
		System.out.println("文件名称："+f2.getName());
		System.out.println("父类路径:"+f2.getParent());
		
		if(f2.isFile()) {
			System.out.println("文件路径："+f2.getPath());
			System.out.println("文件名称："+f2.getName());
		}
		System.out.println("是否是文件"+f2.isFile());
		System.out.println("是否是目录"+f2.isDirectory());
		System.out.println("文件是否可读"+f2.canRead());
		System.out.println("文件是否可写"+f2.canWrite());
		

	}

}
