package week01.CamelCase4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(9);
        arr.add(6);
        arr.add(8);
        arr.add(7);
        arr.add(5);
        arr.add(4);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get((arr.size()/2)));
    }
}
