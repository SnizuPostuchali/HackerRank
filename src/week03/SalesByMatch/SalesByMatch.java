package week03.SalesByMatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
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

        Map<Integer, Integer> map = new HashMap<>();
        int n = 7;

        for(int i=0; i<n; i++) {
            if (map.containsKey(ar.get(i))) {
                map.put(ar.get(i), map.get(ar.get(i)) + 1);
                if (map.get(ar.get(i)) % 2 == 0) {
                    pairs++;
                }
            } else {
                map.put(ar.get(i), 1);
            }
        }

        long finish = System.nanoTime();
        System.out.println(finish-start);
        System.out.println(pairs);
    }
}
