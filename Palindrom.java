import java.util.Scanner;
public class Palindrom {
public static void main(String[] args) {
    Scanner dt = new Scanner(System.in);
    System.out.println("enter a string : ");
    String a = dt.next();
    String NewStr = "";
    for(int i=a.length()-1;i>=0;i--){
        NewStr = NewStr+a.charAt(i);
    }
    if(a.equals(NewStr)){
        System.out.println("Your String is Palindrom.");
    }
    else{
        System.out.println("Your String is not Palindrom.");
    }
}
    
}
