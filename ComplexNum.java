public class ComplexNum {
    public static void main(String[] args) {
        Complex n1 = new Complex();
        Complex n2 = new Complex(8, 5);
        n1.addition(n1,n2);
    }
}
class Complex{
    double r;
    double i;

    Complex(){
        r=10;
        i=5;
    }
    Complex(double rn, double in){
        r=rn;
        i=in;
    }
    static void addition(Complex n1, Complex n2){
        double r = n1.r+n2.r;
        double i = n1.i+n2.i;
        System.out.println("The ans is "+r+" + "+i+"i");
    }
}


