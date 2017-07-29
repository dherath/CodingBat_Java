public int max1020(int a, int b) {
  int temp =a;
  if(temp<b){
    a=b;
    b=temp;
  }
  
  if(Math.abs(a-15)<=5) return a;
  if(Math.abs(b-15)<=5) return b;
  return 0;
}
