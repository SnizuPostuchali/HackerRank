package week07.bombermanGame;

import java.util.ArrayList;
import java.util.List;

public class Bomberman {
    public static void main(String[] args) {
        int n = 3;
        List<String> grid = new ArrayList<>();
        grid.add("....O.");
        grid.add("....O.");
        grid.add("....O.");
        grid.add("....O.");
        grid.add("....O.");

        grid = bomberMan(n, grid);
        for(String a: grid){
            System.out.println(a);
        }
    }


    public static List<String> bomberMan(int n, List<String> grid){
        if(n<2){
            return grid;
        }

        if(n%2==0){
            return filledGrid(grid);
        }

        if(n%4==3){
            return afterExplosion(grid);
        }

        return afterExplosion(afterExplosion(grid));
    }

    public static List<String> filledGrid(List<String> grid){
        int sizeX = grid.get(0).length();
        int sizeY = grid.size();

        List<String> filled = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sizeX; i++){
            sb.append('O');
        }
        for (int j=0; j<sizeY; j++){
            filled.add(sb.toString());
        }
        return filled;
    }

    public static List<String> afterExplosion(List<String> grid){
        List<String> after = new ArrayList<>();
        for(int i=0; i<grid.size(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<grid.get(0).length(); j++){
                if(noBombsNear(grid, j, i)){
                    sb.append('O');
                } else {
                    sb.append('.');
                }
            }
            after.add(sb.toString());
        }
        return after;
    }

    public static boolean onGrid(List<String> grid, int x, int y){
        return x>=0 && x<grid.get(0).length() && y>=0 && y<grid.size();
    }

    public static boolean noBombsNear(List<String> grid, int x, int y){
        return  !isBomb(grid, x, y) &&
                !isBomb(grid, x-1, y) &&
                !isBomb(grid, x+1, y) &&
                !isBomb(grid, x, y-1) &&
                !isBomb(grid, x, y+1);
    }

    public static boolean isBomb(List<String> grid, int x, int y){
        return onGrid(grid, x, y) && grid.get(y).charAt(x)=='O';
    }
}
