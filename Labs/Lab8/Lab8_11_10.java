/**
* file: Lab8_11_10.java
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

public class Lab8_11_10{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    MyStack x = new MyStack();
    System.out.println("Enter five strings: ");
    for (int a = 0; a < 5; a++){
      x.push(input.next());
    }
    System.out.println("The strings in the reverse order are: ");
    while (!x.isEmpty()) {
      System.out.print(x.pop() + " ");
    }
  }
}

class MyStack extends ArrayList<Object> {

  public boolean isEmpty(){
    return super.isEmpty();
  }

  public int getSize()
  {
    return size();
  }

  public Object peek(){
    return get(getSize() - 1);
  }

  public Object pop(){
    Object o = get(getSize() - 1);
    remove(getSize() - 1);
    return o;
  }

  public void push(Object o){
    add(o);
  }

  @Override
  public String toString(){
    return "stack: " + super.toString();
  }
}