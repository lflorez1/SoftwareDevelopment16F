/**
* file: Lab7_10_2.java
* author: Laura Florez
* course: CMPT 220
* assignment: Lab7
* due date: Oct 27/16
* version: 1.0
* 
* The key concepts of this lab is to practice using and creating UML class 
* diagrams and explain some basic concepts about OOP that we covered in class.
*/

public class BMI{
  private String name;
  private int age;
  private double weight; //in pounds
  private double height; //in inches
  private double feet;
  private double inches;
  public static final double KILOGRAMS_PER_POUND = .45359237;
  public static final double METERS_PER_INCH = .0254;

  public BMI(String name, int age, double weight, double height){ //constructor
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  public BMI(String name, double weight, double height){ //constructor
    this(name, 20, weight, height);
  }

  public BMI(String name, int age, double weight, double feet, double inches){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.feet = Math.floor(height/12);
    this.inches = height % 12;
  }

  public double getBMI(){ //get BMI 
    double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * 
      (height * METERS_PER_INCH));
    return Math.round(bmi * 100) / 100.0;
  }

  public String getStatus(){ //get status
    double bmi = getBMI();
    if (bmi < 18.5){
      return "Underweight";
    } else if (bmi < 25){
      return "Normal";
    } else if (bmi < 30){
      return "Overweight";
    } else {
      return "Obese";
    }
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public double getWeight(){
    return weight;
  }

  public double getHeight(){
   return height;
  }
}