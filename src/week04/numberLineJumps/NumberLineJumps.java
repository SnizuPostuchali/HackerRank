package week04.numberLineJumps;

public class NumberLineJumps {
    public static void main(String[] args) {
        int x1 = 5;
        int x2 = 7;
        int y1 = 5;
        int y2 = 5;

        if(y2>=y1){
            System.out.println("NO");
        } else {
            if ((x2 - x1) / (y1 - y2) >= 0 && (x2 - x1) % (y1 - y2) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }
}
