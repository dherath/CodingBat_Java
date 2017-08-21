
public class fix34Order{
    public int[] fix34(int[] nums) {
	int[] indexOf3 = findLocation(nums,3);
	int[] indexOf4 = findLocation(nums,4);
	for(int j=0;j<noOf3s(nums);j++){
	    int temp = nums[indexOf3[j]+1];
	    nums[indexOf3[j]+1]=nums[indexOf4[j]];
	    nums[indexOf4[j]]=temp;
	}
	return nums;
    }

    public int[] findLocation(int[] array,int number) {
	int count = 0;
	int[] index = new int[noOf3s(array)];
	for(int i=0;i<array.length;i++){
	    if(array[i]==number){
		index[count]=i;
		count++;
	    }
	}
	return index;

    }

    public int noOf3s(int[] array){
	int count =0;
	for(int temp:array) {
	    if(temp==3){
		count++;
	    }
	}
	return count;
    }
}
