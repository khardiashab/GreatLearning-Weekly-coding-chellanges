public class App {

  int var1 = 10;
  static int var2 = 10;

  // method 1
  void nonStaticIncrement() {
    var1++;
    System.out.println("non-static variable " + var1);
  }

  // method 2
  void staticIncrement() {
    var2++;
    System.out.println("static variable : " + var2);
  }

  // driver code
  public static void main(String[] args) {
    App obj1 = new App();
    App obj2 = new App();
    App obj3 = new App();
    
    // execute method 1 with all objects
    obj1.nonStaticIncrement();    
    obj2.nonStaticIncrement();
    obj3.nonStaticIncrement();

    // execute method 2 with all objects
    obj1.staticIncrement();    
    obj2.staticIncrement();
    obj3.staticIncrement();

  }
}
