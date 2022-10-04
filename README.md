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
