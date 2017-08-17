public class fix34Order{
    public int[] fix34(int[] nums) {
	int indexOf3 = findLocation(nums,3);
	int indexOf4 = findLocation(nums,4);
	System.out.println("index of 3 = "+indexOf3+" index of 4 = "+indexOf4);
	for (int i=indexOf4; i>indexOf3;i--){
	    int temp = nums[i-1];
	    nums[i-1] = nums[i];
	    nums[i]=temp;
	}
	return nums;
    }

    public int findLocation(int[] array,int number) {
	int temp = array[0];
	int index = 0;
	while(temp != number && index<=array.length) {
	    index++;
	    temp = array[index];
	}
	return index;
    }
    
}
