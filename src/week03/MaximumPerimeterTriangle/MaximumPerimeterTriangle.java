package week03.MaximumPerimeterTriangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {
    public static void main(String[] args) {
        List<Integer> sticks = new ArrayList<>();
        sticks.add(1);
        sticks.add(2);
        sticks.add(3);
        sticks.add(5);
        sticks.add(4);
        List<List<Integer>> sides = new ArrayList<>();
        Collections.sort(sticks);

        for(int i=0; i<sticks.size(); i++){
            List<Integer> search = new ArrayList<>();
            for(int j = i+1; j<sticks.size(); j++){
                for(int k = j+1; k<sticks.size(); k++)
                    if (sticks.get(i)+sticks.get(k)>sticks.get(j)
                        && sticks.get(j)+sticks.get(k)>sticks.get(i)
                        && sticks.get(i)+sticks.get(j)>sticks.get(k)){
                            search.add(sticks.get(i));
                            search.add(sticks.get(j));
                            search.add(sticks.get(k));
                            System.out.println(search);
                            List<Integer> search1 = new ArrayList<>(search);
                            sides.add(search1);
                            search.clear();
                }
            }
        }
        System.out.println(sides);


    }
}
