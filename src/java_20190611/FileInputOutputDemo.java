package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fos = null;
		try {
			//c:\\down\\jdk.exe 경로에 파일이 없으면 FileNoetFoundException
			//예외를 발생시킨다.
			fin = new FileInputStream(
					"c:\\down\\1560232428743.exe");
			fos = new FileOutputStream(
					"c:\\down\\2019\\1560232428743.exe");
			/*
			 * int readByte = 0; //fin.read() 메서드는 한바이트씩 읽는다. //만약 더이상 읽을 바이트가 없으면 -1을 반환한다
			 * while((readByte = fin.read()) != -1) {// 한바이트 읽고 //fos.write(readByte) 메서드는
			 * 한바이트씩 씀 fos.write(readByte); }
			 */
			long start = System.currentTimeMillis();
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*40]; // 임의로 숫자 정할 수 있음. 속도에 한계가 있음 
			while ((readByteCount = fin.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteCount);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("경과시간 : "+(end-start));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if(fin != null) fin.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
