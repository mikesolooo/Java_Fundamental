package java_20190612;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutTestDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:\\down\\1560232428743.exe");
			fos = new FileOutputStream("c:\\down\\2019\\1560232428743.exe");
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
}
