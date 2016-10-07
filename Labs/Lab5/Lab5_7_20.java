/**
* file: Lab5_7_20.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab5
* due date: Oct 6/16
* version: 1.0
* 
* The key concepts of this lab is the use of methods and arrays
*/

import java.util.Scanner;

public class Lab5_7_20{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int [] numbers = new int [10];

    System.out.println("Enter ten numbers: ");

    for (int a = 1; a < numbers.length; a++) {
      numbers[a] = input.nextInt();
    }

    System.out.println("The sorted numbers are the following: ");

    reviseSelectionSort(numbers);
    for (int a = 0; a < numbers.length; a++) {
    System.out.println(numbers[a] + " ");
    }
  }

  public static void reviseSelectionSort (int[] list) {
    for (int a = list.length-1; a > 0; a--) {
      int currentMax = list[a];
      int currentMaxIndex = a;

      for (int b = 0; b < a; b++) {
        if (currentMax < list[b]) {
          currentMax = list[b];
          currentMaxIndex = b;
        }
      }
      if (currentMaxIndex != a) {
        list[currentMaxIndex] = list[a];
        list[a] = currentMax;
      }
    }
  }
}