package week05.fibonacciModified;

import java.math.*;

public class FibonacciModified {
    public static void main(String[] args) {
        BigInteger t1 = BigInteger.valueOf(0);
        BigInteger t2 = BigInteger.valueOf(1);
        int n = 10;

        System.out.println(fibonacci(t1, t2, n));
    }

    static BigInteger fibonacci(BigInteger t1, BigInteger t2, int n){
        BigInteger b = t1.add(t2.multiply(t2));
        if (n>3) {
            return fibonacci(t2, b, n-1);
        } else {
            return b;
        }
    }
}
