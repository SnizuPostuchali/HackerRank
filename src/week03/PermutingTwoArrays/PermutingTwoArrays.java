package week03.PermutingTwoArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
    public static void main(String[] args) {
        int k = 9;
        boolean relation = true;
        List<Integer> A = new ArrayList<Integer>();
        A.add(2); A.add(8); A.add(6); A.add(4); A.add(5);

        List<Integer> B = new ArrayList<Integer>();
        B.add(2); B.add(8); B.add(6); B.add(4); B.add(4);

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        for(int i=0; i<A.size(); i++){
            if(A.get(i)+B.get(i)<k){
                relation = false;
                break;
            }
        }
        System.out.println(relation);


    }
}
