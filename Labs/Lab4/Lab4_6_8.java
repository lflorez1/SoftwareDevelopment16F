/**
* file: Lab4_6_8.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab4
* due date: Sept 28/16
* version: 1.0
* 
* The key concepts of this lab is the use of methods and arrays
*/

public class Lab4_6_8 {
  public static void main (String[] args){

  System.out.format("Celsius   Farenheit   |   Farenheit   Celsius\n");
    for (double cel = 40.0, far = 120; cel > 30.0; cel -= 1, far-= 10){
      double[] myList = new double[100];
      System.out.format("%10.1f   %10.1f   |   %10.1f   %10.1f \n", 
        cel, Cel2Far(cel), far, Far2Cel (far));
    }
  }
  public static double Cel2Far(double cel){
    return 9.0 / (5.0 *(cel + 32));
  }
  public static double Far2Cel(double far){
    return 5.0/ (9.0 * (far - 32));
  }
}