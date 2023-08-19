// Write an algorithm to create a class Customer that contains 

//       fullName(String) and age(int) as variables in class. 

// Create a main method, assign values to the variables in the main method and print the values of variables using the object of Customer class in the main method. 

// After writing the algorithm, write suitable code, run the program, and check the output.

// Algorithm

// Step 1: Start

// . . .

// . . .

// . . .

// Step n: Stop
public class Customer {
  
  public String  fullName;
  public int age;
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.age = 25;
    customer.fullName = "Ajay Khardia";
    System.out.println("Full name : " + customer.fullName);
    System.out.println("Age : " + customer.age);
  }
}
