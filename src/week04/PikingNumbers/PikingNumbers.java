package week04.PikingNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PikingNumbers {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(5);
        a.add(5);
        Collections.sort(a);

        int count = 1;
        int max = 0;

        int k = 0;
        for(int i = 1; i<a.size(); i++){
            if(Math.abs(a.get(k)-a.get(i))<=1){
                count++;
            } else {
                if(count>max){
                    max = count;
                }
                count=1;
                k=i;
            }
        }
        if(count>max){
            max = count;
        }

        System.out.println(max);


//        for (int i=1; i<a.size() ;i++){
//            if(Math.abs(a.get(i)-a.get(i-1))<=1){
//                count++;
//            } else {
//                if(count>max){
//                    max = count;
//                    System.out.println(count);
//                }
//                count = 1;
//            }
//        }
//        if(count>max){
//            max = count;
//        }

    }
}
