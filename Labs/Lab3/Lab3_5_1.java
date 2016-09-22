/**
* file: Lab3_5_1.java
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

public class Lab3_5_1 {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("Enter an integer, the input ends if it is 0: ");
    int p = input.nextInt();

    int np = 0;
    int nn = 0;
    double sumn = 0;
    double avgn = 0;

    if (p == 0)
      return;

    do {
      if (p>0)
        np++;
      else 
        nn++;

      sumn += p;

      p = input.nextInt();

    } while (p != 0 );
    
    avgn = ((double)(sumn))/((double)(np+nn));

    System.out.println("The number of positives is: " + np);
    System.out.println("The number of negatives is: " + nn);
    System.out.println("The total is: " + sumn);
    System.out.println("The average is: " + avgn);
  }
}