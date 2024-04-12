import java.util.Scanner;
public class StrLength {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = dt.next();
        String str1 = "";
        int n = str.length();
        System.out.println("Your string length is = "+n);
        n=n/2;
        for(int i=n;i<str.length();i++){
                System.out.print(str.charAt(i)+str1);
        }
    }
}
