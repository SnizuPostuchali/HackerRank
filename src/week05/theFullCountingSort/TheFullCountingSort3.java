package week05.theFullCountingSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TheFullCountingSort3 {

    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();

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
        TreeMap<Integer, List<String>> map = new TreeMap<>();

        for(int i = 0; i< arr.size(); i++){
            int x = Integer.parseInt(arr.get(i).get(0));
            String s = (i<arr.size()/2) ? "- " : (arr.get(i).get(1)+" ");
            if(map.containsKey(x)){
                map.get(x).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(x, list);
            }
        }

        String result = map.values().stream().flatMap(Collection::stream).reduce("", String::concat);

        System.out.println(result);
    }
}
