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
