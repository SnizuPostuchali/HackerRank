package week01.SparseArrays;

import java.util.*;

public class SparseArrays {

    public static void main(String[] args) {
        Map<String, Integer> stringsMap = new HashMap<>();
        int[] array = new int[10];
        List<String> strings = new ArrayList<>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");
        List<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

        List<Integer> result = new ArrayList<>();


        for(int i = 0; i<strings.size(); i++){
            String elem = strings.get(i);
            if(stringsMap.containsKey(elem)){
                int count = stringsMap.get(elem);
                stringsMap.put(elem, count+1);
            } else {
                stringsMap.put(elem, 1);
            }
        }

        for(int j=0; j<queries.size(); j++){
            String que = queries.get(j);
            if(stringsMap.containsKey(que)){
                result.add(stringsMap.get(que));
                array[j] = stringsMap.get(que);
            } else {
                result.add(0);
                array[j] = 0;
            }
        }
    }
}
