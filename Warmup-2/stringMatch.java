public int stringMatch(String a, String b) {
  int count = 0;
  int sz = Math.min(a.length(),b.length());
  
  for (int i=0;i<sz-1;i++) {
    if(a.substring(i,i+2).equals(b.substring(i,i+2))) count++;
  }
  
  return count;
}
