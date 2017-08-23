public class testLinearInProblem extends linearInProblem{
    public static void main(String args[]) {
	//	int[] temp1 = {1,4,1,5,5,4,1};
	int[] temp1 = {1,2,4,6};
	int[] temp2 = {2,4};

	linearInProblem func = new linearInProblem();

	boolean out1 = func.linearIn(temp1,temp2);
	System.out.println("Obtained answer = "+ out1);
	System.out.println("Actual answer = true");
    }
}
