package week03.MigratoryBirds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(5);
        Map<Integer, Integer> id = new HashMap<>();

        int value = 0;
        int minId = Integer.MAX_VALUE;

        for(int i=0; i<arr.size(); i++){
            if(id.containsKey(arr.get(i))){
                id.put(arr.get(i), id.get(arr.get(i))+1);
            } else {
                id.put(arr.get(i), 1);
            }

            if(id.get(arr.get(i))>value){
                value=id.get(arr.get(i));
                minId=arr.get(i);
            }
            if(id.get(arr.get(i))==value && arr.get(i)<minId){
                minId=arr.get(i);
            }

        }


//        for(Map.Entry<Integer, Integer> entry: id.entrySet()){
//            int getValue = entry.getValue();
//            int getKey = entry.getKey();
//            if(getValue>value){
//                value=getValue;
//                minId=getKey;
//            }
//            if(getValue==value && getKey<minId){
//                minId=getKey;
//            }
//        }
        System.out.println(minId);
    }
}
