package week02.FlippingBits;

public class Flip {
    public static void main(String[] args) {
        long n = 1l;
        long res = 0l;

        for(int i=0; i<32; i++){
            long mask = 1l;
            mask = mask<<i;
            if((n&mask)==0){
                res = res | mask;
            }
        }
        System.out.println(res);
    }
}
