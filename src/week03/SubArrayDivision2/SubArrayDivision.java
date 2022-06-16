package week03.SubArrayDivision2;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        int d = 4;
        int m = 2;
        int count = 0;

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);

        for(int i=0; i<=list.size()-m; i++){
            int sum = 0;
            for(int j=i; j<i+m; j++){
                sum+=list.get(j);
            }
            if(sum==d){
                count++;
            }
        }

        System.out.println(count);

    }
}
