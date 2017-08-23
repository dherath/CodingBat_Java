public class testSquareUpProblem extends squareUpProblem{
    public static void main(String args[]){
	int temp = 3;
	squareUpProblem test = new squareUpProblem();
	int[] out = test.squareUp(temp);

	System.out.print("[");
	for(int t:out){
	    System.out.print(" "+t);
	}
	System.out.println(" ]");
    }
}
