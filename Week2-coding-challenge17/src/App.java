import com.mypackage.Method;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Method med = new Method();
        System.out.println("10 after leftshift : " + med.performLeftShift());
        med.performRightShift(45, 4);
        System.out.println("Output " + med.output);

    }
}
