// package com.greatlearning.corejava;
public class HealthDriver {
  
  public static void main(String[] args) {
    Health health = new Health();
    health.age = 25;
    health.weight = 80.0f;
    health.bmi = 30.0f;

    System.out.println("Age : " + health.age + "\nWeight" + health.weight + "\nbmi" + health.bmi);
  }
  

}
