/**
* file: Lab2_4_8.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab2
* due date: Sept 14/16
* version: 1.0
* 
* The key concepts of this lab is the use of selections, 
* mathematical functions, characters and strings.
*/

import java.util.Scanner;

public class Lab2_4_8{
  public static void main (String[] args) {
    //Propmt the user to enter a value
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an ASCII code: ");
    int code = input.nextInt();

    System.out.print("The character for ASCII code " + code + " is " + (char) code);
   }
 }
