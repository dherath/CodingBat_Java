public String stringSplosion(String str) {
  String word ="";
  for (int i=0;i<str.length();i++) {
    word += str.substring(0,i+1);
  }
  return word;
}
