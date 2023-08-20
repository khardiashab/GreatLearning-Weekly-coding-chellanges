package com.greatlearning.corejava;

class ConstructorDemo {

      ConstructorDemo() { 
       // your code here...
       System.out.println("I am default constructor.");
       }

      ConstructorDemo(int num, float per, String name, char ch) {
        // your code here...
        System.out.println("I am Parameterized constructor. I take various arguments as input.");
        System.out.println("The square of num : " + num * num);
        System.out.println("Square of float : " + per * per);
        System.out.println(" String is : " + name);
        System.out.println("Character is : " + ch);
       }

       public void observations(){ 

       System.out.println("inside Observations method");

      }

  public static void main(String[] args) {

  // your code here...
  ConstructorDemo c1 = new ConstructorDemo();
  ConstructorDemo c2 = new ConstructorDemo(55, 67.5f, "Ajay Khardia", 's');
  c1.observations();
  c2.observations();

  }

}