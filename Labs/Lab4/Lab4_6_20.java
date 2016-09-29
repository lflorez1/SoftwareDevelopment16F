/**
* file: Lab4_6_8.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab4
* due date: Sept 28/16
* version: 1.0
* 
* The key concepts of this lab is the use of methods and arrays
*/
import java.util.Scanner;

public class Lab4_6_20 {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a string: ");
    String one = input.nextLine();

    System.out.println("The number of letters in the string is " + countLetters(one));
  }
  public static int countLetters(String one) {
  	int countLetters = 0;
    for (int x =0; x < one.length(); x++) {
      if (Character.isLetter(one.charAt(x)))
        countLetters ++;
    }
    return countLetters;
  }
}