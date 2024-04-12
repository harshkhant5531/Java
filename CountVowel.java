import java.util.Scanner;
public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        Count n = new Count(s);
        sc.close(); 
    }
}
class Count{
    Count(String s){
        int count=0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='q'){
                if (s.charAt(i+1)=='u'){
                    if (s.charAt(i+2)=='i'){
                        if (s.charAt(i+3)=='t'){
                            break;
                        }
                    }
                }
            }
        }
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Vowels in your String = "+count);
    }
}
