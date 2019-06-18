package java_20190617.echoclient;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class EchoClient1 {
	private String ip; //12
	private int port; //13
	private Socket socket;
	
	
	public EchoClient1(String ip, int port) { //16
		// TODO Auto-generated constructor stub
		this.ip = ip; //17
		this.port = port ; //18
		
		
		try {
			//19 Ŭ���̾�Ʈ ���ϰ�ü�� �����Ѵ�
			socket = new Socket(ip,port);
			
			//22 ������ TCP Ŀ�ؼ��� ��������鼭 ������ ����� �� �ִ�
			//Socket ��ü�� �����ȴ�.
			
			//25 �������� �޼����� ������
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("�ȳ��ϼ���");
			bw.newLine();
			bw.flush();
			
			//26 �����κ��� �޽����� �޴´�.
			InputStream in = socket.getInputStream();
			
		} catch (UnknownHostException e) { //20
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) { //21
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {//14
		new EchoClient1("127.0.0.1",3001);//15
	}
}
