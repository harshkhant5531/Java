
import java.util.Scanner;
public class Cal {
    public static void main(String[] args) {
       Scanner dt = new Scanner(System.in);
        System.out.println("enter num1 : ");
        int a = dt.nextInt();
        System.out.println("enter num 2 : ");
        int b = dt.nextInt();
        System.out.println("Enter operator : ");
        char da = dt.next().charAt(0);
        switch (da) {
            case '+':System.out.println("a+b="+(a+b));
                break;
            case '-':System.out.println("a-b="+(a-b));
            break;
            case '*':System.out.println("a*b="+(a*b));
            break;
            case '/':System.out.println("a/b="+((double)a/b)); 
            break;
            default:System.out.println("enter valid operator");
            break;
        }

    }
}
