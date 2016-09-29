/**
* file: Lab4_7_18.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab4
* due date: Sept 28/16
* version: 1.0
* 
* The key concepts of this lab is the use of methods and arrays
*/

import java.util.Scanner;
import java.util.Arrays;
public class Lab4_7_18{
  public static void main (String[] args) {
  	System.out.println("Enter ten numbers: ");
    Scanner input = new Scanner(System.in);
    double [] list = new double [10];

	for (int a = 0; a < list.length; a++) {
      list [a] = input.nextDouble();
    }
    double [] sorted = new double [10];
    sorted = bubbleSort(list);

    System.out.println("The array after sort is: " + Arrays.toString(sorted));
  }
  public static double[] bubbleSort (double [] array) {
    boolean needNextPass = true;
    for (int x = 1; x < array.length && needNextPass; x++) {
      needNextPass = false; 
      for (int y = 0; y <array.length - x; y++) {
      	if (array [y] > array [y + 1]) {
      	  double temp = array[y];
      	  array [y] = array [y + 1];
      	  array [ y + 1] = temp;
      	  needNextPass = true;
      	}
      }
    }
    return array;
  }
}
