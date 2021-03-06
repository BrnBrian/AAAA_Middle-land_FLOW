




/*
scanner class

1. import: import java.util.Scanner;
2. define scanner
3. use Scanner method to achieve item. next() / nextXxx()
4. Scanner doesn't support char, go with String

*/


import java.util.Scanner;

class ScannerTest{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("Enter your name");
		String name = scan.next();
		System.out.println(name);

		System.out.println("Enter your weight(lbs)");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("Enter your marital status, Single(true/false)");
		boolean single = scan.nextBoolean();
		System.out.println(single);

		System.out.println("Enter your gender, M/F");
		String gender = scan.next();
		char genderChar = gender.charAt(0);//obtain char on poisiton 0
		System.out.println(genderChar);


	}
}
