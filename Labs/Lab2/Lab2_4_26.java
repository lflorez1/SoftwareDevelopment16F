/**
* file: Lab2_4_26.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab2
* due date: Sept 14/16
* version: 1.0
* 
* The key concepts of this lab is the use of selections, 
* mathematical functions, characters and strings.
*/

import java.util.Scanner;

public class Lab2_4_26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount in double, for example 11.56: ");
    String amount = input.nextLine();
    int index = amount.indexOf(".");

    //Using integers as substrings to separate change and dollars
    int dollars = Integer.parseInt(amount.substring(0,index));
    int change = Integer.parseInt(amount.substring(index+1));

    //Find the number of one dollars
    int numberOfOneDollars = dollars;

    //Find the number of quarters in the reamining amount
    int numberOfQuarters = change/25;
    change = change%25;

    //Find the number of dimes in the remaining amount
    int numberOfDimes = change/10;
    change = change%10; 

    //Find number of nickels in the remaining amount
    int numberOfNickels = change/5;
    change = change%5;

    //Find the number of pennies in the remaining amount 
    int numberOfPennies = change;

    //Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("   " + numberOfOneDollars + " dollars");
    System.out.println("   " + numberOfQuarters + " quarters");
    System.out.println("   " + numberOfDimes + " dimes");
    System.out.println("   " + numberOfNickels + " nickels");
    System.out.println("   " + numberOfPennies + " pennies");
  }
}