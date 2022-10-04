//Name: Semih
//Surname: Bağ
//instagram: @smhbag

//Problem:
//Write a program that checks ISBN-10. An ISBN-10 (International Standard Book Number) consists of 10 
//digits: ABCDEFKLMN. The last digit, Z, is a checksum, which is calculated from the other nine digits 
//using the following formula:
//((A*1) + (B*2) + (C*3) +(D*4) + (E*5) + (F*6) + (K*7) + (L*8) +( M*9))%11

//If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a 
//program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including 
//leading zeros). Your program should read the input as an integer.

//Add Scanner	
import java.util.Scanner;	
public class HW2_150120070_P1 {

	public static void main(String[] args) {
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Promp the user to enter 9 digits of ISBN-10
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		int isbn9 = input.nextInt();		
		
		//Find the digits
		//Digit order is left to right(digit1 to digit10)
		int digit1 = isbn9 /(int)(Math.pow(10, 8));
		isbn9 -= digit1* Math.pow(10, 8);
			
		int digit2 = isbn9 /(int)(Math.pow(10, 7));
		isbn9 -= digit2* Math.pow(10, 7);
	
			
		int digit3 = isbn9 /(int)(Math.pow(10, 6));
		isbn9 -= digit3* Math.pow(10, 6);
	
			
		int digit4 = isbn9 /(int)(Math.pow(10, 5));
		isbn9 -= digit4* Math.pow(10, 5);
			
			
		int digit5 = isbn9 /(int)(Math.pow(10, 4));
		isbn9 -= digit5* Math.pow(10, 4);
			
			
		int digit6 = isbn9 /(int)(Math.pow(10, 3));
		isbn9 -= digit6* Math.pow(10, 3);
			
			
		int digit7 = isbn9 /(int)(Math.pow(10, 2));
		isbn9 -= digit7* Math.pow(10, 2);
			
			
		int digit8 = isbn9 /(int)(Math.pow(10, 1));
		isbn9 -= digit8* Math.pow(10, 1);
			
		int digit9 = isbn9; 
			
		//Find the 10th digit with formula	
		int digit10 = ((digit1*1)+(digit2*2)+(digit3*3)+(digit4*4)+(digit5*5)+(digit6*6)+(digit7*7)+(digit8*8)+(digit9*9))%11;
		
		//Check is the 10th digit's value 10
		if (digit10 == 10) {
			//Display result
			System.out.println("The ISBN-10 number is:"+digit1+digit2+digit3+digit4+digit5+digit6+digit7+digit8+digit9+"X");					
		}
		else {
			//Display result
			System.out.println("The ISBN-10 number is:"+digit1+digit2+digit3+digit4+digit5+digit6+digit7+digit8+digit9+digit10);							
		}
		
	}

}
