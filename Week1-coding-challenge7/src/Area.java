public class Area {
  final public float pi = 3.14f;

  double area(float radius){
    return pi * radius * radius;
  }

  public static void main(String[] args) {
    // creating a object 
    Area obj = new Area();
    double area  = obj.area(5.8f);
    System.out.println("The area is : " + area);
  }
}
