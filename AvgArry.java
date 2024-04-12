import java.util.Scanner;
public class AvgArry{
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        int[] a = new int[4];
        System.out.println("enter an arry element : ");
        for(int i=0;i<4;i++){
            a[i] = dt.nextInt();
        }
        int sum=0;
        for(int i=0;i<4;i++){
            sum=sum+a[i];
        }
        double avg = (double)sum/4;
        System.out.println(avg);
         
    }
}