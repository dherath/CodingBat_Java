public String frontTimes(String str, int n) {
  int index = 3;
  if(index > str.length()) {
    index = str.length();
  }
  String front = str.substring(0,index);
  String word ="";
  for(int i=0;i<n;i++){
    word += front;
  }
  return word;
}
