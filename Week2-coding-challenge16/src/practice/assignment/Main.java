package practice.assignment;

public class Main {
  
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    MethodImpl obj1 = new MethodImpl();
    obj1.fun1();
    obj1.fun1(0);
    obj1.fun2();
    obj1.fun2("Str");
}
}
