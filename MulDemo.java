public class MulDemo {
    public static void main(String[] args) {
        try{
            System.out.println(args[0]);
            int x = Integer.parseInt(args[0]);
            System.out.println(args[1]);
            int y = Integer.parseInt(args[1]);
            int ans=1;
        
            if(x==0 && y==0){
                throw new InvalidNum();
            }
            else{
                for(int i=0; i<y; i++){
                    ans=ans*x;
                }
                System.out.println("Your ans is : "+ans);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class InvalidNum extends Exception{
    InvalidNum(){
        super("0 is invalid");
    }
}