package week03.SubArrayDivision2;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivivion01 {
    public static void main(String[] args) {
        int d = 4;
        int m = 2;
        int count = 0;
        int result = 0;
        List<Integer> sum = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);

        for (int i = 0; i < m; i++) {
            result += list.get(i);
        }
        sum.add(result);

        for(int j=1; j<= list.size()-m; j++){
            sum.add(sum.get(j-1)-list.get(j-1)+list.get(j+m-1));
        }

        for(Integer a: sum){
            if(a==d){
                count++;
            }
        }

        System.out.println(count);

    }
}
