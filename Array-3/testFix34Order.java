public class testFix34Order extends fix34Order{
    public static void main(String args[]) {
	int[] temp1 = {1,2,3,5,6,4,3};
	int[] temp2 = {5,6,5,3,6,4,1};

	fix34Order func = new fix34Order();

	System.out.print("old array [");
	for(int val:temp1){
	    System.out.print(val+" ");
	}
	System.out.println("]");

	int[] out1 = func.fix34(temp1);
	System.out.print("new array [");
	//int[] out1 = func.fix34Order(temp1);
	for(int val:out1){
	    System.out.print(val+" ");
	}
	System.out.println("]");
    }
}
