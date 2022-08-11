package week07.newYearChaos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chaos1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 5, 3, 4));
        minimumBribes(list);
    }

    public static void minimumBribes(List<Integer> list){
        int count=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>i+3){
                System.out.println("Too chaotic");
                return;
            }
        }

        for(int i = list.size()-1; i>=0; i--){
            int index = (list.get(i)-2<0) ? 0 : list.get(i)-2;
            for (int j= index; j<i; j++){
                if (list.get(i)< list.get(j)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
