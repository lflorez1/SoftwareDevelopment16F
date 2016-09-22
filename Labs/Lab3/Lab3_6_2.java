/**
* file: Lab3_6_2.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab3
* due date: Sept 22/16
* version: 1.0
* 
* The key concepts of this lab is the use of while loops, do-while loops,
* for loops, and methods.
*/

import java.util.Scanner;

public class Lab3_6_2 {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter an integer: ");
    long n = input.nextLong(); 
    System.out.println("The sum of the digits is: " + sumDigits(n));
  }
  public static int sumDigits (long n){
    int sum = 0;
  	 int x = 1;
  	 int number = (int)n;

    while (x != 0) { 
      x = number % 10;
      sum += x;
      number = number / 10;  
    }
  return sum;
  }
}