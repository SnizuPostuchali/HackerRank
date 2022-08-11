package week06.counterGame;

public class CounterGame {
    public static void main(String[] args) {
        System.out.println(counterGame(153584l));
    }

    public static String counterGame(long n) {
        int count = 0;
        while(n>1){
            count++;
            long x = n;
            x |= x>>1;
            x |= x>>2;
            x |= x>>4;
            x |= x>>8;
            x |= x>>16;
            x |= x>>32;
            x=x-(x>>1);

            if(n-x > 0){
                n=n-x;
            } else {
                n=n-(x>>1);
            }
        }

        if(count%2==0){
            return "Richard";
        } else {
            return "Louise";
        }
    }
}
