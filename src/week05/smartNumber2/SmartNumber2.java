package week05.smartNumber2;

public class SmartNumber2 {
    public static void main(String[] args) {
        int num = 331;
        int val = (int)Math.sqrt(num);
        boolean res = false;
        if(val * val == num){
            res = true;
        }
        System.out.println(res);
    }
}
