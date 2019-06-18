package java_20190613;

//���̹� ĸ�� API ���� - �Է°� ��
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIExamCaptchaNkeyResult {

 public static void main(String[] args) {
     String clientId = "ITrorCsdzoEn3Prg0_G_";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
     String clientSecret = "A6UyBVjt1e";//���ø����̼� Ŭ���̾�Ʈ ��ũ����";
     try {
         String code = "1"; // Ű �߱޽� 0,  ĸ�� �̹��� �񱳽� 1�� ����
         String key = "uMmlLKrIEMihFAxB"; // ĸ�� Ű �߱޽� ���� Ű��
         String value = "USER_VALUE"; // ����ڰ� �Է��� ĸ�� �̹��� ���ڰ�
         String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code +"&key="+ key + "&value="+ value;

         URL url = new URL(apiURL);
         HttpURLConnection con = (HttpURLConnection)url.openConnection();
         con.setRequestMethod("GET");
         con.setRequestProperty("X-Naver-Client-Id", clientId);
         con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
         int responseCode = con.getResponseCode();
         BufferedReader br;
         if(responseCode==200) { // ���� ȣ��
             br = new BufferedReader(new InputStreamReader(con.getInputStream()));
         } else {  // ���� �߻�
             br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
         }
         String inputLine;
         StringBuffer response = new StringBuffer();
         while ((inputLine = br.readLine()) != null) {
             response.append(inputLine);
         }
         br.close();
         System.out.println(response.toString());
     } catch (Exception e) {
         System.out.println(e);
     }
 }
}