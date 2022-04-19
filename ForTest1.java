


/**
Author: Brnnnn
Version:JDK8.0

*/

/*
"for" structure

for(1;2;4){
	3
}
execute: 1-2-3-4-2-3-4-2-3-4-....-2






*/

public class ForTest1{
	public static void main(String[] args) {

		for (int i = 1;i <= 2 ;i++){

			System.out.println("Hello World!"+i);
		}



//exe1:
		int sum = 0;//sum
		int count = 0;//counts
		for (int n = 0;n <= 100;n++){

			if (n % 2 == 0){
				System.out.println(n);
				sum += n;
				count += 1;
			}

		}

		System.out.println("SUM is " + sum + ", QTY is " + count);
 


		for(int num2 = 1;num2 <= 150;num2++){
			System.out.print(num2 + ": ");
			

			if(num2 % 3 == 0){
				System.out.print("foo ");

			}
			
			if(num2 % 5 == 0){
				System.out.print("biz ");

			}
			
			if(num2 % 7 == 0){
				System.out.print("baz ");
			}
			System.out.println();
		}


	}
}
