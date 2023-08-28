class InheritanceA{
  final float Pie = 3.14f;

  double cricleArea(double radius){
    return  Pie * radius * radius;
  }

}

class InheritanceB extends InheritanceA{

  double reactangleArea(double l, double b){
    return l* b;
  }
}


class InheritanceC extends InheritanceB{
  double triangleArea(double l, double h){
    return 0.5f * l * h;
  }
}


class MultilevelInheritance {
  
  public static void main(String[] args) {
    
    InheritanceC obj = new InheritanceC();
    double areaOfCricle = obj.cricleArea(10);
    double areaOfReactangle = obj.reactangleArea(4, 8);
    double areaOfTriangle = obj.triangleArea(3, 4);

    System.out.println("Reactangle area : " + areaOfReactangle);
    System.out.println("Triangle area : " + areaOfTriangle);
    System.out.println("Cricle area : " + areaOfCricle);
  }
}
