class testCanBalance extends canBalance {
	public static void main(String[] args) {
		int[] temp = {2,1,1,1,4};
		int[] temp2 = {1,1,1,1,4};
		canBalance func = new canBalance();
		System.out.println(func.canBalance(temp));//should come fasle
		System.out.println(func.canBalance(temp2));//should come true
	}
}