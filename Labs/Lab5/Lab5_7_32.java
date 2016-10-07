/**
* file: Lab5_7_32.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab5
* due date: Oct 6/16
* version: 1.0
* 
* The key concepts of this lab is the use of methods and arrays
*/
import java.util.Scanner;

public class Lab5_7_32{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter list: ");
    int [] newList = new int[input.nextInt()];
    for (int x = 0; x < newList.length; x++) {
      newList[x] = input.nextInt();
    }
    partition(newList);
    System.out.println("After the partition, the list is: ");
    for (int y = 0; y < newList.length; y++) {
      System.out.print(newList[y] + " ");
    }
  }
  public static int partition(int [] list){
    int partition = list[0];
    int partIndex = 0;
    int c = list.length-1;

    while(partIndex < c) {
      if(partition > list[partIndex+1]) {
        list[partIndex] = list[partIndex+1];
        list[partIndex+1] = partition;
        partIndex++;
      } else {
        int temp = list[c];
        list[c] = list[partIndex+1];
        list[partIndex+1] = temp;
        c--;
      }
    }
    return partIndex;
  }
}