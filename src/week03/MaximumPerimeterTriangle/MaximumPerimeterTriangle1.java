package week03.MaximumPerimeterTriangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle1 {
    public static void main(String[] args) {
        List<Integer> sticks = new ArrayList<>();
        sticks.add(1);
        sticks.add(2);
        sticks.add(3);
        sticks.add(5);
        sticks.add(4);
        Collections.sort(sticks);
        for(int i = sticks.size()-3; i>=0; i--){
            if(sticks.get(i)+sticks.get(i+1)>sticks.get(i+2)){
                List<Integer> result = new ArrayList<>();
                result.add(sticks.get(i));
                result.add(sticks.get(i+1));
                result.add(sticks.get(i+2));
                System.out.println(result);
                break;
            }
        }
        System.out.println("-1");
        Collections.singletonList("-1");
    }
}
