package codingbat;

public class FrontTimes {

  public String frontTimes(String str, int n) {
    StringBuffer stringBuffer = new StringBuffer();
    if (str.length() < 3) {
      for (int count = 0; count < n; count++) {
        stringBuffer.append(str);
      }
      return stringBuffer.toString();
    } else {
      String afterTrim = str.substring(0, 3);
      for (int count = 0; count < n; count++) {
        stringBuffer.append(afterTrim);
      }
      return stringBuffer.toString();
    }
  }
}
