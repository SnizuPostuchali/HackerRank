package week03.SalesByMatch;

import java.util.*;

public class SalesByMatch1 {
    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(2);
        ar.add(2);
        ar.add(3);
        ar.add(2);
        int pairs = 0;

        long start = System.nanoTime();

        Set<Integer> st = new HashSet<Integer>(ar);

        for(Integer val: st){
            pairs+=(Collections.frequency(ar, val))/2;
        }
        long finish = System.nanoTime();
        System.out.println(finish-start);

        System.out.println(pairs);

    }
}
