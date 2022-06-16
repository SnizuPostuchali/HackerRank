package week02.Pangrams;

import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        String s = "          We promptly judged antique ivory buckles for the prize        ";
        s = s.toLowerCase().replaceAll(" ", "");
        System.out.println(s);

        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        if(set.size()==26){
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
