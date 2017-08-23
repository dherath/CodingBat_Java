public class fix45Order{
    // method works
    public int[] fix45(int[] nums) {
	int limit = nums.length;
	int i=0;
	while(i<limit-1){
	    if(nums[i]==4 && nums[i+1]!=5){
		int index = this.find5(nums);
		int temp = nums[i+1];
		nums[i+1]=nums[index];
		nums[index]=temp;
	    }else{
		i++;
	    }
	}
	return nums;
    }

    public int find5(int[] nums) {
	int index =0;
	boolean flag=false;
	if(nums[0]==5){
	    return index;
	}else{
	    index++;
	    while(index<nums.length && !flag) {
		if(nums[index]==5 && nums[index-1]!=4){
		    flag=true;
		}else{
		    index++;
		}
	    }
	}
	return index;
    }

}
 
