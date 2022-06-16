package week06.balancedSums;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BalancedSums3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Master\\Desktop\\X\\balancedSums.txt"));) {
            list = Stream.of(reader.readLine().split(" "))
                    .map(s -> Integer.parseInt(s))
                    .collect(toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(list);
        System.out.println(balancedSums(list));
    }

    static String balancedSums(List<Integer> arr) {
        int firstSum = 0;
        int secondSum = arr.stream().mapToInt(x -> x).sum()-arr.get(0);
        for(int i = 0; i< arr.size(); i++){
            if(2*firstSum == secondSum - arr.get(i)){
                return "YES";
            }
            firstSum+= arr.get(i);
        }

        return "NO";
    }
}


