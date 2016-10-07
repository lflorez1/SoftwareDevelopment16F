/**
* file: Lab5_7_31.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab5
* due date: Oct 6/16
* version: 1.0
* 
* The key concepts of this lab is the use of methods and arrays
*/

import java.util.Scanner;

public class Lab5_7_31{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter list1: ");
    int [] list1 = new int [input.nextInt()];
    for (int a = 0; a < list1.length; a++){
      list1[a] = input.nextInt();
    }
    System.out.println("Enter list2: ");
    int [] list2 = new int [input.nextInt()];
    for (int b = 0; b < list2.length; b++){
      list2[b] = input.nextInt();
    } 

    int [] mergedList = merge(list1, list2);

    System.out.println("The merged list is: ");
    for (int m = 0; m < mergedList.length; m++) {
      System.out.println(mergedList[m] + " ");
    }
  }
  public static int[] merge(int[] list1, int[] list2) {
    int [] mergedList = new int[list1.length + list2.length];

    int x = 0;
    int y = 0;

    for (int z = 0; z < mergedList.length; z++) {
      if (y < list2.length && list1[x] > list2[z]) {
        mergedList[z] = list2[y];
        y++;
      } else if (x < list1.length){
        mergedList[z] = list1[x];
        x++;
      }
    }
    return mergedList;
  }
}