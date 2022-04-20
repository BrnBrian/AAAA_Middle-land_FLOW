
/**

Author: Brnnnn
Version: JDK8.0

*/






import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = 7;
		int x = 100;

		switch (a){

		case 1:
			x += 5;
			System.out.println(x += 5);
			break;
		
		case 2:
			x += 10;
			System.out.println(x);
			break;
		
		case 3:
			x += 16;
			System.out.println(x);
			break;

		default:
			x += 34;
			System.out.println(x);
			break;
		
		}

		int yourDraw = scan.nextInt();


		System.out.println("It's " + yourDraw);

		int sum1 = 0;
		for (int num1 = 0;num1 <= 100;num1++){
			if (num1 % 2 != 0){
				sum1 += num1;
				System.out.println(num1);
			}
		}

		System.out.println("The sum is " + sum1);


//exe 2:


		System.out.print("Enter int m: ");
		int m = scan.nextInt();

		System.out.print("Enter int n: ");
		int n = scan.nextInt();

		int min = (m < n)? m : n;

		for (int div = min;div >=1 ;div--){
			if (m % div == 0 && n % div == 0){
				System.out.println("The max div is " + div);
				break;//break, in order to select the first valid value

			}
		}

		int max = (m > n)? m : n;
		int mn = m * n;
		for (int multi = max ;multi <= mn;multi++){
			if (multi % m == 0 && multi % n == 0){
				System.out.println("The min multi is " + multi);
				break;
			}
		}

		// exe3.1:
		System.out.println("exe3.1:");
		int sumJ = 0;
		for (int numX = 1;numX < 101;numX++){
			if (numX % 2 != 0){
				sumJ += numX;
			}
		}
		System.out.println("The SUM J is " + sumJ);

		//exe3.2:
		System.out.println("exe3.2:");
		int count7 = 0;
		int sum7 = 0;
		for (int numY = 1;numY <=100;numY++){
			if (numY % 7 == 0){
				count7 += 1;
				sum7 += numY;
			}
		}
		System.out.println("The total QTY is " + count7);
		System.out.println("The sum of 7multi is " + sum7);

		//exe3.3:
		System.out.println("exe3.3:");
		int countSXH = 0;
		for (int sxh = 100;sxh < 1000;sxh++){
			int h = sxh / 100;
			int s = (sxh % 100) / 10;
			int g = sxh % 10;
			if (sxh == h*h*h + s*s*s + g*g*g){
				countSXH += 1;
				System.out.println(sxh);
			}
		}
		System.out.println("The total number is " + countSXH);






	}
}
