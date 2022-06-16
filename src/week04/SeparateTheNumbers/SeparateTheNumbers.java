package week04.SeparateTheNumbers;

public class SeparateTheNumbers {
    public static void main(String[] args) {
        String s = "123124";

        boolean result = false;
        String stStart = "";
        int i=1;
        while(!result && i<=s.length()/2){
            stStart = s.substring(0, i);
            result = isBeautiful(stStart, s.substring(i++));
        }
        if(result){
            System.out.println("YES " + stStart);
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isBeautiful(String prev, String s){
        System.out.println(prev + " " + s);
        if(s.length()==0){
            return true;
        }
        String next = String.valueOf(Long.parseLong(prev) + 1);
        if(s.length()<next.length()){
            return false;
        }
        String candidate = s.substring(0, next.length());
        if(candidate.charAt(0)=='0'){
            return false;
        }
        if(next.equals(candidate)){
            return isBeautiful(next, s.substring(next.length()));
        }
        return false;
    }
}
