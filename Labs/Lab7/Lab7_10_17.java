/**
* file: Lab7_10_17.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab7
* due date: Oct 27/16
* version: 1.0
* 
* The key concepts of this lab is to practice using and creating UML class 
* diagrams and explain some basic concepts about OOP that we covered in class.
*/
import java.math.BigDecimal;

public class Lab7_10_17{
  public static void main(String[] args){
    BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
    long start = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal n = new BigDecimal(start);
    int countNum = 0;
    while (countNum < 10) {
      BigDecimal squared = n.multiply(n);
      if (squared.compareTo(longMaxValue) > 0) {
        countNum++; 
        System.out.println(countNum + ": " + n + " squared = " + squared);
      }
      n = n.add(BigDecimal.ONE);
    }
  }
}