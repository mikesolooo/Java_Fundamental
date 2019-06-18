package java_20190614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL(
				"https://search.shopping.naver.com/search/category.nhn?spec=M10005212%7CM10029065&pagingIndex=1&pagingSize=40&viewType=list&sort=rel&cat_id=50000830&frm=NVSHATT");
					String protocol=url.getProtocol();
					String host = url.getHost();
					int port = url.getPort();
					String path= url.getPath();
					String query = url.getQuery();
					String ref = url.getRef();
					
					System.out.println("protocol : "+protocol);
					System.out.println("host : "+host);
					System.out.println("port : "+port);
					System.out.println("path : "+path);
					System.out.println("query : "+ query);
					System.out.println("ref : "+ref);
					
					InputStream in = url.openStream();
					
					BufferedReader br = new BufferedReader(
							new InputStreamReader(in,"utf-8"));
					String readLine = null;
					while ((readLine = br.readLine()) != null) {
						System.out.println(readLine);
					}
					
					
	}
}
