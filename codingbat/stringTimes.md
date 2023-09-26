public String stringTimes(String str, int n) {
    StringBuffer stringBuffer = new StringBuffer();
    for(int count = 0;count < n; count++){
      stringBuffer.append(str);
    }
    return stringBuffer.toString();
}
