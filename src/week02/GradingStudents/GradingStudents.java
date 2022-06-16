package week02.GradingStudents;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
    public static void main(String[] args) {
        int[] array = {20, 38, 39, 41, 42, 83};
        List<Integer> grades = new ArrayList<>();
        for(int j=0; j<array.length; j++){
            grades.add(array[j]);
        }
        List<Integer> list = new ArrayList<>();
        list = grades.stream().map(el -> {
            if(el>=38){
                int a = el%5;
                if(a>=3){
                    el=el-a+5;
                }
            }
            return el;
        }).collect(Collectors.toList());

        for(Integer c: list) {
            System.out.println(c);
        }
    }
}
