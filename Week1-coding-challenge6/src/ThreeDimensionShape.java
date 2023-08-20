public class ThreeDimensionShape {
  
  private double height, width, depth;

  // createing default constructor
  ThreeDimensionShape(){
    // assing 0 to all
    height = width = depth = 0;
  }

  //  create 1 argument paramertrized constructor
  ThreeDimensionShape(double side){
    // assigning value to all
    height = width = depth  = side;
  }

    //  create 1 argument paramertrized constructor
  ThreeDimensionShape(double height, double width, double depth){
    // assigning the value
    this.height = height;   
    this.width = width;
    this.depth = depth;
  }

  double volume(){
    // return the volume of the cube of cuboide
    return height * width * depth;
  }

  // Driver code 
  public static void main(String[] args) {
    
    // creating boxes using the various constructor

    ThreeDimensionShape box1 = new ThreeDimensionShape();
    ThreeDimensionShape box2 = new ThreeDimensionShape(6.8f);
    ThreeDimensionShape box3 = new ThreeDimensionShape(5.6f, 8d, .9d);

    double volume;
    
    // Getting the volume of box1
    volume = box1.volume();
    // print the volume
    System.out.println("Volume of box1 : " + volume);

    // Getting the volume of box2
    volume = box2.volume();
    System.out.println("Volume of box2 : " + volume);

    // Getting the volume of box3
    volume = box3.volume();
    System.out.println("Volume of box3 : " + volume);
  }
}
