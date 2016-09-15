/**
 * file: Lab2_3_8.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab2
 * due date: Sept 14/16
 * version: 1.0
 * 
 * * The key concepts of this lab is the use of selections, mathematical functions, characters and strings.
 */

import java.util.Scanner;

public class Lab2_3_8 {
  public static void main (String[] args) {
  	//Create a scanner object 
  	Scanner input = new Scanner(System.in);

  	//Prompt the user to enter the subtotal and gratuity 
  	System.out.print("Enter three integers: ");
  	int number1 = input.nextInt();
  	int number2 = input.nextInt();
  	int number3 = input.nextInt();
  	//Case one: the biggest number is in the left, then the middle number is in the middle, and the smallest is on the right
  	  if (number1 > number2 && number1 > number3 && number2 > number3){
  	  	System.out.println(number3);
  	  	System.out.println(number2);
  	  	System.out.println(number1);
  	  	//Case two: the biggest number is in the middle, then the middle number is on the right, and the smallest is on the left
  	    } else if (number1 < number2 && number1< number3 && number2 > number3){
  	  	  System.out.println(number1);
  	  	  System.out.println(number3);
  	  	  System.out.println(number2);
  	  	  //Case three: the biggest number is on the right, the midle number is on the left, an the smallest is in the middle
  	      } else if (number1 > number2 && number1 < number3 && number2 < number3){
  	  	    System.out.println(number2);
  	  	    System.out.println(number1);
  	  	    System.out.println(number3);
  	  	    //Case four: the numbers are already arrange by ascending order
  	        } else if (number1 < number2 && number1 < number3 && number2 < number3){
  	  	      System.out.println(number1);
  	  	      System.out.println(number2);
  	  	      System.out.println(number3);
  	  	      //Case five: the numbers are the same 
  			      } else {
  			  	    System.out.println("Numbers are the same");
  		 }
  	}
  }
