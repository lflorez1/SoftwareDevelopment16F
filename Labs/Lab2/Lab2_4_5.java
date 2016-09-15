/**
 * file: Lab2_4_5.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab2
 * due date: Sept 14/16
 * version: 1.0
 * 
 * The key concepts of this lab is the use of selections, mathematical functions, characters and strings.
 */

import java.util.Scanner;

public class Lab2_4_5{
  public static void main (String[] args) {
  	//Propmt the user to enter a value
  	Scanner input = new Scanner(System.in);
  	System.out.print("Enter the number of sides and the length: ");
  	double numberSides = input.nextDouble();
  	double lengthSides = input.nextDouble();

  	//Calculate area
  	double area = (numberSides * (Math.pow( lengthSides, 2)) ) / (4 * (Math.tan(Math.PI/numberSides)));

  	System.out.println("The area of the polygon is " + area);
  }
}
