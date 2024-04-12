public class ThisKeyword {
    public static void main(String[] args) {
        ThisKeyword a = new ThisKeyword(12);
        a.showNum();
    }
    
    public int num1;

    public ThisKeyword(int num1){
        this.num1 = num1;
    }
    public void showNum(){
        System.out.println("Value of num1 is = "+this.num1);
    }

    
}


