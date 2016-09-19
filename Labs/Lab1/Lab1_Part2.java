/**
 * file: Lab1_part2.java
 * author: Laura Florez
 * course: CMPT 220
 * assignment: Lab1
 * due date: Sept 07/16
 * version: 1.0
 * 
 * This file contains the solution for part two of the lab
 */

import java.util.Scanner;

public class Lab1_Part2 {
  public static void main (String[] args) {
    // == you are using tabs!!!
  	//Create a scanner object 
  	Scanner input = new Scanner(System.in);

  	//Prompt the user to enter the grades for each field 
    // == the following line exceeds 80 characters in length!
  	System.out.print("Please enter the following as percentage: \n midterm exam, final exam, projects, homeworks and labs: ");
  	double midtermExam = input.nextDouble();
    double finalExam = input.nextDouble();
    double projects = input.nextDouble();
    double homeworkLabs = input.nextDouble();

    //Equation to calculate the total grade 
    double finalGrade = ((midtermExam + finalExam + projects + homeworkLabs)/(4));


  	//Print the result of the equation
  	System.out.println( "Your final grade is " + finalGrade + "%");
  }
}
