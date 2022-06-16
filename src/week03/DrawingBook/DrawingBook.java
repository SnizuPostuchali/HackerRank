package week03.DrawingBook;

public class DrawingBook {
    public static void main(String[] args) {
        int n = 13;
        int p = 5;
        int min = 0;
//        int nr = 1;
//        while((n/2)*2>p && nr<p){
//            min++;
//            n-=2;
//            nr+=2;
//        }

        if(p>n/2){
            min = n/2-p/2;
        } else {
            min = p/2;
        }

        System.out.println(min);
    }
}
