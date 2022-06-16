package week04.minimumAbsoluteDifference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAbsDif {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(-2);
        arr.add(8);
        arr.add(3);
        arr.add(12);
        arr.add(6);
        arr.add(0);

        int min = Integer.MAX_VALUE;

        Collections.sort(arr);

        for(int i = 1; i<arr.size(); i++){
            int dif = Math.abs(arr.get(i-1) - arr.get(i));
            if(min == 0){
                System.out.println(0);
                break;
            }
            if(dif<min){
                min=dif;
            }
        }
        System.out.println(min);
    }
}
