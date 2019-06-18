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
			//19 클라이언트 소켓객체를 생성한다
			socket = new Socket(ip,port);
			
			//22 서버와 TCP 커넥션이 만들어지면서 서버와 통신할 수 있는
			//Socket 객체가 생성된다.
			
			//25 서버에게 메세지를 보낸다
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("안녕하세요");
			bw.newLine();
			bw.flush();
			
			//26 서버로부터 메시지를 받는다.
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
