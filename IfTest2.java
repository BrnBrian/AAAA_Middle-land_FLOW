






/**
@Author: BrnBrian
@Version: Java8.0

*/
import java.util.Scanner;

public class IfTest2{
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

//Exe1:

		System.out.println("Draw your 2 lucky number");
		int luckyNumber = scan.nextInt();
		System.out.println("Your lucky number is " + luckyNumber);

		int jackPot = (int)(Math.random() * 90 + 10);

		int jack1 = jackPot / 10, jack2 = jackPot % 10;
		int draw1 = luckyNumber / 10, draw2 = luckyNumber % 10;

		System.out.println("JackPot is " + jackPot);

		if(draw1 == jack1 && draw2 == jack2){
			System.out.println("Hit jackpot, Win $10K");

		}else if(draw1 == jack2 && draw2 == jack1){
			System.out.println("Hit bigpot, Win $3K");
		
		}else if(draw1 == jack1 || draw2 == jack2){
			System.out.println("Hit smallpot, Win $1K");

		}else if(draw1 == jack2 || draw2 == jack1){
			System.out.println("Hit minipot, Win $500");

		}else{
			System.out.println("Hit $hit");
		}

//Exe2:

		System.out.println("Enter you height in cm");
		double maleHeightInCentimeter = scan.nextDouble();
		System.out.println("Your height is " + maleHeightInCentimeter);

		System.out.println("Enter you total asset value in $");
		int maleAssetInUSDollar = scan.nextInt();
		System.out.println("Your total asset value is " + maleAssetInUSDollar);

		System.out.println("Are you good looking? true/false");
		boolean maleIsGoodLooking = scan.nextBoolean();
		System.out.println("Are you good looking " + maleIsGoodLooking);
		
		if(maleHeightInCentimeter <= 180.0 && maleAssetInUSDollar <= 10000000.0 && maleIsGoodLooking == false){
			System.out.println("Get out of my face!");
		}else if(maleHeightInCentimeter > 180.0 && maleAssetInUSDollar > 10000000.0 && maleIsGoodLooking == true){
			System.out.println("YES!!!!");
		}else{
			System.out.println("Girl: Fine.... No better one for me...");

		}

		
	}
}
