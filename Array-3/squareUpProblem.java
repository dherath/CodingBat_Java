public class squareUpProblem{
    public int[] squareUp(int n) {
	int[] output = new int[n*n];
	int[] temp = new int[n];

	for(int i=0;i<n;i++){
	    temp = fillSection(i,n);
	    for(int j=0;j<n;j++){
		output[i*j+j]=temp[j];
	    }
	}
	return output;
  
    }

    public int[] fillSection(int index,int size){
	int[] nums = new int[size];
	for(int i=0;i<size;i++) {
	    nums[i]=0;
	}
	
	for(int i=size-1;i>index;i--){
	    nums[i]=i;
	}

	return nums;
    }
}
