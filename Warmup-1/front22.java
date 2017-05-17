public String front22(String str) {
  String temp;
  if (str.length()<2){
    temp = str;
  }else{
    temp = str.substring(0,2);
  }
  return temp+str+temp;
}
