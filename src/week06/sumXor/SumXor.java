package week06.sumXor;

public class SumXor {
    public static void main(String[] args) {
        long n = 10;

        if(n==0 || n==1){
            System.out.println("Result: " + 1);
        } else {
            long count=0;

            long x = n;
            x |= x>>1;
            x |= x>>2;
            x |= x>>4;
            x |= x>>8;
            x |= x>>16;
            x |= x>>32;
            System.out.println(x);
            x=n^x;
            System.out.println(x);

            while(x!=0){
                count++;
                x &= x-1;
            }
            System.out.println("Count: "+ count);

            long result=1;
            long pow=1;
            for(int i = 1; i<count; i++){
                pow=pow*2;
                result=result+pow;
            }
            System.out.println("Result: " + (result + 1));
        }

    }
}
