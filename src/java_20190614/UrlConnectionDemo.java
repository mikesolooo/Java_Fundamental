package java_20190614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL(
				"https://sports.news.naver.com/wbaseball/index.nhn");
		URLConnection urlCon = url.openConnection();
		
		String server = urlCon.getHeaderField("server");
		String cacheControl = urlCon.getHeaderField("Cache-Control");
		String expires = urlCon.getHeaderField("Expires");
		String contentType = urlCon.getHeaderField("Content-Type");
		String location = urlCon.getHeaderField("Location");
		String connection = urlCon.getHeaderField("Connection");
		String setCookie = urlCon.getHeaderField("Set-Cookie");
		int len = urlCon.getContentLength();
		
		System.out.println("server : "+server);
		System.out.println("Cache-Control : "+cacheControl);
		System.out.println("Expires : "+expires);
		System.out.println("Content-Type : "+contentType);
		System.out.println("Location : "+location);
		System.out.println("Connection : "+connection);
		System.out.println("Set-Cookie : "+setCookie);
		System.out.println("length : "+len);
		
		InputStream in = urlCon.getInputStream();
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(in,"utf-8"));
		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		
	}
	}
}
