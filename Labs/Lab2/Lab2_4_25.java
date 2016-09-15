/**
 * file: Lab2_4_25.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab2
 * due date: Sept 14/16
 * version: 1.0
 * 
 * The key concepts of this lab is the use of selections, mathematical functions, characters and strings.
 */

import java.util.Scanner;

public class Lab2_4_25 {
  public static void main(String[] args) {
    int plateNumber = ((int) (Math.random()*10000));
    char plateLetter1 = (char) ((int) (Math.random()*26+65)); 
	char plateLetter2 = (char) ((int) (Math.random()*26+65)); 
	char plateLetter3 = (char) ((int) (Math.random()*26+65));

	System.out.printf("The plate is " +plateLetter1+plateLetter2 +plateLetter3+"%04d\n",plateNumber);
  }
}