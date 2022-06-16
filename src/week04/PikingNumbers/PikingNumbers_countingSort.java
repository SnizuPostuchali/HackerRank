package week04.PikingNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PikingNumbers_countingSort {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(5);
        a.add(5);
        int[] counter = new int[100];
        int max = 0;
        int sum = 0;

        for(int i = 0; i<a.size(); i++){
            counter[a.get(i)]++;
        }


        for(int j=0; j<counter.length-1; j++){
            sum = counter[j] + counter[j+1];
            if(sum>max){
                max=sum;
            }
        }

        System.out.println(max);

    }
}
