/**
* file: Project1.java
* author: Laura Florez
* course: CMPT 220
* assignment: Project1
* due date: Oct 4/16
* version: 1.0
* 
* The key concepts of this lab is practice the declaration and usage of arrays,
* and practice the invocation of methods and passing of parameters.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Project1 {
  public static void main(String[] args) {
  	Scanner scanFile = new Scanner (System.in);
  	double lengthOne = input.nextDouble();
  	double lengthTwo = input.nextDouble();
    double vectorOne = new double [lengthOne];
    double vectorTwo = new double [lengthTwo];
  	for (int a = 0; a < lengthOne - 1; a++) {
  	  vectorOne[a] = input.nextDouble(); 
    }
  	for (int b = 0; a < lengthTwo - 1; b++) {
  	  vectorTwo[b] = input.nextDouble(); 
  	}
  	double [] vectorResult = convolveVectors(vectorOne, vectorTwo); 
  	System.out.println(Arrays.toString(vectorResult));

  	if (vectorOne.lenth < vectorTwo.length) { 
  		convolveVectors(vector2, vector1); 
  	} 
  }

  public static double[] convolveVectors(double[] vector1, double[] vector2) {
    double[] vectorRes = new double [(vector1.length + vector2.length) -1];
    int resultLength = (vector1.length + vector2.length - 1);
    int counterResult = 0;
    int counterAdd = 0;
    int counterIndexResult = 0;
    int vector2Length = vector2.length - 1; 
    int subtotal = 0;

    for (int c = 0; c < (int) vector1.length/2; c++) {
      double temp = vector1 [c]; 
      vector1 [c] = vector1[vector1.length - c - 1];
      vector1[vector1.length - c - 1] = temp;
     }

     while ( counterResult < resultLength) {
       subtotal = 0;
     
       if (counterAdd <= vector2Length ) {
         for (int counterZero = 0; counterZero <= counterAdd; shift++ ) {
          subtotal += vector1[counterZero] * vector2 [vector2Length - counterAdd + counterZero]; 	 
          }
          counterAdd++;
        } 
     result[counterResult] = subtotal;
     counterResult ++;      	
   }
    
    return vectorResult;
  }
}