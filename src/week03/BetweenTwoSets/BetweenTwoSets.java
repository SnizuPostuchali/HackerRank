package week03.BetweenTwoSets;

import java.util.*;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);
        Collections.sort(a);
        Collections.sort(b);

        int result=0;

        List<Integer> list1 = new ArrayList<>();
        for (int j = a.get(a.size() - 1); j <= b.get(0); j++) {
            list1.add(j);
        }

        for (int i = 0; i < a.size(); i++) {
            list1 = getSubList(list1, a.get(i));
        }
        System.out.println(list1);
        kLoop: for (int k = 0; k<list1.size(); k++){
            for(int l = 0; l<b.size(); l++){
                if(b.get(l)%list1.get(k)!=0){
                    continue kLoop;
                }
            }
            result++;
        }
        System.out.println(result);

    }

    public static List<Integer> getSubList(List<Integer> list, int factor) {
        List<Integer> subResult = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % factor == 0) {
                subResult.add(list.get(i));
            }
        }
        return subResult;
    }
}
