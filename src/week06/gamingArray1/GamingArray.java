package week06.gamingArray1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class GamingArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Master\\Desktop\\X\\gaming_array.txt"));)
        {
            list = Stream.of(reader.readLine().split(" "))
                    .map(s -> Integer.parseInt(s))
                    .collect(toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        System.out.println(gamingArray(list));
    }


    public static String gamingArray(List<Integer> arr) {
        int maxIndex = arr.size();
        int winIndex = 0;
        while(maxIndex>0){
            arr = arr.subList(0, maxIndex);
            System.out.println(arr);
            int max = 0;
            for(int i=0; i<arr.size(); i++){
                if(arr.get(i)>max){
                    max = arr.get(i);
                }
            }
            maxIndex = arr.indexOf(max);
            winIndex^=1;
        }

        if(winIndex==0){
            return "ANDY";
        } else {
            return "BOB";
        }
    }
}
