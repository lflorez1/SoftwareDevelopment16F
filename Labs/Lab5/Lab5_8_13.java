/**
* file: Lab5_5_13.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab5
* due date: Oct 6/16
* version: 1.0
* 
* The key concepts of this lab is the use of methods and arrays
*/

import java.util.Scanner;
import java.util.Arrays;
public class Lab5_8_13{
  public static void main (String[] args) {
  	//rows first, columns seconds
    int [][] x = new int [20][10];

    for (int row = 0; row < 20; row++) {
      for (int col = 0; col < 10; col++) {
      	x[row][col] = (int)(Math.random()*100);
      	System.out.print( x[row][col] + " ");
      }
      System.out.println();
    }

     int rr=0;
     int rc=0; //result row and col
     int maxVal = 0;
     for ( int row = 0; row < 20; row++) {
       for (int col = 0; col < 10; col++) {
         if (x[row][col] >= maxVal) {
           rr = row;
           rc = col;
           maxVal = x[row][col];
        }
      }
    }
    System.out.println("Max value is: " + maxVal);
    System.out.println("Position -> row" + (rr+1) + "col: " + (rc+1));
  }
}