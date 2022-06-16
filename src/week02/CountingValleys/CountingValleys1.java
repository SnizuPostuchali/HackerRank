package week02.CountingValleys;

public class CountingValleys1 {
    public static void main(String[] args) {
        int steps = 10;
        String path = "DUUUUDDDDU";
        int level = 0;
        int valleys = 0;
        for(int i=0; i<steps; i++){
            if(path.charAt(i)=='U'){
                level+=1;
                if(level==0){
                    valleys+=1;
                }
            } else {
                level-=1;
            }
        }
        System.out.println(valleys);
    }
}
