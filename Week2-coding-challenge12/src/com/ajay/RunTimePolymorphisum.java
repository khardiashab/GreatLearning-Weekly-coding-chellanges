package com.ajay;
class A {
  void Car(){
    System.out.println("I am method A.");
  }
}
class B extends A {
  void Car(){
    System.out.println("I am method B.");
  }
  
}

public class RunTimePolymorphisum{
  public static void main(String[] args) {
    A obj = new A();
    B obj1 = new B();
    obj.Car();
    obj1.Car();
  }
}
