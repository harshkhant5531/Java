import java.util.Scanner;
public class AreaClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj1 = new Area();
        double a1 = obj1.circle(10);
        System.out.println(a1);
        double a2 = areaOfRectangle(10,20);
        System.out.println(a2);
    }
    static double areaOfRectangle(int x,int y){
        return x*y;
    }
}
class Area{
    double circle(int r){
        return Math.PI*r*r;
    }
}