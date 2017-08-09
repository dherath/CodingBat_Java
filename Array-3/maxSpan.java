public int maxSpan(int[] nums) {
  int count =0;
  for (int i=0;i<nums.length;i++) {
    int tempCount = nums.length-i;
    for (int j=nums.length-1;j>i;j--) {
      if(nums[j]==nums[i]){
        break;
      }else{
        tempCount--;
      }
    }
    if (tempCount >= count) {
      count = tempCount;
    }
  }
  return count;
}
