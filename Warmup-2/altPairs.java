public String altPairs(String str) {
  String word = "";
  for (int i=0;i<str.length();i=i+4) {
    int end = i+2;
    if (end > str.length()) {
      end = str.length();
    }
    word += str.substring(i,end);
  }
  return word;
}
