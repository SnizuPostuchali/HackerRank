package week04.leftRotation;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class LeftRotation {
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

        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(arr.size(), false, arr);

        for(int i=0; i<d; i++){
            int temp = queue.poll();
            queue.add(temp);
        }
        arr.clear();
        System.out.println(queue);

        for(int j = 0; j< arr.size(); j++){
            arr.add(queue.poll());
        }
        System.out.println(arr);
    }
}
