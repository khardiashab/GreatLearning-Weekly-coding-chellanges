public class Polymorphism {

    long findArea(int l, int b){
        return (long) l * b;
    }

    long findArea(int l, int b, int h){
        return 2 * ( (long) l * b  + (long) l* h + (long) b * h);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Polymorphism obj = new Polymorphism();
        System.out.println("Area of reactangle : " + obj.findArea(8, 5));
        System.out.println("Area of cuboid " + obj.findArea(3, 4, 5));
    }
}
