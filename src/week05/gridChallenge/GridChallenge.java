package week05.gridChallenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GridChallenge {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Master\\Desktop\\X\\grid.txt"));
            String str;
            while ((str= reader.readLine())!=null){
                arr.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(arr);

        System.out.println(gridChallenge(arr));
    }

    public static String gridChallenge(List<String> grid){
        int size = grid.size();
        if(size<2){
            return "YES";
        }
        int length = grid.get(0).length();
        char[][] chars = new char[size][];

        for(int i = 0; i<grid.size(); i++){
            char[] line = grid.get(i).toCharArray();
            Arrays.sort(line);
            chars[i] = line;
        }

        for(int n = 0; n<size; n++){
            for(int m = 1; m<length; m++){
                if(chars[m][n]<chars[m-1][n]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
