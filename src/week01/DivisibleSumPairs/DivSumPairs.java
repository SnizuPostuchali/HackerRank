package week01.DivisibleSumPairs;

import java.util.HashMap;
import java.util.Map;

public class DivSumPairs {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] array = {1, 3, 2, 6, 1, 2, 0, 1};
        int k = 3;
        int count = 0;

        for(int i=0; i<array.length; i++){
            int rem = array[i]%k;
            int diff = k - rem;
            if(diff == k){
                diff=0;
            }
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            if(map.containsKey(rem)){
                int num = map.get(rem);
                map.put(rem, num+1);
            } else {
                map.put(rem, 1);
            }
        }
        System.out.println(count);
    }
}
