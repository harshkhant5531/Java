import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        p1.getCordiAndDis();
        p1.getAnotherCordiAndDis();
        MyPoint p2 = new MyPoint(2, 4);
        p2.getCordiAndDis();
        ThreeDPoint t1 = new ThreeDPoint();
        t1.getCordiAndDisTh();
        t1.getAnotherCordiAndDisTh();
        ThreeDPoint t2 = new ThreeDPoint(2, 4, 5);
        t2.getCordiAndDisTh();
    }
}

class MainCordi {
    double x;
    double y;
    double z;
    double cx;
    double cy;
    double cz;
    double acx;
    double acy;
    double acz;
    Scanner sc = new Scanner(System.in);

    void getDist() {
        double square = (cx * cx) + (cy * cy);
        double dist = Math.sqrt(square);
        System.out.println("the distance between point and 0 is:-" + dist);
    }

    void getDistOther() {
        double square = ((cx - x) * (cx - x)) + ((cy - y) * (cy - cy));
        double dist = Math.sqrt(square);
        System.out.println("the distance with constructor is:-" + dist);
    }

    void getDistAnother() {
        double square = ((acx - cx) * (acx - cx)) + ((acy - cy) * (acy - cy));
        double dist = Math.sqrt(square);
        System.out.println("the distance between one point and another point is:-" + dist);
    }

    void getDistTh() {
        double square = (cx * cx) + (cy * cy) + (cz * cz);
        double dist = Math.sqrt(square);
        System.out.println("the distance between point and 0 is:-" + dist);
    }

    void getDistOtherTh() {
        double square = ((cx - x) * (cx - x)) + ((cy - y) * (cy - cy)) + ((cz - z) * (cz - cz));
        double dist = Math.sqrt(square);
        System.out.println("the distance with constructor is:-" + dist);
    }

    void getDistAnotherTh() {
        double square = ((acx - cx) * (acx - cx)) + ((acy - cy) * (acy - cy)) + ((acz - cz) * (acz - cz));
        double dist = Math.sqrt(square);
        System.out.println("the distance between one point and another point is:-" + dist);
    }
}

class MyPoint extends MainCordi {
    MyPoint() {
        super.x = 0;
        super.y = 0;
    }

    MyPoint(double x, double y) {
        super.x = x;
        super.y = y;
        double square = (super.x * super.x) + (super.y * super.y);
        double dist = Math.sqrt(square);
        System.out.println("the distance between one point and 0 with parameterised constructor is:-" + dist);
    }

    void getCordiAndDis() {
        System.out.println("plese enter x cordinates");
        super.cx = sc.nextInt();
        System.out.println("plese enter y cordinates");
        super.cy = sc.nextInt();
        if (super.x != 0 && super.y != 0) {
            getDistOther();
        } else {
            getDist();

        }
    }

    void getAnotherCordiAndDis() {
        System.out.println("plese enter another x cordinates");
        super.acx = sc.nextInt();
        System.out.println("plese enter another y cordinates");
        super.acy = sc.nextInt();
        getDistAnother();
    }
}

class ThreeDPoint extends MainCordi {
    ThreeDPoint() {
        super.x = 0;
        super.y = 0;
        super.z = 0;
    }

    ThreeDPoint(double x, double y, double z) {
        super.x = x;
        super.y = y;
        super.z = z;
        double square = (super.x * super.x) + (super.y * super.y) + (super.z * super.z);
        double dist = Math.sqrt(square);
        System.out.println("the distance between one point and 0 with parameterised constructor is:-" + dist);
    }

    void getCordiAndDisTh() {
        System.out.println("plese enter x cordinates");
        super.cx = sc.nextInt();
        System.out.println("plese enter y cordinates");
        super.cy = sc.nextInt();
        System.out.println("plese enter z cordinates");
        super.cy = sc.nextInt();
        if (super.x != 0 && super.y != 0 && super.z != 0) {
            getDistOtherTh();
        } else {
            getDistTh();

        }
    }

    void getAnotherCordiAndDisTh() {
        System.out.println("plese enter another x cordinates");
        super.acx = sc.nextInt();
        System.out.println("plese enter another y cordinates");
        super.acy = sc.nextInt();
        System.out.println("plese enter another z cordinates");
        super.acz = sc.nextInt();
        getDistAnotherTh();
    }
}