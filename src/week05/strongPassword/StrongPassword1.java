package week05.strongPassword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword1 {
    public static void main(String[] args) {
        String password = "A98#+";
        String [] patterns = {"\\p{Lower}", "\\p{Upper}", "\\p{Digit}", "[!@#$%^&*()\\-+]"};
        int lettersToAdd = 0;
        for(String regex: patterns){
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(password);
            boolean flag = m.find();
            if(!flag){
                lettersToAdd++;
            }
        }
        System.out.println(Math.max(lettersToAdd, 6 - password.length()));
    }
}
