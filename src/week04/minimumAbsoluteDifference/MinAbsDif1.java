package week04.minimumAbsoluteDifference;

import java.util.ArrayList;
import java.util.List;

public class MinAbsDif1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(-2);
        arr.add(8);
        arr.add(3);
        arr.add(12);
        arr.add(-10);
        arr.add(15);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i<arr.size(); i++){
            for (int j = i+1; j<arr.size(); j++){
                int dif = Math.abs(arr.get(i) - arr.get(j));
                if(dif == 0){
                    System.out.println(0);
                    break;
                }
                if(dif<min){
                    min=dif;
                }
            }
        }
        System.out.println(min);
    }
}