package practice.assignment;

public class MethodImpl {
  
  public void fun1(){
    System.out.println("Function without any argument. fun1");

  }

  public void fun1(int a ){
    System.out.println("Funtion with one argument: fun1.");
  }

  
  public String fun2(){
    String str = "This is string.";
    System.out.println("Function without an argument and return a string : fun2");
    return str;
  }

  public String fun2(String str){
    System.out.println("Function with one argument and return a string: fun2");
    return str;
  }

}
