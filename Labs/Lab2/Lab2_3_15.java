/**
 * file: Lab2_3_15.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab2
 * due date: Sept 14/16
 * version: 1.0
 * 
 * The key concepts of this lab is the use of selections, mathematical functions, characters and strings.
 */

import java.util.Scanner;

public class Lab2_3_15{
  public static void main (String[] args) {
  	//Generate a random number 
  	int lottery = (int)(Math.random() * 1000);

  	//Propmt the user to enter a three digit number
  	Scanner input = new Scanner(System.in);
  	System.out.print("Enter your lottery pick (three digits): ");
  	int guess = input.nextInt();

  	//Get digits from lottery
  	 // Extract the right most digit of the integer 
    int lotteryDigitOne = lottery%(10); 
    // Make the integer a two digit number
    int extract = lottery/10;
    // Extract the right most digit of the new two digit number 
    int lotteryDigitTwo = extract%(10);
    // Extract the left most digit of the new two digit number
    int lotteryDigitThree = lotteryDigitTwo/(10);

     //Get digits from guess
  	 // Extract the right most digit of the integer 
    int guessDigitOne = guess%(10); 
    // Make the integer a two digit number
    int extractNumber = guess/10;
    // Extract the right most digit of the new two digit number 
    int guessDigitTwo = extractNumber/(10);
    // Extract the left most digit of the new two digit number
    int guessDigitThree = guessDigitTwo%(10);

    System.out.println("The lottery is " + lottery );
    int win;

    if (guess == lottery) {
      win = 1;
        } else if ((guessDigitOne == lotteryDigitOne || guessDigitOne == lotteryDigitTwo || 
          guessDigitOne == lotteryDigitThree) && (guessDigitTwo == lotteryDigitOne || 
          guessDigitTwo ==lotteryDigitTwo || guessDigitTwo==lotteryDigitThree) &&
          (guessDigitThree == lotteryDigitOne || guessDigitThree == lotteryDigitTwo ||
          guessDigitThree == lotteryDigitThree)) {
    	      win = 2;
            } else if (guessDigitOne == lotteryDigitOne || guessDigitOne == lotteryDigitTwo ||
             guessDigitOne == lotteryDigitThree || guessDigitTwo == lotteryDigitOne || 
             guessDigitTwo ==lotteryDigitTwo || guessDigitTwo==lotteryDigitThree || 
             guessDigitThree == lotteryDigitOne || guessDigitThree == lotteryDigitTwo || 
             guessDigitThree == lotteryDigitThree) {
    	          win = 3;
              } else {
            	   win = 4;
                   }
    switch(win) {
      case 1: System.out.println("Exact match you win: $10,000!");break;
    	case 2: System.out.println("Match all digits: you win $3,000!");break;
    	case 3: System.out.println("Match one digit: you win $1,000!");break;
    	default: System.out.println("Sorry, no match");break;
    }
  }
}