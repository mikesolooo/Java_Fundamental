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
			//c:\\down\\jdk.exe ��ο� ������ ������ FileNoetFoundException
			//���ܸ� �߻���Ų��.
			fin = new FileInputStream(
					"c:\\down\\1560232428743.exe");
			fos = new FileOutputStream(
					"c:\\down\\2019\\1560232428743.exe");
			/*
			 * int readByte = 0; //fin.read() �޼���� �ѹ���Ʈ�� �д´�. //���� ���̻� ���� ����Ʈ�� ������ -1�� ��ȯ�Ѵ�
			 * while((readByte = fin.read()) != -1) {// �ѹ���Ʈ �а� //fos.write(readByte) �޼����
			 * �ѹ���Ʈ�� �� fos.write(readByte); }
			 */
			long start = System.currentTimeMillis();
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*40]; // ���Ƿ� ���� ���� �� ����. �ӵ��� �Ѱ谡 ���� 
			while ((readByteCount = fin.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteCount);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("����ð� : "+(end-start));
			
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
