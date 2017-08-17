public boolean canBalance(int[] nums) {
  for(int i=0;i<nums.length-1;i++){
    int sum1 = findSum(Arrays.copyOfRange(nums,0,i));
    int sum2 = findSum(Arrays.copyOfRange(nums,i+1,nums.length-1));
    if (sum1==sum2) {
      return true;
    }
  }
  return false;
}

public int findSum(int[] array) {
  int sum = 0;
  for(int temp:array){
    sum += temp;
  }
  return sum;
}