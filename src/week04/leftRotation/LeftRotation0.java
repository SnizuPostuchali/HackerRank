package week04.leftRotation;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation0 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        int d = 3;

        List<Integer> list = new ArrayList<>();
//        int [] array = new int[arr.size()];
        int size = arr.size();
        for(int i=0; i<size; i++){
            list.add(arr.get((i+d)%(size)));
//            array[i] = arr.get((i+d)%size);
        }
        System.out.println(list);
//        for(int a: array){
//            System.out.print(a + " ");
//        }
    }
}
