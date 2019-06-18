package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fis = new FileInputStream("c:\\down\\1560232428743.exe");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\down\\2019\\1560232428743.exe");
			bos = new BufferedOutputStream(fos);
			
			//PrintStream 목적지 파일  
			ps = new PrintStream(bos,true); //true => autoFlush
			
			int readByteCount = 0;
			byte[] readBytes = new byte[2014];
			while ((readByteCount = bis.read(readBytes)) != -1) {
				ps.write(readBytes,0,readByteCount);
			}
			
		//PrintStream 목적지를 모니터로
			PrintStream ps1 = System.out;
			ps1.println(1);
			ps1.println("aaaa");
			ps1.println(45.1);
		
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(bis != null) bis.close();
				if(fos != null) fos.close();
				if(bos != null) bos.close();
				if(ps != null) ps.close();
				
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
