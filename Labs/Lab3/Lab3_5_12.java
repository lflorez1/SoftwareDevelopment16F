/**
* file: Lab3_5_12.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab3
* due date: Sept 22/16
* version: 1.0
* 
* The key concepts of this lab is the use of while loops, do-while loops,
* for loops, and methods.
*/

public class Lab3_5_12 {
  public static void main(String[] args) {
  int n = 0;
  while (Math.pow(n,2) <= 12000) {
    n++;
  }
  System.out.println("The smallest integer is " + n);
  }
} 
