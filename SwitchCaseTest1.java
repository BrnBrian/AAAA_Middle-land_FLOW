
/**

@Author: Brnnnn

@Java8.0


*/


import java.util.Scanner;


public class SwitchCaseTest1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int bummer = 2;
		switch(bummer){
		
		case 0:
			System.out.println("Zero");
			break;

		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;

		case 3:
			System.out.println("Three");
			break;

		default:
			System.out.println("other");
			break;
		}


		String season = "summer";
		switch (season) {
		case "spring":
			System.out.println("´ºÅ¯»¨¿ª");
			break;
		case "summer":
			System.out.println("ÏÄÈÕÑ×Ñ×");
			break;
		case "autumn":
			System.out.println("Çï¸ßÆøË¬");
			break;
		case "winter":
			System.out.println("¶¬Ñ©°¨°¨");
			break;
		default:
			System.out.println("¼¾½ÚÊäÈëÓÐÎó");
			break; 
		}
//1.
		System.out.println("Enter any of abcde");
		String word = scan.next();
		char c = word.charAt(0);
		switch(c) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		case 'e':
			System.out.println("E");
			break;
		default:
			System.out.println("others");
			break; 
		}

//2.
		System.out.println("Enter your exam score:");
		int score = scan.nextInt();
		switch (score / 20){
		case 0:
		case 1:
		case 2:
			System.out.println("Fail");
			break;	
		default:
			System.out.println("Pass");
			break;	
		}
//3.
		System.out.println("Enter the current month number:");
		int month = scan.nextInt();
		switch (month){

		case 3:
		case 4:
		case 5:
			System.out.println("It's Spring");
			break;	

		case 6:
		case 7:
		case 8:
			System.out.println("It's Summer");
			break;	
		
		case 9:
		case 10:
		case 11:
			System.out.println("It's Autumn");
			break;	

		case 12:
		case 1:
		case 2:
			System.out.println("It's Snowboarding");
			break;	
		}

//4.
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
			sumDays += 28;
		case 2:
			sumDays += 31;
		case 1:
			sumDays += currentDay;
		System.out.println("It's the NO." + sumDays + " day" );

		}
		
		
		
/* answer2?
		switch (currentMonth){
		case 3:
			System.out.println("It's the NO." + ((currentMonth - 1)*30 + currentDay) + "day" );
			break;	

		case 1:
		case 4:
		case 5:
			System.out.println("It's the NO." + ((currentMonth-1)*30 + currentDay) + "day" );
			break;	

		case 2:
		case 6:
		case 7:
			System.out.println("It's the NO." + ((currentMonth + 1)*30 + currentDay) + "day" );
			break;		

		case 9:
		case 10:
			System.out.println("It's the NO." + ((currentMonth + 3)*30 + currentDay) + "day" );
			break;	

		case 11:
		case 12:
			System.out.println("It's the NO." + ((currentMonth + 4)*30 + currentDay) + "day" );
			break;	
		}
*/
	}
}
