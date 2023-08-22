public class Class {
  
  void copyMe(){
    System.out.println("Inside copy me method.");
  }

  // Driver code 
  public static void main(String[] args) {
    Class obj = new Class();

    obj.copyMe();
  }
}
