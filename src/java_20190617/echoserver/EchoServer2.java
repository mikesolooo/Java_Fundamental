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
	private ServerSocket serverSocket; // 서버소켓
	public EchoServer2(int port) {
		this.port = port;
		try {// local host , port 에 저장
			serverSocket = new ServerSocket(port); // 바인드
			
			System.out.println("클라이언트 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept(); //  어셉트
			// 소켓이 접속 완료된 부분 
			
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip+"접속했습니다.");
			
			//클라이언트와 TCP 커넥션이 만들어지면서 클라이언트와 통신할 수 있는
			//Socket 객체가 생성된다.
			
			// 클라이언트로부터 메시지를 받는다
			
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
