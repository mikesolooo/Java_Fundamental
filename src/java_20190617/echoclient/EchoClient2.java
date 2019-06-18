package java_20190617.echoclient;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class EchoClient2 {
	private String ip;
	private int port;
	private Socket socket;
	
	
	
	public EchoClient2(String ip , int port) {
		// TODO Auto-generated constructor stub
		this.ip= ip;
		this.port = port;
		
		try {
			socket = new Socket(ip,port);
			
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("¿ì¾Ó");
			bw.newLine();
			bw.flush();
			
			InputStream in = socket.getInputStream();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		new EchoClient2("127.0.0.1", 3001);
	}
}
