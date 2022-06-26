package week06.formingMagicSquare;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FormingMagicSquare{

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try(BufferedReader reader =
                    new BufferedReader(new FileReader("K:\\java_projects\\IdeaProjects\\hackerrank\\magic_square.txt"));)
        {
            list = Stream.of(reader.readLine().split(" "))
                    .map(s -> Integer.parseInt(s))
                    .collect(toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);

        List<List<Integer>> magicSquare = new ArrayList<>();
        for(int i=0; i<9; i+=3){
            magicSquare.add(list.subList(i, i+3));
        }

        int minCost = cost(magicSquare);

        for(int i=0; i<3; i++){
            magicSquare = rotate(magicSquare);
            minCost = Math.min(minCost, cost(magicSquare));
        }

        magicSquare = reflect(magicSquare);
        minCost = Math.min(minCost, cost(magicSquare));

        for(int i=0; i<3; i++){
            magicSquare = rotate(magicSquare);
            minCost = Math.min(minCost, cost(magicSquare));
        }

        System.out.println(minCost);
    }

    private static int cost(List<List<Integer>> square){
        int[][] trueMagSquare = {{8, 3, 4},{1, 5, 9},{6, 7, 2}};
        int cost = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                cost+=Math.abs(square.get(i).get(j) - trueMagSquare[i][j]);
            }
        }
        System.out.println(cost);
        return cost;
    }

    private static List<List<Integer>> reflect(List<List<Integer>> square){
        List<List<Integer>> reflectedSquare = new ArrayList<>();
        reflectedSquare.add(Arrays.asList(0, 0, 0));
        reflectedSquare.add(Arrays.asList(0, 0, 0));
        reflectedSquare.add(Arrays.asList(0, 0, 0));

        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                reflectedSquare.get(i).set(j, square.get(j).get(i));
            }
        }
        System.out.println(reflectedSquare);
        return reflectedSquare;
    }

    private static List<List<Integer>> rotate(List<List<Integer>> square){
        List<List<Integer>> rotatedSquare = new ArrayList<>();
        rotatedSquare.add(Arrays.asList(0, 0, 0));
        rotatedSquare.add(Arrays.asList(0, 0, 0));
        rotatedSquare.add(Arrays.asList(0, 0, 0));

        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                rotatedSquare.get(i).set(j, square.get(2-j).get(i));
            }
        }
        System.out.println(rotatedSquare);
        return rotatedSquare;
    }
}
