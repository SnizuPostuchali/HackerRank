package week05.dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//неясное описание задания

public class DynamicArray {
    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<Integer>(Arrays.asList(1, 0, 5)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, 1, 7)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, 0, 3)));
        queries.add(new ArrayList<Integer>(Arrays.asList(2, 1, 0)));
        queries.add(new ArrayList<Integer>(Arrays.asList(2, 1, 1)));
        int n = 2;
        System.out.println(queries);
        int q = queries.size();

        int [][] arr = new int[n][];
        System.out.println(arr);
        int lastAnswer = 0;

        for(int i = 0; i<q; i++){

        }

    }
}
