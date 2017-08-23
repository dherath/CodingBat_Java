public class testFix45Order extends fix45Order{
    public static void main(String args[]) {
	//	int[] temp1 = {1,4,1,5,5,4,1};
	int[] temp1 = {5,4,5,1,4,3};
	int[] temp2 = {1,4,1,5,3};

	fix45Order func = new fix45Order();

	System.out.print("old array [");
	for(int val:temp1){
	    System.out.print(val+" ");
	}
	System.out.println("]");

	int[] out1 = func.fix45(temp1);
	System.out.print("new array [");
	//int[] out1 = func.fix34Order(temp1);
	for(int val:out1){
	    System.out.print(val+" ");
	}
	System.out.println("]");
	
    }
}
