import java.util.Scanner;
public class Mark {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.println("enter mark1 : ");
        int m1 = dt.nextInt();
        System.out.println("enter mark2 : ");
        int m2 = dt.nextInt();
        System.out.println("enter mark3 : ");
        int m3 = dt.nextInt();
        System.out.println("enter mark4 : ");
        int m4 = dt.nextInt();
        System.out.println("enter mark5 : ");
        int m5 = dt.nextInt();

        double per = (m1+m2+m3+m4+m5)*100/(double)500;
        if(per>=60){
            System.out.println("First Division");
        }
        else if(per>=50 && per<59){
            System.out.println("Second Division");
        }
        else if(per>=40 && per<49){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
