package week06.balancedSums;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


import static java.util.stream.Collectors.toList;

public class BalancedSums1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Master\\Desktop\\X\\balancedSums.txt"));) {
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
        int size = arr.size();
        if(size==1){
            return "YES";
        }
        if(size==3){
            System.out.println("if(size==3)");
            return (arr.get(0).equals(arr.get(2)))? "YES" : "NO";
        }
        if(size>3){
            int firstSum = arr.stream().limit(size/2).reduce((accumulator, element) -> accumulator+element).get();
            System.out.println(firstSum);
            int secondSum = arr.stream().skip(1+size/2).reduce((accumulator, element) -> accumulator+element).get();
            System.out.println(secondSum);

            if(firstSum-secondSum==0){
                System.out.println("if(firstSum-secondSum==0)");
                return "YES";
            }
            if(firstSum-secondSum>0){
                for(int i=size/2; i>0 && firstSum-secondSum>0; i--){
                    firstSum-= arr.get(i-1);
                    secondSum+= arr.get(i);
                    System.out.println(firstSum + " " + secondSum);
                    if(firstSum==secondSum){
                        System.out.println("if(firstSum==secondSum)");
                        return  "YES";
                    }
                }
            } else {
                for(int i=size/2; i<size-1 && firstSum-secondSum<0; i++){
                    firstSum+= arr.get(i);
                    secondSum-= arr.get(i+1);
                    System.out.println(firstSum + " " + secondSum);
                    if(firstSum==secondSum){
                        System.out.println("if(firstSum==secondSum)");
                        return  "YES";
                    }
                }
            }
        }
        return "NO";
    }
}
