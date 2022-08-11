package week06.recursiveDigitSum;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        String str = "123";
        int k = 5;
        System.out.println(superDigit(str, k));
    }


    public static int superDigit(String n, int k) {
        if(n.length()==1 && k==1){
            return Integer.parseInt(n);
        } else {
            long result=0;
            for(int i=0; i<n.length(); i++){
                result+=Character.getNumericValue(n.charAt(i));
            }
            result*=k;
            return superDigit(result+"", 1);
        }
    }
}
