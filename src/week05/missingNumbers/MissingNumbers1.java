package week05.missingNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumbers1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> brr = new ArrayList<>(Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204, 206));
        List<Integer> missing = new ArrayList<>();

        for(int i=0; i< arr.size(); i++){
            brr.remove(arr.get(i));
        }
        for (int a: brr) {
            if(!missing.contains(a)){
                missing.add(a);
            }
        }
        Collections.sort(missing);
        System.out.println(missing);
    }
}
