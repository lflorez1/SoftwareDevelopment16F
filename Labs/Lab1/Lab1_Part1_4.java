/**
 * file: Lab1_part1_4.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab1
 * due date: Sept 07/16
 * version: 1.0
 * 
 * This file contains the solution for problem 2.6
 */

import java.util.Scanner;

public class Lab1_Part1_4 {
  public static void main (String[] args) {
  	//Create a scanner object 
  	Scanner input = new Scanner(System.in);

  	//Prompt the user to enter the subtotal and gratuity 
  	System.out.print("Enter a number between 0 and 1000: ");
  	int number = input.nextInt();

    //Statement to limit the input and not function if the number is not within range
    if (number >= 1000 || number < 0){
      System.out.println(" The number entered is not within the range");
    } else {

    // Extract the right most digit of the integer 
    int extractOne = number%(10); 
    // Make the integer a two digit number
    int extractTwo = number/10;
    // Extract the right most digit of the new two digit number 
    int extractThree = extractTwo%(10);
    // Extract the left most digit of the new two digit number
    int extractFour = extractTwo/(10);
    // Add every individual number
    int answer = extractOne + extractThree + extractFour;

  	//Print the result of both equations
  	System.out.println( "The sum of the digits is " + answer);
  }
  }
}