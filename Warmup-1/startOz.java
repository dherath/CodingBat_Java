public String startOz(String str) {
  String word = "";
  if (str.length() >=1 && str.charAt(0)=='o') {
    word = word + str.charAt(0);
  }
  if (str.length() >=2 && str.charAt(1)=='z') {
    word = word + str.charAt(1);
  }
  
  return word;
}
