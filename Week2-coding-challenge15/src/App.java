import mypackage.Encapsulation;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Encapsulation obj = new Encapsulation();
        obj.setAge(77);
        if (obj.getAge() <= 60) {
            obj.setDecision(true);
        } else {
            obj.setDecision(false);
        }

        System.out.printf("The age of the candidate is %d.",  obj.getAge());
        System.out.printf("Driving license can be issued to the candidate. %b.", obj.isDecision() );
    }
}
