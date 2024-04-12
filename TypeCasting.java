import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
       Scanner DT = new Scanner(System.in);
       System.out.print("Enter num1 : ");
       int a = DT.nextInt();
       System.out.print("Enter num2 : ");
       int b = DT.nextInt();
       System.out.print("Enter num3 : ");
       int c = DT.nextInt();
       Double per = ((a+b+c)/300.0)*100; 
       System.out.println("Percentage = "+per);
    }
}
