public String front3(String str) {
  String temp;
  if(str.length()<3){
    temp = str;
  }else{
    temp = str.substring(0,3);
  }
  return temp+temp+temp;
}
