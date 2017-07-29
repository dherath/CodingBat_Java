public int close10(int a, int b) {
  int v1,v2;
  v1 = Math.abs(10-a);
  v2= Math.abs(10-b);
  if(v1==v2){
    return 0;
  }else if(v1>v2){
    return b;
  }else{
    return a;
  }
}
