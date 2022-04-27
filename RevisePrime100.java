

















class  RevisePrime100{
	public static void main(String[] args) {
		


		//acquire the current time difference(ms) from 1970-01-01 00:00:00
		long startTime = System.currentTimeMillis();
		int countP = 0;
		label:for (int i = 2;i <= 100000;i++ ){

			for (int j = 2;j <= Math.sqrt(i);j++){
								//mainly target the i of i%j != 0
								
				if (i % j == 0){
					continue label;
		
				}
			}

			//prime number gets here
			countP++;
				//System.out.println(i); increase time cost
			
	}
	long endTime = System.currentTimeMillis();
	System.out.println("The total number of prime is " + countP);
	System.out.println("Time difference is " + (endTime - startTime));
	}
}