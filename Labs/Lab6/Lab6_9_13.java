/**
* file: Lab6_9_13.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab6
* due date: Oct 20/16
* version: 1.0
* 
* The key concepts of this lab is the use objects
*/

import java.util.Scanner;
import java.util.Arrays;

public class Lab6_9_13{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the number of rows and columns in the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double [][] a = new double [row][column];
    int [] result = new int [2];
    Location.locateLargest(a);
    System.out.println("Enter the array: ");
    for (int x = 0; x < a.length; x++) {
      for(int y = 0; y < a[x].length; y++){
        a[x][y] = input.nextDouble();
      }
    }
    Location arrayLocation = Location.locateLargest(a);
    System.out.println("The location of the largest element is " + arrayLocation.maxValue 
    + "at(" + arrayLocation.row + "," + arrayLocation.column + ")" );
  }
}

  class Location {
    public int row;
    public int column;
    public double maxValue;   
   
    Location(){
     } 

    public static Location locateLargest(double[][]a){
      Location result = new Location();
      result.maxValue = a[0][0];
      result.row = 0;
      result.column = 0;
       for (int x = 0; x < a.length; x++) {
         for (int y = 0; y < a[x].length; y++) {
           if(a[x][y] > result.maxValue) {
             result.maxValue = a[x][y];
             result.row = x;
             result.column = y;
           }
         }
       }
    }
  }