package week05.sansaAndXOR;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CountEl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Master\\Desktop\\X\\intList.txt"));) {
            list = Stream.of(reader.readLine().split(" "))
                    .map(s -> Integer.parseInt(s))
                    .collect(toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        count(list);
    }

    static void count(List<Integer> arr){
        Map<Integer, Integer> res = new HashMap<>();
        System.out.println(arr.size());
        for(int i = 1; i<arr.size()-1; i++){
            for(int m = 0, n = arr.size()-i; m<=i; m++, n++){
                for(int j = m; j<n; j++){
                    if(res.containsKey(arr.get(j))){
                        res.put(arr.get(j), res.get(arr.get(j))+1);
                    } else {
                        res.put(arr.get(j), 1);
                    }
                }
            }
        }
        System.out.println(res);
    }
}
