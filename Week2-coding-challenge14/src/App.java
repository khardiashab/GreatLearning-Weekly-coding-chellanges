import mypackage.Encapsulation;

public class App {
    public static void main(String[] args) throws Exception {

        Encapsulation obj = new Encapsulation();
        obj.setCountry("India");
        obj.setNationalAnthem("Jan Gan Man");
        obj.setTouristSpot("Agra");

        String country = obj.getCountry();
        String anthem = obj.getNationalAnthem();
        String touristSpot = obj.getTouristSpot();

        System.out.println("National anthem : " + anthem);
        System.out.println("TouristSpot : " + touristSpot);
        System.out.println("Country : " + country);
        System.out.println("Hello, World!");
    }
}
