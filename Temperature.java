import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.println("Enter a Fahrenheit : ");
        double f = dt.nextDouble();
        double c = (f-32)*(5/9.0);
        System.out.println("Calsius = "+c);
    }
}
