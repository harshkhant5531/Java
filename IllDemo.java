public class IllDemo {
    public static void main(String[] args) {
        B b = new B();
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}

interface A1 {
    static int a = 10;
}

interface A2 {
    static int b = 20;
}

interface A extends A1, A2 {
    int c = a + b;

    static void printSum() {
        System.out.println("the sum of a ans b is" + c);
    }
}

    interface P1 {
        int d=10;
        void methodA1();
    }

    interface P2 {
        int e=20;
        void methodA2();
    }

    interface A12 extends P1, P2 {
        int f=40;
        void methodA12();
    }

class B implements A12 {
    public void methodA1() {
        System.out.println("Method A1 implementation in class B:"+d);
    }

    public void methodA2() {
        System.out.println("Method A2 implementation in class B:"+e);
    }

    public void methodA12() {
        System.out.println("Method A12 implementation in class B:"+f);
    }
}   
