 import java.util.Scanner;
public class AreaOfCircle {
   
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.println("enter a radiasion of circle : ");
        double r = dt.nextDouble();
        double area = Math.PI*(r*r);
        System.out.println(area);
    }
    
}
