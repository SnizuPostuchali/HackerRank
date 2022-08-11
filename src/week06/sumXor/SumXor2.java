package week06.sumXor;

public class SumXor2 {
    public static void main(String[] args) {
        long n = 10;
        long count=0;

        if(n==0){
            System.out.println(1);
        }

        long x = n;
        x |= x>>1;
        x |= x>>2;
        x |= x>>4;
        x |= x>>8;
        x |= x>>16;
        x |= x>>32;
        x=n^x;

        while(x!=0){
            count++;
            x &= x-1;
        }

        System.out.println(Math.pow(2, count));
    }
}
