/**
* file: Lab6_9_1.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab6
* due date: Oct 20/16
* version: 1.0
* 
* The key concepts of this lab is the use objects
*/

public class Rectangle{
  public static void main(String[] args){

    //Create a rectangle with width 4 and height 40
    Rectangle rectangle1 = new Rectangle(4,40);
    System.out.println("The area for the rectangle of width " + rectangle1.width  +
    " and height " + rectangle1.height + "is " + rectangle1.getArea() + 
    " and the perimeter is " + rectangle1.getPerimeter());

    //Create a rectangle with width 3.5 and height 35.9
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    System.out.println("The area for the rectangle of width " + rectangle2.width  +
    " and height " + rectangle2.height + "is " + rectangle2.getArea() + 
    " and the perimeter is " + rectangle2.getPerimeter());
  } 

  //data fields
  double height;
  double width;

  //construct a cirlce/default constructor 
  Rectangle(){
   height = 1;
   width = 1;
  } 
  //construct a cirlce with a specified width and height
  Rectangle(double newWidth, double newHeight){
    height = newHeight;
    width = newWidth;
  }
  //Return the area of this rectangle
  double getArea(){
    return height*width;
  }
  //return the perimeter of this rectangle
  double getPerimeter(){
    return 2*height+width;
  }
}