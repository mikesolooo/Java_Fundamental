package java_20190614;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args)  // 네트워크 같은 경우는 예외처리를 잘 안하고 throw한다
			throws UnknownHostException {
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.printf("호스트 이름 : %s %n",iaddr.getHostName()); // %n \n 의 차이있음. printf 에 맞는건 %n
		System.out.printf("호스트 IP: %s %n",iaddr.getHostAddress());
		
		InetAddress iaddr1 = InetAddress.getByName("naver.com");
		System.out.printf("호스트 이름 : %s %n",iaddr1.getHostName()); // %n \n 의 차이있음. printf 에 맞는건 %n
		System.out.printf("호스트 IP: %s %n",iaddr1.getHostAddress());
	}
}
