package week02.LonelyInteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lonely1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1, 6, 5, 6, 5};
        List<Integer> list = new ArrayList<>();
        for(int j=0; j<array.length; j++){
            list.add(array[j]);
        }

        int a = 0;

        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i+=2){
            if (list.get(i)!=list.get(i+1)) {
                a = list.get(i);
                break;
            }
        }

        System.out.println(a);
    }
}
