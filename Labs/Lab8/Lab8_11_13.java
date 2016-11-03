/**
* file: Lab8_11_13.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab8
* due date: Nov 3/16
* version: 1.0
* 
* The key concepts of this lab is to practice using and creating UML class 
* diagrams and explain some basic concepts about OOP that we covered in class.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Lab8_11_13{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter ten integers: ");
    ArrayList<Integer> integersList = new ArrayList<>();
    for (int x = 0; x < 10; x++){
      integersList.add(input.nextInt());
    }
    ArrayList<Integer> newList = new ArrayList<>();
    removeDuplicate(integersList);
    System.out.println("The distinct integers are: " + integersList);
  }

  public static void removeDuplicate (ArrayList<Integer> list){
    ArrayList<Integer> temporary = new ArrayList<>();
    for (int i = 0; i < 10; i++){
      int value = list.get(i);
        if (!temporary.contains(value)){
          temporary.add(value);
        } 
    }
    list.clear();
    for (int i = 0; i < temporary.size(); i++){
    list.add(temporary.get(i));
    }
  }
}