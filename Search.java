public class Search {
    public static void main(String[] args) {
        String a = String.valueOf(args[0]);
        System.out.println(a);
        if(a.charAt(0)>64 && a.charAt(0)<92){
            System.out.println("This is Uppercase");
        }
        else{
            System.out.println("Not Uppercase");
        }
    }
}
