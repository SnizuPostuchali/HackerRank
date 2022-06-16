package week02.FlippingMatrix;

import java.util.ArrayList;
import java.util.List;

public class Matrix2 {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> al1 = new ArrayList<Integer>();
        List<Integer> al2 = new ArrayList<Integer>();
        List<Integer> al3 = new ArrayList<Integer>();
        List<Integer> al4 = new ArrayList<Integer>();

        al1.add(112);al1.add(42);al1.add(83);al1.add(119);

        al2.add(56);al2.add(125);al2.add(56);al2.add(49);

        al3.add(15);al3.add(78);al3.add(101);al3.add(43);

        al4.add(62);al4.add(98);al4.add(114);al4.add(108);

        matrix.add(al1);matrix.add(al2);matrix.add(al3);matrix.add(al4);


        int sum = 0;
        int n = matrix.size()/2;
        for(int i = 0; i<n; i++){
            for (int j=0; j<n; j++){
                int val1 = matrix.get(i).get(2*n-j-1);
                int val2 = matrix.get(i).get(j);
                int val3 = matrix.get(2*n-i-1).get(j);
                int val4 = matrix.get(2*n-i-1).get(2*n-j-1);

                sum+=Math.max(val1, Math.max(val2, Math.max(val3, val4)));
            }
        }
        System.out.println(sum);
    }
}
