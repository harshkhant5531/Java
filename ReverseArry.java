import java.util.Scanner;
public class ReverseArry {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.println("enter arry  size : ");
        int n = dt.nextInt();
        int a[] = new int[n];
        System.out.println("enter an arry element :  ");
        for(int i=0;i<n;i++){
            a[i] = dt.nextInt();
        }
        System.out.println("Reverse arry is : ");
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
        
    }
}
