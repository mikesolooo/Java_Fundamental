package java_20190617.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket; //6
import java.net.Socket; //11

public class EchoServer1 {
	private int port; //2
	private ServerSocket serverSocket; //5
	public EchoServer1(int port) { //3
		this.port = port; //4
		try {//8. 
			serverSocket = new ServerSocket(port); //7 ServerSocket ��ü�� �����Ѵ�.
			
			System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��� �ֽ��ϴ�.");
			// ServerSocket�� accept() �޼���� Ŭ���̾�Ʈ ������ ����Ѵ�.
			Socket socket = serverSocket.accept(); //10 
			
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip+"�����߽��ϴ�.");
			
			// Ŭ���̾�Ʈ�� TCP ���ؼ��� ��������鼭 Ŭ���̾�Ʈ�� ����� �� �ִ�
			// Socket ��ü�� �����ȴ�.
			
			//23 Ŭ���̾�Ʈ�κ��� �޽����� �޴´�
			InputStream in = socket.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
			
			//24
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(readLine);
			bw.newLine();
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();//9
		}
		
	}
	
	public static void main(String[] args) {
		new EchoServer1(3001); // 1. 3001 �� ��Ʈ��ȣ
	}
}
