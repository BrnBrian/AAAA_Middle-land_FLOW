


/**
Author: Brnnn
Version: Java8.0

*/


import java.util.Scanner;

public class SwitchCaseTest2{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//exe1:
		System.out.println("Enter the current year:");
		int currentYear = scan.nextInt();		
		System.out.println("Enter the current month:");
		int currentMonth = scan.nextInt();
		System.out.println("Enter the current day:");
		int currentDay = scan.nextInt();
		
		int sumDays = 0;

		switch (currentMonth){
		case 12:
			sumDays += 30;
		case 11:
			sumDays += 31;
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			//year check
			if ((currentYear % 4 == 0 && currentYear % 100 != 0) || currentYear % 400 == 0){
			sumDays += 29;
			}else{
			sumDays += 28;
			}

		case 2:
			sumDays += 31;
		case 1:
			sumDays += currentDay;
		System.out.println("It's the NO." + sumDays + " day in year " + currentYear);
		
		}

//exe2:

		System.out.print("Enter your score of the final exam:");
		int score = scan.nextInt();

		/* option1:
		if (score >= 90){
			System.out.print("Tier: A");
		}else if (score >= 70){
			System.out.print("Tier: B");
		}else if (score >= 60){
			System.out.print("Tier: C");
		}else{
			System.out.print("Tier: Sucker");
		}
		*/
		switch (score / 10){
		case 10:
		case 9:
			System.out.println("Tier: A");
			break;
		
		case 8:
		case 7:
			System.out.println("Tier: B");
			break;

		case 6:
			System.out.println("Tier: C");
			break;

		default:
			System.out.println("Tier: D");
			break;
		}

//exe3:
		System.out.print("Enter the year to find out the Chinese Zodiac:");
		int year = scan.nextInt();

		switch ((year + 9) % 12){
		case 1:
			System.out.println("Rat");
			break;
		case 2:
			System.out.println("Ox");
			break;
		case 3:
			System.out.println("Tiger");
			break;
		case 4:
			System.out.println("Rabbit");
			break;
		case 5:
			System.out.println("Dragon");
			break;
		case 6:
			System.out.println("Snake");
			break;
		case 7:
			System.out.println("Horse");
			break;
		case 8:
			System.out.println("Sheep");
			break;
		case 9:
			System.out.println("Monkey");
			break;
		case 10:
			System.out.println("Rooster");
			break;
		case 11:
			System.out.println("Doggy");
			break;
		case 0:
			System.out.println("Piggy");
			break;		
		}

	}
}
