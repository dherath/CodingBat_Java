public String stringX(String str) {
  String word = "";
  for(int i=1;i<str.length()-1;i++) {
    if (str.charAt(i) !='x') word += str.charAt(i);
  }
  if (str.length()<2) return str;
  return str.charAt(0) + word + str.charAt(str.length()-1);
}
