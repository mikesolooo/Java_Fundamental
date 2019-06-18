package java_20190614;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CoinCrawling_Upgrade {
	
	private String getKoreanDate(String date) { //date => "Jun 13,2019"
		String koreanDate = null;
		SimpleDateFormat from = new SimpleDateFormat(
				"MMM dd, yyyy",Locale.US);
		SimpleDateFormat to = new SimpleDateFormat(
				"yyyy³â MMM¿ù ddÀÏ",Locale.KOREAN);
		
		try {
			java.util.Date d = from.parse(date);
			koreanDate = to.format(d);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return koreanDate;
				
	}
}
