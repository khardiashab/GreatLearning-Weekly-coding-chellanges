package package1;

public class CustomerDemo {
  
  private int age;
  private String name; 
  private int id;

  // Default constractor
  CustomerDemo(){
    System.out.println("This is default constructor.");
  };

  // Parameterized constructor
  CustomerDemo(int age, String name, int id){
    this.age = age;
    this.name = name;
    this.id = id;
    System.out.println("This is parameterized constructor.");
  }

  public static void main(String[] args) {
  CustomerDemo c1 = new CustomerDemo();
  CustomerDemo c2 = new CustomerDemo(25, "ajay ", 101);
  
  }
}