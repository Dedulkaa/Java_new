package ru.stqa.pft.sandbox;
public class MyFirstProgram {
  public static void main(String[] args){
    hello( "world");
    hello("user");
    hello("alexei");

    double v = 1.0/2;
    System.out.println("Square with side  " + v + " = " + area(v));

    double a = 1;
    double b = 3;
    System.out.println("Square of rectangle with side  " + a +" and " + b + " = " + area(a,b));
}

public static void hello(String somebody) {
  System.out.println("Hello," + somebody + " !");
}

public static double area (double len) {
  return len * len;
}
  public static double area (double a, double b) {
    return a * b;
  }
}