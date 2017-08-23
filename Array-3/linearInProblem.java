public class linearInProblem{
    // works
   public  boolean linearIn(int[] outer,int[] inner) {
	for(int innerVal : inner){
	    if(!this.insideChecker(innerVal,outer)){
		return false;
	    }
	}
	return true;
    }

    public boolean insideChecker(int innerNum,int[] outer) {
	for(int temp:outer) {
	    if(temp==innerNum) {
		return true;
	    }
	}
	return false;
    }
}
