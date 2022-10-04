# homework2

# problem_1

Write a program that checks ISBN-10. An ISBN-10 (International Standard Book Number) consists of 10 digits: ABCDEFKLMN. The last digit, Z, is a checksum, which is calculated from the other nine digits using the following formula:                     

(𝐴×1 + 𝐵×2 + 𝐶×3 + 𝐷×4 + 𝐸×5 + 𝐹×6 + 𝐾×7 + 𝐿×8 + 𝑀×9) % 11                           

If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). Your program should read the input as an integer.                        

Sample Run 1:             
Enter the first 9 digits of an ISBN as integer: 013601267                 
The ISBN-10 number is 0136012671          

Sample Run 2:                     
Enter the first 9 digits of an ISBN as integer: 013031997                   
The ISBN-10 number is 013031997X                

# problem_2

Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is            
𝑑 = (𝑓 + 26(𝑚+1)/10 + 𝑦 + 𝑦/4 + 𝑐/4 + 5𝑐) % 7              
where             
  • d is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).             
  • f is the day of the month.          
  • m is the month (3: March, 4: April, …, 12: December). January and February are counted as months 13 and 14 of the previous year.          
  • c is the century (i.e., year / 100).            
  • y is the year of the century (i.e., year % 100). 
  
Note that the division in the formula performs an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.         
(Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year.) 


Sample Run 1:     
Enter year (e.g. 2012): 2015      
Enter month (e.g. 1-12): 1        
Enter the day of the month (e.g. 1-31): 25      
Day of the week is Sunday     
      
Sample Run 2:     
Enter year (e.g. 2012): 2012      
Enter month (e.g. 1-12): 5        
Enter the day of the month (e.g. 1-31): 12      
Day of the week is Saturday     

# problem_3
    
Write a program that calculates personal income tax based on the given tax rates reported by The Turkish Revenue Administration. The tax rates vary every year. Tax rates, which vary each year, are given in the following tables for the last 4 years (i.e., 2020, 2019, 2018, and 2017).           

The rules for Table 1 are as follows:         
• If the income is below 22,000 TL, then this amount will be taxed at rate 15%.       
• If the income is below 49,000 TL, then the first 22,000 TL is taxed at rate 15% (3,300 TL), and the remaining will be taxed at rate 20%.          
• If the income is below 180,000 TL; the first 22,000 TL is taxed at rate 15% (3,300 TL), then next 27,000 TL is taxed at rate 20% (5,400 TL) which makes 8,700 TL as a total, and the remaining will be taxed at rate 27%.           
• If the income is below 600,000TL; the first 22,000 TL is taxed at rate 15% (3,300 TL), then next 27,000 TL is taxed at rate 20% (5,400 TL), then next 131,000 TL is taxed at rate 27% (35,370 TL) which makes 44,070 TL as a total, and the remaining will be taxed at rate 35%.          
• If the income is equal or above 600,000TL; the first 22,000 TL is taxed at rate 15% (3,300 TL), then next 27,000 TL is taxed at rate 20% (5,400 TL), then next 131,000 TL is taxed at rate 27% (35,370 TL), then next 420,000 TL is taxed at rate 35% (147,000 TL) which makes 191,070 TL as a total, and the remaining will be taxed at rate 40%.          
• Examples for income -> tax pairs in TL: 20,000 -> 3,000; 32,000 -> 5,300; 149,000 -> 35,700; 280,000 -> 79,070; 700,000 -> 231,070.       
