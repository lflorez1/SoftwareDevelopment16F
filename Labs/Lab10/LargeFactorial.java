/**
* file: LargeFactorial
* author: Laura Florez
* course: CMPT 220
* assignment: Lab10
* due date: Nov 16/16
* version: 1.0
* 
* The key concepts of this lab is the use recursion learnt in class
*/
import java.math.*;
import java.util.Scanner;

public class LargeFactorial {
  public static void main(String[] args) {
    System.out.println("Enter an integer: ");
    Scanner input = new Scanner (System.in);
    int x = input.nextInt();
    BigInteger x2 = new BigInteger(String.valueOf(x));

    System.out.println("The factorial for " + x + " is " + factorial (x2));
  }
  public static BigInteger factorial (BigInteger y) {
   if (y.equals(BigInteger.ZERO)) {
     return BigInteger.ONE;
   } else {
     return y.multiply(factorial(y.subtract(BigInteger.ONE)));
   }
  }
}
