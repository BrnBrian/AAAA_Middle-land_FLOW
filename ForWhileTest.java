




/**

Author: Brnnn
Version: JDK 8.0


*/


import java.util.Scanner;

class ForWhileTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int countM = 0;//count minus
		int countP = 0;//count plus

		while (true){

			int num = scan.nextInt();
			if (num > 0){
				countP++;
			}else if (num < 0 ){
				countM++;
			}else{
				break;
		}


	}
		System.out.println("Minus: " + countM);
		System.out.println("Plus: " + countP);
	}
}
