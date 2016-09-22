/**
* file: Lab3_5_7.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab3
* due date: Sept 22/16
* version: 1.0
* 
* The key concepts of this lab is the use of while loops, do-while loops,
* for loops, and methods.
*/

public class Lab3_5_7 {
  public static void main (String[] args) {
  double tuition = 10000;
  double totalTuition = 0;
  int year; 

  for (year = 0; year < 14; year++) {
    tuition = ((double)(tuition * 1.05));
    if ( year == 10) {
     System.out.println("The tuition in 10 years is $ " + tuition);
    }

    if ( year > 10) {
     totalTuition = ((double)(totalTuition + tuition));
    }
  }
  System.out.println("The tution for four years after ten years is $ " + 
    totalTuition);
  }
}