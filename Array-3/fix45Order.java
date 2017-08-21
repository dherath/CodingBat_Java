public class fix45Order{

    public int[] fix45(int[] nums) {
	int[] IndexOf4 = this.findIndex(nums,4);
	int[] IndexOf5 = this.findIndex(nums,5);
	int limit = this.find4s(nums);
	for(int i=0;i<limit;i++) {
	    int temp = nums[IndexOf4[i]+1];
	    nums[IndexOf4[i]+1]=nums[IndexOf5[i]];
	    nums[IndexOf5[i]]=temp;
	}
	return nums;
    }

    public int find4s(int[] array) {
	int count =0;
	for(int temp:array) {
	    if(temp==4){
		count++;
	    }
	}
	return count;
    }

    public int[] findIndex(int[] array, int number) {
	int[] index = new int[this.find4s(array)];
	int count =0;
	for(int i=0;i<array.length;i++) {
	    if(array[i]==number){
		index[count]=i;
		count++;
	    }
	}
	return index;
    }
    
}
