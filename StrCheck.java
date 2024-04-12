import java.util.Scanner;
public class StrCheck {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.println("eneter a String : ");
        String a = dt.next();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<a.length();i++){
            char d = a.charAt(i);
        
        if(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u'){
             vowel++;
        }
        else{
            consonant++;
        }
    }
        System.out.println("vowels = "+ vowel);
        System.out.println("consonant = "+ consonant);
    }
}
