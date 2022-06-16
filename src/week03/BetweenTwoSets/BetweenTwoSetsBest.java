package week03.BetweenTwoSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSetsBest {
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

        int l = lcm(a);
        int g = gcd(b);

        int result = 0;

        for(int i = l; i<=g; i+=l){
            if(g%i==0){
                result++;
            }
        }
        System.out.println(result);

    }

    public static int gcd(int x, int y){
        while(y>0){
            int temp = y;
            y=x%y;
            x=temp;
        }
        return x;
    }

    public static int gcd(List<Integer> list){
        int result=list.get(0);
        for (int i=1; i<list.size(); i++){
            result = gcd(result, list.get(i));
        }
        return result;
    }

    public static int lcm(int x, int y){
        return x*(y/gcd(x, y));
    }

    public static int lcm(List<Integer> list){
        int result = list.get(0);
        for (int i=1; i<list.size(); i++){
            result = lcm(result, list.get(i));
        }
        return result;
    }
}
