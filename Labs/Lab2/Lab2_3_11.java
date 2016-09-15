/**
 * file: Lab2_3_11.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab2
 * due date: Sept 14/16
 * version: 1.0
 * 
 * The key concepts of this lab is the use of selections, mathematical functions, characters and strings.
 */

import java.util.Scanner;

public class Lab2_3_11{
  public static void main (String[] args) {
  	//Create a Scanner
  	Scanner input = new Scanner(System.in);
  	System.out.println("Enter a month (in number) and year: ");
  	int month = input.nextInt();
  	int year = input.nextInt();

  	//Check if the year is a leap year
  	boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

  	//For the month choice 
  	switch (month) {
  		case 1: System.out.println("January " + year + " has 31 days"); break;
  		case 2: if (leapYear == true ) { 
  			        System.out.println("February " + year + " has 29 days"); break;
  					      } else {
  			            System.out.println("February " + year + " has 28 days"); break;
  		                }
  		case 3: System.out.println("March " + year + " has 31 days"); break;
  		case 4: System.out.println("April " + year + " has 30 days"); break;
  		case 5: System.out.println("May " + year + " has 31 days"); break;
  		case 6: System.out.println("June " + year + " has 30 days"); break; 
  		case 7: System.out.println("July " + year + " has 31 days"); break;
  		case 8: System.out.println("August " + year + " has 31 days"); break;
  		case 9: System.out.println("September " + year + " has 30 days"); break; 
  		case 10: System.out.println("October " + year + " has 31 days"); break;
  		case 11: System.out.println("November " + year + " has 30 days"); break; 
  		case 12: System.out.println("December " + year + " has 31 days"); break;
  		default: System.out.println("Invalid input");
  	}
  }
}