/**
 * file: Lab1_part1_2.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab1
 * due date: Sept 07/16
 * version: 1.0
 * 
 * This file contains the solution for problem 2.1
 */

import java.util.Scanner;

public class Lab1_Part1_2 {
  public static void main (String[] args) {
    // == you are using tabs!!!
  	//Create a scanner object 
  	Scanner input = new Scanner(System.in);

  	//Prompt the user to enter a value in Celsius to be converted
  	System.out.print("Enter value to be converted: ");
  	double celsius = input.nextDouble();

  	//Equation to convert Celsius to Fahrenheit
  	double fahrenheit = (9.0/5.0) * celsius + 32;

  	//Print the result of the equation
  	System.out.println( celsius + "  Celsius is " +  fahrenheit + " Fahrenheit ");
  }
}
