import java.util.Scanner;
public class MaxOf3 {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.println("enter num1 : ");
        int a = dt.nextInt();
        System.out.println("enter num2 : ");
        int b = dt.nextInt();
        System.out.println("enter num3 : ");
        int c = dt.nextInt();
        int Max = ((a>b)?((a>c)?a:c):((b>c)?b:c));
        System.out.println("Maximum Number is "+Max);
    }
    
}
