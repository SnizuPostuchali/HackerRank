package week04.SeparateTheNumbers;

public class SeparateTheNumbers1 {
    public static void main(String[] args) {
        String s = "99100";

        String st = "";
        boolean result = false;

        for(int i = 1; i<=s.length()/2; i++){
            st = s.substring(0, i);
            long num = Long.parseLong(st);
            String comp = new String(st);
            System.out.println(comp);
            while (comp.length()<s.length()){
                num++;
                comp+=num;
            }
            if(s.equals(comp)){
                result = true;
                break;
            }
        }
        System.out.println((result)? ("YES " + st): "NO");
    }
}
