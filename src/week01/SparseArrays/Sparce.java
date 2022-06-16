package week01.SparseArrays;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sparce {

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

        strings.stream().forEach(el -> {
                            if(stringsMap.containsKey(el)){
                                stringsMap.put(el, stringsMap.get(el)+1);
                            } else {
                                stringsMap.put(el, 1);
                            }
                        });

        queries.stream().forEach(que -> {
                            if(stringsMap.containsKey(que)){
                                result.add(stringsMap.get(que));
                            } else {
                                result.add(0);
                            }
                        });
    }
}
