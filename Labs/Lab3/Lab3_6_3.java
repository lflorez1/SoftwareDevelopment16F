/**
* file: Lab3_6_3.java
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

public class Lab3_6_3{
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.println("Enter an integer: ");
   int number = input.nextInt();

   if (isPalindrome(number)) {
     System.out.println( number + " is a palindrome");
   } else {
     System.out.println( number + " is not a palindrome");
   }
  }

  public static int reverse (int number) {
    int reverse = 0;
    int digit;
    while (number != 0) {
      digit = number % 10;
      reverse = reverse * 10 + digit;
      number /= 10;
    }
    return reverse;
  }
  public static boolean isPalindrome(int number) {
    return (number == reverse (number));
  }
}

