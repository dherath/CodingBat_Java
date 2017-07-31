public String stringYak(String str) {
  String word = "";
  for(int i=0;i<str.length();i++) {
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') i=i+2;
    else word += str.charAt(i);
  }
  return word;
}
