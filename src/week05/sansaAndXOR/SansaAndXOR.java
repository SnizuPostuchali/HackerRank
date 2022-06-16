package week05.sansaAndXOR;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SansaAndXOR {
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
        System.out.println(sansaXor(list));
    }

    public static int sansaXor(List<Integer> arr) {
        int result = 0;
        if(arr.size()%2==1){
            for(int i = 0; i<arr.size(); i+=2){
                result = result ^ arr.get(i);
            }
        }

        return result;
    }

}
