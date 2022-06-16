package week02.LonelyInteger;

import java.util.ArrayList;
import java.util.List;

public class Lonely2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 3, 2, 1, 6, 5, 6, 5};
        List<Integer> list = new ArrayList<>();
        for(int j=0; j<array.length; j++){
            list.add(array[j]);
        }

        int a = 0;
        for (int b: list) {
            a^=b;
        }
        System.out.println(a);
    }
}
