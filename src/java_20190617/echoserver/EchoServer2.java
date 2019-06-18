package java_20190617.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {
	private int port;
	private ServerSocket serverSocket; // ��������
	public EchoServer2(int port) {
		this.port = port;
		try {// local host , port �� ����
			serverSocket = new ServerSocket(port); // ���ε�
			
			System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��� �ֽ��ϴ�.");
			Socket socket = serverSocket.accept(); //  ���Ʈ
			// ������ ���� �Ϸ�� �κ� 
			
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip+"�����߽��ϴ�.");
			
			//Ŭ���̾�Ʈ�� TCP Ŀ�ؼ��� ��������鼭 Ŭ���̾�Ʈ�� ����� �� �ִ�
			//Socket ��ü�� �����ȴ�.
			
			// Ŭ���̾�Ʈ�κ��� �޽����� �޴´�
			
			InputStream in = socket.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(in);	
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(readLine);
			bw.newLine();
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		new EchoServer2(3002);
	}
}
