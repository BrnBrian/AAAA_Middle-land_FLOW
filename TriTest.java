







class  TriTest{
	public static void main(String[] args) {

		int x = 13;
		int y = 13;
		int z = 13;

		String maxNum1 = (x > y)? ((x > z)? "x larger" : "z larger"):((x == y)? ((y > z)? "x=y larger" : "z larger") : ((y > z)? "y larger" : "z larger"));
		System.out.println(maxNum1);

		int m = 14;
		int n = 13;
		int o = 17;

		int max1 = (m > n)? m : n;
		int max2 = (max1 > o)? max1 : o;
		System.out.println(max2);




	}
}
