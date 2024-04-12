import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = dt.nextInt(),count=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Your Number is Prime");
        }
        else{
            System.out.println("Your Number is not Prime");
        }

    }
}
