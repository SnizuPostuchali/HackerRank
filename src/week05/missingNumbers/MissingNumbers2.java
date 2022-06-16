package week05.missingNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumbers2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> brr = new ArrayList<>(Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204, 206));
        List<Integer> missing = new ArrayList<>();

        for(int i=0; i<brr.size(); i++){
            int a = brr.get(i);
            if(Collections.frequency(arr, a)<Collections.frequency(brr, a) && !missing.contains(a)){
                missing.add(a);
            }
        }
        Collections.sort(missing);
        System.out.println(missing);
    }
}
