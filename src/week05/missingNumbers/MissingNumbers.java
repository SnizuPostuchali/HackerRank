package week05.missingNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumbers {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> brr = new ArrayList<>(Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204));
        List<Integer> missing = new ArrayList<>();

        Collections.sort(arr);
        Collections.sort(brr);

        int i=0, j=0;
        while(i< arr.size() && j<brr.size()){
            if(!arr.get(i).equals(brr.get(j)) && !missing.contains(brr.get(j))){
                missing.add(brr.get(j));
            } else {
                i++;
            }
            j++;
        }

        while(j< brr.size()){
            missing.add(brr.get(j));
            j++;
        }
        System.out.println(missing);
    }
}
