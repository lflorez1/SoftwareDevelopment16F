/**
* file: Lab4_7_9.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab4
* due date: Sept 28/16
* version: 1.0
* 
* The key concepts of this lab is the use of methods and arrays
*/

import java.util.Scanner;
public class Lab4_7_9{
  public static void main (String[] args) {
    System.out.println("Enter ten numbers: ");
    Scanner input = new Scanner(System.in);
    double [] list = new double [10];

	for (int a = 0; a < list.length; a++) {
      list [a] = input.nextDouble();
    }
    System.out.println("The minimun number is: " + min(list));
  }
  public static double min (double[] array) {
    double min = array[0];
    for (int a = 1; a < array.length; a++) {
      if (array[a] < min) {
        min = array [a] ;
      }
    }
    return min;
  }
}