


import java.util.Scanner;


public class IfTest3{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);


		System.out.println("Enter you height in cm");
		double maleHeightInCentimeter = scan.nextDouble();
		System.out.println("Your height is " + maleHeightInCentimeter);

		System.out.println("Enter you total asset value in $");
		int maleAssetInUSDollar = scan.nextInt();
		System.out.println("Your total asset value is " + maleAssetInUSDollar);

		System.out.println("Are you good looking? Yes/No");
		String maleIsGoodLooking = scan.next();
		System.out.println("Are you good looking? " + maleIsGoodLooking);
		
		if(maleHeightInCentimeter <= 180.0 && maleAssetInUSDollar <= 10000000.0 && maleIsGoodLooking.equals("No")){
			System.out.println("Get out of my face!");
		}else if(maleHeightInCentimeter > 180.0 && maleAssetInUSDollar > 10000000.0 && maleIsGoodLooking.equals("Yes")){
			System.out.println("YES!!!!");
		}else{
			System.out.println("Girl: Fine.... No better one for me...");

		}
	}
}
