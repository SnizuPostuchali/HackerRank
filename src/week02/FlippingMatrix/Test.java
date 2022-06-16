package week02.FlippingMatrix;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();

        List<Integer> al1 = new ArrayList<Integer>();
        List<Integer> al2 = new ArrayList<Integer>();
        List<Integer> al3 = new ArrayList<Integer>();
        List<Integer> al4 = new ArrayList<Integer>();

        al1.add(112);al1.add(42);al1.add(83);al1.add(119);

        al2.add(56);al2.add(125);al2.add(56);al2.add(49);

        al3.add(15);al3.add(78);al3.add(101);al3.add(43);

        al4.add(62);al4.add(98);al4.add(114);al4.add(108);

        a.add(al1);a.add(al2);a.add(al3);a.add(al4);

//        int [][] array;
//        array = new int [a.size()][a.size()];


        for(int i=0; i< a.size(); i++){
            List<Integer> temp = new ArrayList<Integer>();
            temp = a.get(i);
            for(int j=0; j< a.size()/2; j++){
                if(temp.get(j)<temp.get(a.size()-1-j)){
                    temp.set(j, temp.get(a.size()-1-j));
                }
            }
            a.set(i, temp);
        }

        for(int i=0; i< a.size()/2; i++){
            List<Integer> temp = new ArrayList<Integer>();
            temp = a.get(i);
            List<Integer> temp1 = new ArrayList<Integer>();
            temp1 = a.get(a.size()-i-1);
            for(int j=0; j< a.size()/2; j++){
                if(temp.get(j)<temp1.get(j)){
                    temp.set(j, temp1.get(j));
                }
            }
            a.set(i, temp);
        }


        for(int i=0; i< a.size(); i++){
            for(int j=0; j< a.size(); j++){
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println();
        }


//        System.out.println();
//
//        for(int i=0; i< a.size(); i++){
//            for(int j=0; j< a.size(); j++){
//                array[i][j]=a.get(i).get(j);
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }


    }
}
