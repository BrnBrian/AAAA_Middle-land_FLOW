






/**
@Author: BrnBrian
@Version: Java8.0

*/

class IfTest2{
	public static void main(String[] args) {

//Exe1:
		int jackPot = (int)(Math.random() * 90 + 10);
		int drawNum = 20;
		int jack1 = jackPot / 10, jack2 = jackPot % 10;
		int draw1 = drawNum / 10, draw2 = drawNum % 10;

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
		double maleHeightInCentimeter = 169.0;
		double maleAssetInUSDollar = 1000;
		boolean maleIsGoodLooking = true;
		
		if(maleHeightInCentimeter <= 180.0 && maleAssetInUSDollar <= 10000000.0 && maleIsGoodLooking == false){
			System.out.println("Get out of my face!");
		}else if(maleHeightInCentimeter > 180.0 && maleAssetInUSDollar > 10000000.0 && maleIsGoodLooking == true){
			System.out.println("YES!!!!");
		}else{
			System.out.println("Fine.... No better one for me...");

		}

		
	}
}
