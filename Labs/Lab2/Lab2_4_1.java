/**
 * file: Lab2_4_1.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab2
 * due date: Sept 14/16
 * version: 1.0
 * 
 * The key concepts of this lab is the use of selections, mathematical functions, characters and strings.
 */

import java.util.Scanner;

public class Lab2_4_1{
  public static void main (String[] args) {
    //Propmt the user to enter a value
  	Scanner input = new Scanner(System.in);
  	System.out.print("Enter the length from the center to a vertex: ");
  	double centerToVertex = input.nextDouble();

  	//Calculate the length
 	double length = (2 * centerToVertex * Math.sin(Math.PI/5));

 	//Calculate the area
 	double area = ( (5 *(Math.pow( length, 2)))/ (4 * (Math.tan(Math.PI/5))));

 	System.out.println("The are of the pentagon is " + Math.round(area * 100) / 100.0 );
  }
}