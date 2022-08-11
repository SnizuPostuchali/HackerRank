package week06.sumXor;

public class SumXor3 {
    public static void main(String[] args) {
        long n = 10;
        long count=0;

        if(n==0){
            System.out.println(1);
        }

        while(n!=0){
            if((n&1) == 0)
                count++;
            n=n>>1;
        }

        System.out.println(Math.pow(2, count));
    }
}
