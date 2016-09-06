/**
 * file: Lab1_part1_3.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab1
 * due date: Sept 07/16
 * version: 1.0
 * 
 * This file contains the solution for problem 2.5
 */

import java.util.Scanner;

public class Lab1_Part1_3 {
  public static void main (String[] args) {
  	//Create a scanner object 
  	Scanner input = new Scanner(System.in);

  	//Prompt the user to enter the subtotal and gratuity 
  	System.out.print("Enter the subtotal and a gratuity rate: ");
  	double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

    //Equation to calculate the gratuity and convert the rate into a decimal 
    double gratuity = gratuityRate/(100) * subtotal; 

  	//Equation to calculate the total
  	double total = subtotal + gratuity;

  	//Print the result of both equations
  	System.out.println( " The gratuity is " + gratuity +  " and the total is " + total );
  }
}