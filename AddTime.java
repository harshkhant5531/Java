public class AddTime {
    public static void main(String[] args) {
        Time t1 = new Time(10,54);
        Time t2 = new Time();
        t1.addition(t1.hr,t2.hr,t1.min,t2.min);
    }
}
class Time{
    int hr,min;
    Time(){
        hr = 12;
        min = 45;
    }
    Time(int h,int m){
        hr = h;
        min = m;
    }
    void addition(int h1,int h2,int m1,int m2){
        int h = h1+h2;
        int m = m1+m2;
        if(m>59){
            h++;
            m=m-60;
        }
        if(h>12){
            h=h-12;
        }
        System.out.println(h+":"+m);
    }
}
