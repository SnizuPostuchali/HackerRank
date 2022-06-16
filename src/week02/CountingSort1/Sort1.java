package week02.CountingSort1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(1);arr.add(1);arr.add(1);
        arr.add(2);arr.add(2);
        arr.add(4);arr.add(4);
        arr.add(6);arr.add(6);arr.add(6);
        System.out.println(arr);

        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        int max = 0;
        for(int i=0; i<arr.size(); i++){
            int key = arr.get(i);
            if(map.containsKey(key)){
                int count = map.get(key);
                map.put(key, count+1);
            } else {
                map.put(key, 1);
            }
            if(key>max){
                max=key;
            }
        }
        for(int j=0; j<=max; j++){
            if(map.containsKey(j)){
                list.add(map.get(j));
            } else {
                list.add(0);
            }
        }
        System.out.println(list);
    }
}
