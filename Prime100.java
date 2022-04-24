









/**
Author: Brnnn
Version: JDK8.0


*/

//answer 2: efficient way
class  Prime100{
	public static void main(String[] args) {
		
		boolean tag = true;//tag i % j == 0


		//acquire the current time difference(ms) from 1970-01-01 00:00:00
		long startTime = System.currentTimeMillis();
		int countP = 0;
		for (int i = 2;i <= 100000;i++ ){
			//boolean tag = true;(option2)
			for (int j = 2;j <= Math.sqrt(i);j++){
								//mainly target the i of i%j != 0
								//3: 0.653s
				if (i % j == 0){
					tag = false;
					break;//only target on i of i%j == 0 to reduce time cost
					//1: 13.595s; 1.1: 0.116s
					//2: 1.703s; 2.2£º0.001s
				}
			}
			if (tag == true){
				countP++;
				//System.out.println(i); increase time cost
			}
			//reset tag(option1)
			tag = true;
	}
	long endTime = System.currentTimeMillis();
	System.out.println("The total number of prime is " + countP);
	System.out.println("Time difference is " + (endTime - startTime));
	}
}

	/*	
	answer 1:
	boolean tag = true;//tag i % j == 0

		for (int i = 2;i < 101;i++ ){
			//boolean tag = true;(option2)
			for (int j = 2;j < i;j++){
				if (i % j == 0){
					tag = false;
				}
			}
			if (tag == true){
				System.out.println(i);
			}
			//reset tag(option1)
			tag = true;

		}

		*/
