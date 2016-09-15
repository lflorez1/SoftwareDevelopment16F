/**
 * file: Lab2_4_15.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab2
 * due date: Sept 14/16
 * version: 1.0
 * 
 * The key concepts of this lab is the use of selections, mathematical functions, characters and strings.
 */

import java.util.Scanner;

public class Lab2_4_15 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    String letter = input.nextLine();

    char ch = Character.toUpperCase(letter.charAt(0));
    if (ch <='C' && ch >= 'A'){
      System.out.println("The corresponding number is 2");
        } else if (ch <= 'F' && ch >= 'D'){
         System.out.println("The corresponding number us 3");
         } else if (ch <= 'I' && ch >= 'G'){
       	   System.out.println("The corresponding number is 4");
           } else if (ch <= 'L' && ch >= 'J'){
             System.out.println("The corresponding number is 5");
             } else if (ch <= 'O' && ch >= 'M'){
           	   System.out.println("The corresponding number is 6");
               } else if (ch <= 'S' && ch >= 'P'){
                 System.out.println("The corresponding number is 7");	
                 } else if (ch <= 'V' && ch >= 'T'){
               	   System.out.println("The corresponding number is 8");
                   } else if (ch <= 'Z' && ch >= 'W'){
                     System.out.println("The corresponding number is 9");
                     } else {
                   	   System.out.println("The input is invalid");
                       }
	}
}