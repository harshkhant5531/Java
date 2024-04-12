import java.util.Scanner;
public class Account {
    public static void main(String[] args) {
        Bank_Account n1 = new Bank_Account();
        n1.getAccountDetails();
        n1.displayAccountDetails();
    }
}
class Bank_Account{
    static int accountNo;
    static String userName;
    static String email;
    static String accountType;
    static double accountBalance;
     
    void getAccountDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account Number : ");
        accountNo  = sc.nextInt();
        System.out.println("Enter your user name : ");
        userName = sc.next();
        System.out.println("Enter your user Email : ");
        email = sc.next();
        System.out.println("Enter your Account Type : ");
        accountType = sc.next();
        System.out.println("Enter your Account Balance : ");
        accountBalance = sc.nextDouble();

    }
    
    void displayAccountDetails(){
        System.out.println("Your Account Number is "+accountNo);
        System.out.println("Your user Name is "+userName);
        System.out.println("Your Email is "+email);
        System.out.println("Your Account Type is "+accountType);
        System.out.println("Your Account Balance is "+accountBalance);
    }
}




