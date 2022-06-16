package week06.nim;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Nim {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Master\\Desktop\\X\\nim.txt"));)
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
        System.out.println(misereNim(list));
    }


    public static String misereNim(List<Integer> s) {
        int oneCount = 0;
        for(int i = 0; i<s.size(); i++){
            if(s.get(i)==1){
                oneCount++;
            }
        }
        boolean sameOne = (s.size()==oneCount)? true : false;

        if(sameOne){
            if(s.size()%2==0){
                return "First";
            } else {
                return "Second";
            }
        } else {
            int res = 0;
            for (int a: s){
                res^=a;
            }
            if(res==0){
                return "Second";
            } else {
                return "First";
            }
        }
    }
}
