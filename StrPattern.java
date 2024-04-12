import java.util.Scanner;
public class StrPattern {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String  a = dt.next();
        for(int i=0 ; i<a.length() ; i++){
            for(int j=0 ; j<=i ; j++){
                System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
}
