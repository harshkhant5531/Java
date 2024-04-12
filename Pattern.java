public class Pattern {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int k=2;k>0;k--){
            for(int l=0;l<k;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
