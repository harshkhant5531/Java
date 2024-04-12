public class InheritenceDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pratyush", 18, 985786987, "Rajkot", 20000, "java");
        Manager m1 = new Manager("Dhaval", 19, 982423844, "Rajkot", 50000, "B.Tech");
        System.out.println("Employee Details : ");
        e1.printDetails();
        System.out.println("");
        System.out.println("Manager Details : ");
        m1.printDetails();
      }
    } 
class Member{
    String name;
    int age;
    long phoneNo;
    String address;
    double salary;

    void printSalary(double s){
        salary = s;
        System.out.println("The salary is : "+salary);
    }

    void printDetails(){
        System.out.println("The name is : "+name);
        System.out.println("The age is : "+age);
        System.out.println("The phoneNo is : "+phoneNo);
        System.out.println("The address is : "+address);
        printSalary(salary);
    }
}

class Employee extends Member{
    String specialization;

    Employee(String name,int age,long phoneNo,String address,double salary,String specialization){
        super.name = name;
        super.age = age;
        super.phoneNo = phoneNo;
        super.address = address;
        super.salary = salary;
        this.specialization = specialization;
    }
    void printDetails(){
        super.printDetails();
        System.out.println("The specialization of Employee is : "+specialization);
    }
}

class Manager extends Member{
    String department; 

    Manager(String name,int age,long phoneNo,String address,double salary,String department){
        super.name = name;
        super.age = age;
        super.phoneNo = phoneNo;
        super.address = address;
        super.salary = salary;
        this.department = department;
    }

    void printDetails(){
        super.printDetails();
        System.out.println("The department of Manager is : "+department);
    }
}

