package week02.CountingSort1;

import java.util.*;

public class Sort2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(1);arr.add(1);arr.add(1);
        arr.add(2);arr.add(2);
        arr.add(4);arr.add(4);
        arr.add(6);arr.add(6);arr.add(6);

        List<Integer> list = new ArrayList<>(Collections.nCopies(10, 0));
        System.out.println(list);


        for(int i=0; i< arr.size(); i++){
            int val = arr.get(i);
            list.set(val, list.get(val)+1);
        }
        System.out.println(list);
    }
}
