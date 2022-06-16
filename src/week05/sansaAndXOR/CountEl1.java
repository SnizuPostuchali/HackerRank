package week05.sansaAndXOR;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

    public class CountEl1 {
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
            int n = arr.size();
            res.put(arr.get(0), n-2);
            res.put(arr.get(n-1), n-2);
            for(int i = 1; i< arr.size()/2; i++){
                res.put(arr.get(i), res.get(arr.get(i-1)) + n - 2*i);
                res.put(arr.get(arr.size()-i-1), res.get(arr.get(i-1)) + n - 2*i);
            }


            System.out.println(arr);
            System.out.println(res);
        }
    }

