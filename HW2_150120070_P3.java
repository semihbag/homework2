//Name: Semih
//Surname: Bað
//instagram:@smhbag

//Problem:
//Write a program that calculates personal income tax based on the given tax rates reported by The 
//Turkish Revenue Administration.
//Tax rates vary from year to year and by income

//Add Scanner
import java.util.Scanner;

public class HW2_150120070_P3 {

	public static void main(String[] args) {
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Get the year from user
		//System.out.print("Please enter year:");
		int year = input.nextInt();
		
		//Get the income from user
		//System.out.print("Please enter your income:");
		double income = input.nextDouble();
		
		double taxRate = 0; //Defining tax rate
		double taxAmount = 0;
		double incomeAfterTax = 0; //Defining income after the tax
		double realTax = 0; // Defining real tax rate
		
		//Check is income < 0  
		if (income > 0) {
			
			//Year states and computing the tax rate, tax amount, income after tax, real tax
			if (year == 2020) {
				if (income < 22000) {
					taxRate = 15;
					taxAmount = (income) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				}
				else if (income < 49000) {
					taxRate = 20;
					taxAmount = 3300 + (income - 22000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if (income < 180000) {
					taxRate = 27;
					taxAmount = 8700 + (income - 49000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if (income < 600000) {
					taxRate = 35;
					taxAmount = 44070 + (income - 180000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if(income >= 600000) {
					taxRate = 40;
					taxAmount = 191070 + (income - 600000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				}
			}
			else if (year == 2019) {
				if (income < 18000) {
					taxRate = 15;
					taxAmount = (income) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				}
				else if (income < 40000) {
					taxRate = 20;
					taxAmount = 2700 + (income - 18000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if (income < 148000) {
					taxRate = 27;
					taxAmount = 7100 + (income - 40000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if (income < 500000) {
					taxRate = 35;
					taxAmount = 36260 + (income - 148000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if(income >= 500000) {
					taxRate = 40;
					taxAmount = 159460 + (income - 500000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				}
			}
			else if (year == 2018) {
				if (income < 14800) {
					taxRate = 15;
					taxAmount = (income) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				}
				else if (income < 34000) {
					taxRate = 20;
					taxAmount = 2220 + (income - 14800) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if (income < 120000) {
					taxRate = 27;
					taxAmount = 6060 + (income - 34000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if(income >= 120000) {
					taxRate = 35;
					taxAmount = 29280 + (income - 120000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				}
			}
			else if (year == 2017){
				if (income < 13000) {
					taxRate = 15;
					taxAmount = (income) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				}
				else if (income < 30000) {
					taxRate = 20;
					taxAmount = 1950 + (income - 13000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if (income < 110000) {
					taxRate = 27;
					taxAmount = 5350 + (income - 30000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				} 
				else if(income >= 110000) {
					taxRate = 35;
					taxAmount = 26950 + (income - 110000) * (taxRate) / 100;
					incomeAfterTax = income - taxAmount;
					realTax = (taxAmount * 100) / income;
				}
			}
			//Check the year value and print the statement
			else {
				System.out.println("Undifined year value!");
				System.exit(1);
			}	
		}
		//Check the income value and print the statement
		else {
			System.out.println("Income must be >0 !");
			System.exit(1);
		}
		//Get ride of the unnecessary digits
		realTax = (int)(realTax * 100) / 100.0;
		income = (int)(income * 100) / 100.0;
		taxAmount = (int)(taxAmount * 100) / 100.0;
		incomeAfterTax = (int)(incomeAfterTax * 100) / 100.0;

		//Display results
		System.out.println("Income:" + income);
		System.out.println("Tax amount:" + taxAmount);		
		System.out.println("Income after tax:" + incomeAfterTax);
		System.out.println("Real tax rate:" + realTax + "%");
	}

}
