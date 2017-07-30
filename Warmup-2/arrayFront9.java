public boolean arrayFront9(int[] nums) {
  
  int sz = 4;
  if(nums.length<4) sz=nums.length;
  
  for(int i=0;i<sz;i++) {
    if(nums[i]==9){
      return true;
    }
  }
  return false;
}
