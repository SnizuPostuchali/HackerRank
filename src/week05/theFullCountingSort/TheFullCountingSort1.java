package week05.theFullCountingSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TheFullCountingSort1 {
    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();
//        arr.add(new ArrayList<>(Arrays.asList("0", "ab")));
//        arr.add(new ArrayList<>(Arrays.asList("6", "cd")));
//        arr.add(new ArrayList<>(Arrays.asList("0", "ef")));
//        arr.add(new ArrayList<>(Arrays.asList("6", "gh")));
//        arr.add(new ArrayList<>(Arrays.asList("4", "ij")));
//        arr.add(new ArrayList<>(Arrays.asList("0", "ab")));
//        arr.add(new ArrayList<>(Arrays.asList("6", "cd")));
//        arr.add(new ArrayList<>(Arrays.asList("0", "ef")));
//        arr.add(new ArrayList<>(Arrays.asList("6", "gh")));
//        arr.add(new ArrayList<>(Arrays.asList("0", "ij")));
//        arr.add(new ArrayList<>(Arrays.asList("4", "that")));
//        arr.add(new ArrayList<>(Arrays.asList("3", "be")));
//        arr.add(new ArrayList<>(Arrays.asList("0", "to")));
//        arr.add(new ArrayList<>(Arrays.asList("1", "be")));
//        arr.add(new ArrayList<>(Arrays.asList("5", "question")));
//        arr.add(new ArrayList<>(Arrays.asList("1", "or")));
//        arr.add(new ArrayList<>(Arrays.asList("2", "not")));
//        arr.add(new ArrayList<>(Arrays.asList("4", "is")));
//        arr.add(new ArrayList<>(Arrays.asList("2", "to")));
//        arr.add(new ArrayList<>(Arrays.asList("4", "the")));
//        for(int i = 0; i< arr.size(); i++){
//            System.out.println(arr.get(i).get(0) + " " + arr.get(i).get(1));
//        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Master\\Desktop\\X\\readArray.txt"));
            String str;
            while ((str= reader.readLine())!=null){
                arr.add(new ArrayList<>(Arrays.asList(str.split(" "))));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(arr);

        countSort(arr);
    }

    public static void countSort(List<List<String>> arr){
        Map<Integer, String> result = new HashMap<>();

        int size = arr.size()/2;
        List<String> temp;
        for(int i = 0; i<arr.size(); i++){
            temp = arr.get(i);
            if(i<size){
                temp.set(1, "-");
            }
            int x = Integer.parseInt(temp.get(0));
            if(result.containsKey(x)){
                result.put(x, result.get(x) + " " + temp.get(1));
            } else {
                result.put(x, temp.get(1));
            }
        }

        for(Map.Entry<Integer, String> entry: result.entrySet()){
            System.out.print(entry.getValue() + " ");
        }
    }
}

