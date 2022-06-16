package week05.theFullCountingSort;

import java.util.*;

public class TheFullCountingSort {
    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList("0", "ab")));
        arr.add(new ArrayList<>(Arrays.asList("6", "cd")));
        arr.add(new ArrayList<>(Arrays.asList("0", "ef")));
        arr.add(new ArrayList<>(Arrays.asList("6", "gh")));
        arr.add(new ArrayList<>(Arrays.asList("4", "ij")));
        arr.add(new ArrayList<>(Arrays.asList("0", "ab")));
        arr.add(new ArrayList<>(Arrays.asList("6", "cd")));
        arr.add(new ArrayList<>(Arrays.asList("0", "ef")));
        arr.add(new ArrayList<>(Arrays.asList("6", "gh")));
        arr.add(new ArrayList<>(Arrays.asList("0", "ij")));
        arr.add(new ArrayList<>(Arrays.asList("4", "that")));
        arr.add(new ArrayList<>(Arrays.asList("3", "be")));
        arr.add(new ArrayList<>(Arrays.asList("0", "to")));
        arr.add(new ArrayList<>(Arrays.asList("1", "be")));
        arr.add(new ArrayList<>(Arrays.asList("5", "question")));
        arr.add(new ArrayList<>(Arrays.asList("1", "or")));
        arr.add(new ArrayList<>(Arrays.asList("2", "not")));
        arr.add(new ArrayList<>(Arrays.asList("4", "is")));
        arr.add(new ArrayList<>(Arrays.asList("2", "to")));
        arr.add(new ArrayList<>(Arrays.asList("4", "the")));

        for(int i = 0; i<arr.size()/2; i++){
            arr.get(i).set(1, "-");
        }

        Map<Integer, String> result = new HashMap<>();
        for(int i = 0; i<arr.size(); i++){
            int x = Integer.parseInt(arr.get(i).get(0));
            String s = arr.get(i).get(1);
            if(result.containsKey(x)){
                result.put(x, result.get(x) + " " + s);
            } else {
                result.put(x, s);
            }
        }
        for(Map.Entry<Integer, String> entry: result.entrySet()){
            System.out.print(entry.getValue() + " ");
        }

    }
}
