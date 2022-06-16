package week04.closestNumbers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(9);

        int min = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();

        Collections.sort(arr);

        for(int i = 1; i<arr.size(); i++){
            int dif = Math.abs(arr.get(i-1) - arr.get(i));
            if(dif<=min){
                if (dif != min) {
                    min=dif;
                    result.clear();
                }
                result.add(arr.get(i-1));
                result.add(arr.get(i));
            }
        }
        System.out.println(result);
    }
}
