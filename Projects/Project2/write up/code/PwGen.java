/**
* file: PwGen.java
* author: Laura Florez
* course: CMPT 220
* assignment: Final Project
* due date: December 12, 2016
* version: 1.0
* 
* This program is a password generator that combines a random set of numbers,
* letters, and special characters to produce a string based on the input of
* the user.
*/

import java.security.SecureRandom;
import java.util.Scanner;

public class PwGen{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter password length: ");
    int length = scanner.nextInt();
    System.out.println("The password created is: " + createPw(length));
  }

  /* method that uses inbuilt java classes to create an empty string and add
   * a set of not predictable numbers, letters, and characters based on theri
   * value on the ASCII table.
   */
  public static String createPw(int length){
    //ASCII range of total numbers, letters, and characters
    final static int TOTAL_NUM_CHAR = 94; 
    //ASCII number where the characters necessary for the code start 
    final static int OFFSET_CHAR = 33;
    //creates an empty string 
    StringBuilder emptyBuilder = new StringBuilder();
    //creates not predictacble patterns
    SecureRandom rng = new SecureRandom();
    int x = 0;
    //loop to create the combination of characters based in the inoput 
    while (x < length) {
      //based on the ASCII table, pull random letters, numbers, and characters
      //as long as X is less than the input of the user
  	   char asciiValue = (char)(rng.nextInt(TOTAL_NUM_CHAR)+OFFSET_CHAR);
      //adds the value generated to the empty string
      emptyBuilder.append(asciiValue); 
      x++;
    }
    //combines all the characters generated and returns it as a string
    return emptyBuilder.toString();
  }
}