package week05.theFullCountingSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TheFullCountingSort2 {
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
        StringBuilder [] result = new StringBuilder[100];
        for(int k=0; k<result.length; k++){
            result[k] = new StringBuilder("");
        }

        List<String>temp1;
        TreeSet<Integer> count = new TreeSet<>();
        for(int i = 0; i<arr.size()/2; i++){
            int x = Integer.parseInt(arr.get(i).get(0));
            result[x].append("- ");
            count.add(x);
        }

        for (int i = arr.size()/2; i< arr.size(); i++){
            temp1=arr.get(i);
            int x = Integer.parseInt(temp1.get(0));
            result[x].append(temp1.get(1) + " ");
            count.add(x);
        }

        for(int j = 0; j<=count.last(); j++){
            System.out.print(result[j]);
        }
    }
}


