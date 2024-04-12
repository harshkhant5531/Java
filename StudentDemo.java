import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getInfo();
    }
}

class Student {
    int idnum;
    int ns;
    double spi;

    void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter student's id number");
        idnum = sc.nextInt();
        System.out.println("plese enter total subjects");
        ns = sc.nextInt();
        String subjectName[] = new String[ns];
        double credits[] = new double[ns];
        String grade[] = new String[ns];
        int gradepts[] = new int[ns];
        for (int i = 0; i < subjectName.length; i++) {
            System.out.println("plese enter " + (i + 1) + "th's subjerct");
            subjectName[i] = sc.next();
        }
        System.out.print("the total subject name is:(");
        for (int i = 0; i < subjectName.length; i++) {
            System.out.print(subjectName[i]);
            if (i < subjectName.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(")");
        for (int i = 0; i < credits.length; i++) {
            System.out.println("plese enter " + (i + 1) + "th's credit");
            credits[i] = sc.nextInt();
        }
        System.out.println("here is your choise:-(o,a+,a,b+,b,c,p,f)");
        for (int i = 0; i < grade.length; i++) {
            System.out.println("plese enter " + (i + 1) + "th's grade");
            grade[i] = sc.next();
            switch (grade[i]) {
                case "o":
                    gradepts[i] = 10;
                    break;
                case "a+":
                    gradepts[i] = 9;
                    break;
                case "a":
                    gradepts[i] = 8;
                    break;
                case "b+":
                    gradepts[i] = 7;
                    break;
                case "b":
                    gradepts[i] = 6;
                    break;
                case "c":
                    gradepts[i] = 5;
                    break;
                case "p":
                    gradepts[i] = 4;
                    break;
                case "f":
                    gradepts[i] = 0;
                    break;
                default:
                    break;
            }
        }
        sc.close();
        System.out.print("the total subject name is : (");
        for (int i = 0; i < subjectName.length; i++) {
            System.out.print(subjectName[i]);
            if (i < subjectName.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(")");
        System.out.print("the cradit is : (");
        for (int i = 0; i < subjectName.length; i++) {
            System.out.print(credits[i]);
            if (i < subjectName.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(")");
        System.out.print("the grade is : (");
        for (int i = 0; i < subjectName.length; i++) {
            System.out.print(grade[i]);
            if (i < subjectName.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(")");
        System.out.print("the grade point is : (");
        for (int i = 0; i < subjectName.length; i++) {
            System.out.print(gradepts[i]);
            if (i < subjectName.length - 1) {
                System.out.print(",");
            }
        }
        int ans = 0;
        double totalcr = 0;
        System.out.println(")");
        for (int i = 0; i < subjectName.length; i++) {
            ans += credits[i] * gradepts[i];
            totalcr += credits[i];
        }
        spi = ans / totalcr;
        System.out.println("your total spi is : " + spi);
    }
}
