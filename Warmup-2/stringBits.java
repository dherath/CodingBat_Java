public String stringBits(String str) {
  String word ="";
  for(int i=0;i<str.length();i++) {
    if(i%2==0){
      word += str.charAt(i);
    }
  }
  return word;
}
