package week05.minMax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        int k = 4;

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(15);
        arr.add(18);
        arr.add(12);
        arr.add(6);
        arr.add(4);
        arr.add(9);
        arr.add(25);
        arr.add(26);
        Collections.sort(arr);
        System.out.println(arr);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i<=arr.size()-k; i++)
        {
            int substruction = arr.get(i+k-1) - arr.get(i);
            if(substruction < min){
                min = substruction;
            }
        }
        System.out.println(min);
    }
}
