public String everyNth(String str, int n) {
  String word ="";
  for(int i=0;i<str.length();i++){
    if(i%n==0){
      word += str.charAt(i);
    }
  }
  return word;
}
