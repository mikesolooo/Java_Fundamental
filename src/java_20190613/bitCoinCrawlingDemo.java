package java_20190613;

import java.io.IOException;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class bitCoinCrawlingDemo {

	public static void main(String[] args) {
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20180614&end=20190613";

		// 전체 HTML 문서를 관리하기 위한 객체

		Document doc = null;

		try {
			// url 주소에 get방식으로 접근
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO: handle exception
		}
		// headElements는 타이틀 정보 가져오기 위한 Elements
		Elements headElements = doc.select(".table-responsive .table thead tr");
		// bodyElements는 실데이터 정보를 가져오기 위한 Elements
		Elements bodyElements = doc.select(".table-responsive .table tbody tr");

		for (int i = 0; i < headElements.size(); i++) {
			Element e = (Element) headElements.get(i);// Element => <tr>을 가리키는것
			String date = e.child(0).text(); // e.child(0) => <th>
			String open = e.child(1).text();
			String high = e.child(2).text();
			String low = e.child(3).text();
			String close = e.child(4).text();
			String volume = e.child(5).text();
			String marketCap = e.child(6).text();

			System.out.printf("%s\t\t%s\t%s\t%s\t%s\t\t%s\t\t%s\n", date, open, high, low, close, volume, marketCap);
		}

		for (int i = 0; i < bodyElements.size(); i++) {
			Element e = (Element) bodyElements.get(i);// Element => <tr>을 가리키는것
			String date = e.child(0).text(); // e.child(0) => <th>
			String open = e.child(1).text();
			String high = e.child(2).text();
			String low = e.child(3).text();
			String close = e.child(4).text();
			String volume = e.child(5).text();
			String marketCap = e.child(6).text();

			System.out.printf("%s\t%s\t%s\t%s\t%s\t\t%s\t%s\n", date, open, high, low, close, volume, marketCap);
		}
	}

}
