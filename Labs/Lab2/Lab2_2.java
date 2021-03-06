/**
 * file: Lab2_2.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab2
 * due date: Sept 14/16
 * version: 1.1
 * 
 * The key concepts of this lab is the use of selections, mathematical 
 * functions, characters and strings.
 */

import java.util.Scanner;

public class Lab2_2 {
  public static void main (String[] args) {
    //Create a scanner object 
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter the grades for each field 

    System.out.print("Please enter the following as percentage: \n midterm exam, final exam, projects, homeworks and labs: ");

    System.out.print("Please enter the following as percentage: \n " + 
        "midterm exam, final exam, projects, homeworks and labs: ");

    double midtermExam = input.nextDouble();
    double finalExam = input.nextDouble();
    double projects = input.nextDouble();
    double homeworkLabs = input.nextDouble();

    //Equation to calculate the total grade 
    double finalGrade = (midtermExam*.2) + (finalExam*.2) + 
        (projects*.2) + (homeworkLabs *.4);

    if (finalGrade <=100 && finalGrade >=95.00){
      System.out.println("Your final grade is an A");
    } else if (finalGrade <=94.99 && finalGrade >=90.00) {
      System.out.println("Your final grade is an A-");
    } else if (finalGrade <=89.99 && finalGrade >= 87.00){
      System.out.println("Your final grade is a B+");
    } else if (finalGrade <= 86.99 && finalGrade >= 83.00) {
      System.out.println("Your final grade is a B");
    } else if (finalGrade <= 82.99 && finalGrade >= 80.00) {
      System.out.println("Your final grade is a B-");
    } else if (finalGrade <= 79.99 && finalGrade >= 77.77) {
      System.out.println("Your final grade is a C+");
    } else if (finalGrade <= 76.99 && finalGrade >= 73.00){
      System.out.println("Your final grade is a C");
    } else if (finalGrade <=72.99 && finalGrade >= 70.00) {
      System.out.println("Your final grade is a C-");
    } else if (finalGrade <=69.99 && finalGrade >= 65.00) {
      System.out.println("Your final grade is a D+");
    } else if (finalGrade <=64.99 && finalGrade >= 60.00) {
      System.out.println("Your final grade is a D");
    } else {
      System.out.println ("Your final grade is a F");
    }
  }
}
