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
			serverSocket = new ServerSocket(port); //7 ServerSocket 객체를 생성한다.
			
			System.out.println("클라이언트 접속을 기다리고 있습니다.");
			// ServerSocket의 accept() 메서드로 클라이언트 접속을 대기한다.
			Socket socket = serverSocket.accept(); //10 
			
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip+"접속했습니다.");
			
			// 클라이언트와 TCP 컨넥션이 만들어지면서 클라이언트와 통신할 수 있는
			// Socket 객체가 생성된다.
			
			//23 클라이언트로부터 메시지를 받는다
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
		new EchoServer1(3001); // 1. 3001 은 포트번호
	}
}
