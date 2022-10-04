//Name: Semih
//Surname: Bağ
//instagram:smhbag

//Problem:
//Write a program that prompts the user to enter the year, month, the day of the month and displays  day
//of the week (Monday,Thuesday.....)

//The formula:
//Day = ((day of month) + (26*(month + 1))/10 + y + y/4 + c/4 + 5*c) % 7        y: year, c:century
//Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user 
//input 1 to 13 and 2 to 14 for the month and change the year to the previous year.

//Add Scanner
import java.util.Scanner;
public class HW2_150120070_P2 {

	public static void main(String[] args) {
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Promp the user to enter year
		System.out.print("Enter year (e.g. 2012):");
		int year = input.nextInt();
		
		//Promp the user to enter month
		System.out.print("Enter month (e.g. 1-12):");
		int month = input.nextInt();
		
		//Promp the user to enter day of the month
		System.out.print("Enter the day of the month (e.g. 1-31):");
		int dayOfMonth = input.nextInt();

		//Check and convert the month 
		/*January and February are counted as 13 and 14 in the formula, so you need to convert the user
		input 1 to 13 and 2 to 14 for the month and change the year to the previous year*/
		month = (month==1)? 13:month;
		month = (month==2)? 14:month;
		year = ((month==13)||(month==14))? (year-1):year;

		//Find century
		int c = year / 100; //c:century
		
		//Find the year of century
		int y = year % 100; //y:the year of the century
		
		//Find the day of week with formula
		int dayOfWeek = (dayOfMonth + (26*(month + 1))/10 + y + y/4 + c/4 + 5*c) % 7;
		
			//Switch structure for day
			switch (dayOfWeek) {
				case 0:
					System.out.println("Day of week is Saturday.");
					break;
				case 1:
					System.out.println("Day of week is Sunday.");
					break;		
				case 2:
					System.out.println("Day of week is Monday.");
					break;
				case 3:
					System.out.println("Day of week is Tuesday.");
					break;
				case 4:
					System.out.println("Day of week is Wednesday.");
					break;
				case 5:
					System.out.println("Day of week is Thursday.");
					break;
				case 6:
					System.out.println("Day of week is Friday.");
					break;
			}	
			
	}
	
}
