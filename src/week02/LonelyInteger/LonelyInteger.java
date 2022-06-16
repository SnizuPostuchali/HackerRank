package week02.LonelyInteger;

import java.util.*;

public class LonelyInteger {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 9, 3, 2, 1, 6, 5, 6, 5};
        List<Integer> list = new ArrayList<>();
        for(int j=0; j<array.length; j++){
            list.add(array[j]);
        }
        Iterator<Integer> iterator = list.iterator();
        HashMap<Integer, Integer> map = new HashMap<>();

        while(iterator.hasNext()){
            int a = iterator.next();
            if(map.containsKey(a)){
                map.put(a, 2);
            } else {
                map.put(a, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }

}
